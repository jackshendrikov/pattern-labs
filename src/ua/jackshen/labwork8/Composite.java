package ua.jackshen.labwork8;

/**
 * Class implements Compose and has its methods and constructor.
 *
 * @author Jack Shendrikov
 */
public class Composite implements Compose {
    /**
     * Constructor
     */
    Composite() {
        System.out.println("Realization of composite");
    }

    /**
     * Method of iterator by depth
     */
    public TestIterator iteratorDFS() {
        System.out.println("Iterator by Depth");
        return null;
    }

    /**
     * Method of iterator by width
     */
    public TestIterator iteratorBFS() {
        System.out.println("Iterator by Width");
        return null;
    }
}
