package ua.jackshen.labwork2;
/**
 * Class which implements interface "If2", consist field of "Cl1" type and contain overridden
 * methods "meth2() which allow to print information about class and method on console"
 *
 * @author Jack Shendrikov
 *
 */
public class Cl2 implements If2{
    /**
     * Field of "Cl1" type
     */
    public Cl1 cl1;

    /**
     * Method which print information about method in console
     */
    public void meth2(){
        System.out.println("Cl2 meth2()");
    }
}