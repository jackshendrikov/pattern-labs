package ua.jackshen.labwork2;
/**
 * Class which implements interface "If1", extends "Cl2", consist field of "Cl1" type and contain overridden
 * methods "meth1()" and "meth3() which allow to print information about class and method on console"
 *
 * @author Jack Shendrikov
 *
 */
public class Cl1 extends Cl2 implements If1{
    /**
     * Field of "Cl1" type
     */
    public Cl1 cl1;

    /**
     * Method which print information about method in console
     */

    public void meth1(){
        System.out.println("Cl1 meth1()");
    }

    /**
     * Method which print information about method in console
     */
    public void meth3(){
        System.out.println("Cl1 meth3()");
    }
}

