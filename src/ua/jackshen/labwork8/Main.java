package ua.jackshen.labwork8;

/**
 * Used 'Factory method'
 *
 * @author Jack Shendrikov
 */
public class Main {

    public static void main(String[] args) {
        Composite c = new Composite();
        TestIterator iter1 = c.iteratorDFS();
        TestIterator iter2 = c.iteratorBFS();
    }
}
