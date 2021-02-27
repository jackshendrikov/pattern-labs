package ua.jackshen.labwork8;

/**
 * Class implements TestIterator, has constructor and specialization of method
 * first, hasNext,next.
 *
 * @author Jack Shendrikov
 */
public class IteratorBFS implements TestIterator {
    /**
     * Constructor
     */
    public IteratorBFS() {
        System.out.println("Creation iterator by width");
    }

    /**
     * Method that returns first element
     */
    public Integer first() {
        System.out.println("IteratorWidth.first");
        return 0;
    }

    /**
     * Method that define if there is next element
     */
    public Boolean hasNext() {
        System.out.println("IteratorWidth.hasNext");
        return null;
    }

    /**
     * Method that returns next element if it is
     */
    public Integer next() {
        System.out.println("IteratorWidth.next");
        return null;
    }
}
