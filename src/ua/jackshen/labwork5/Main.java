package ua.jackshen.labwork5;

/**
 * @author Jack Shendrikov
 *
 */
public class Main {

    /**
     * Invokes at application startup.
     * @param args parameters from command line
     */
    public static void main(String[] args) {
        int[] list = {12,6,1,4,4,4,3,11,0,2,9,5,18};
        System.out.print("Initial list: ");
        for (int aList : list) System.out.print(aList + " ");
        System.out.println();
        List l = new List(list);
        l.append(19);
        l.remove(1);
        Iterator i = l.createIterator2();
        System.out.print("Sorted list: ");
        while (!i.isDone()) {
            System.out.print(i.currentItem() + " ");
            i.next();
        }
    }
}
