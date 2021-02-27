package ua.jackshen.labwork5;

/**
 * defines an iterator interface for accessing and traversing elements
 *
 * @author Jack Shendrikov
 *
 */
public interface Iterator {
    /**
     * goes to the next element
     */
    void next();

    /**
     * checks the end of the list
     *
     * @return yes, if it's already over
     */
    boolean isDone();

    /**
     * returns the value of the current position
     *
     * @return value
     */
    int currentItem();


    /**
     * moves the current position to the first
     */
    void first();
}
