package ua.jackshen.labwork5;

/**
 * iterator for sequential traversal in an ordered structure
 *
 * @author Jack Shendrikov
 *
 */
public class Iterator2 implements Iterator {
    /**
     * list
     */
    private List list;
    /**
     * current position
     */
    private int pos;
    private int cpos;

    Iterator2(List list) {
        this.list = list;
        this.pos = 0;
        minimum();
    }

    public void next() {
        if (!isDone()) {
            pos++;
            int pmin = list.getValue(cpos);
            // check the same values
            for (int i = cpos + 1; i < list.count(); i++)
                if (pmin == list.getValue(i)) {
                    cpos = i;
                    return;
                }
            int n = 0;
            int min = 0;
            boolean flag = false;
            for (int i = 0; i < list.count(); i++)
                if (i != cpos && pmin < list.getValue(i)) {
                    if (flag) {
                        if (min > list.getValue(i)) {
                            min = list.getValue(i);
                            n = i;
                        }
                    } else {
                        min = list.getValue(i);
                        n = i;
                        flag = true;
                    }
                }
            cpos = n;
        }
    }

    public boolean isDone() {
        return pos > list.count() - 1;
    }

    public int currentItem() {
        return list.getValue(cpos);
    }

    public void first() {
        minimum();
    }

    private void minimum() {
        int n = 0;
        int min = list.getValue(n);
        for (int i = 1; i < list.count(); i++)
            if (min > list.getValue(i)) {
                n = i;
                min = list.getValue(n);
            }
        cpos = n;
    }
}