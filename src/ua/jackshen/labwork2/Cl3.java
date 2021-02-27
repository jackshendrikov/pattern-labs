package ua.jackshen.labwork2;
/**
 * Class which implements interface "If3", consist field of "If1" type and contain overridden
 * methods "meth2()" and "meth3() which allow to print information about class and method on console"
 *
 * @author Jack Shendrikov
 *
 */
public class Cl3 implements If3{
    /**
     * Field of "If1" type
     */
    public If1 if1;

    /**
     * Method which print information about method in console
     */

    public void meth2(){
        System.out.println("Cl3 meth2()");
    }
    /**
     * Method which print information about method in console
     */

    public void meth3(){ System.out.println("Cl3 meth3()");
    }
}