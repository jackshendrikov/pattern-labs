package ua.jackshen.labwork8;

/**
 * Defines interface for object.
 *
 * @author Jack Shendrikov
 */
public interface Compose {
    /**
     * Method of iterator by depth
     */
    public TestIterator iteratorDFS();

    /**
     * Method of iterator by width
     */
    public TestIterator iteratorBFS();
}
