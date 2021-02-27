package ua.jackshen.labwork5;

/**
 * iterator for sequential traversal
 *
 * @author Jack Shendrikov
 *
 */
public class Iterator1 implements Iterator {
    /**
     * list
     */
    private List list;
    /**
     * current position
     */
    private int pos;

    Iterator1(List list) {
        this.list = list;
        pos = 0;
    }

    public void first() {
        pos = 0;
    }

    public void next() {
        if (!isDone())
            pos++;
    }

    public boolean isDone() {
        return pos > list.count() - 1;
    }

    public int currentItem() {
        return list.getValue(pos);
    }
}
