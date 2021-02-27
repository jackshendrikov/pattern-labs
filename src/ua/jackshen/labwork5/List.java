package ua.jackshen.labwork5;

/**
 * aggregate - stores integers, creates iterators
 *
 * @author Jack Shendrikov
 *
 */
public class List {
    /**
     * list of integers
     */
    private int[] list;
    /**
     * list size
     */
    private int size;

    /**
     * creates an iterator for sequential traversal
     */
    public Iterator createIterator1() {
        return new Iterator1(this);
    }

    /**
     * creates an iterator for sequential traversal in an ordered list
     */
    Iterator createIterator2() {

        return new Iterator2(this);
    }

    /**
     * the constructor will create a list of 1 values
     */
    public List(int value) {
        list = new int[1];
        size = 1;
        list[0] = value;
    }

    /**
     * constructor
     */
    public List(int[] values) {
        list = values;
        size = list.length;
    }

    /**
     * @return size
     */
    int count() {
        return size;
    }

    /**
     * add value
     */
    public void append(int value) {
        size++;
        int[] buf = new int[size];
        buf[size - 1] = value;
        System.arraycopy(list, 0, buf, 0, size - 1);
        list = buf;
    }

    /**
     * remoce value
     */
    public void remove(int value) {
        int[] buf;
        for (int aList : list) {
            if (aList == value) {
                size--;
            }
        }
        buf = new int[size];
        int j = 0;
        for (int aList : list)
            if (aList != value) {
                buf[j] = aList;
                j++;
            }
        list = buf;
    }

    /**
     * @return value
     */
    public int getValue(int pos) {
        return list[pos];
    }

    /**
     * @return list
     */
    public int[] getList() {
        return list;
    }
}

