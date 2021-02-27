package ua.jackshen.labwork8;

/**
 * Defines interface for iterators.
 *
 * @author Jack Shendrikov
 */
public interface TestIterator {
    /**
     * Method that returns next element if it is
     */
    public Integer next();

    /**
     * Method that define if there is next element
     */
    public Boolean hasNext();

    /**
     * Method that returns first element
     */
    public Integer first();
}
