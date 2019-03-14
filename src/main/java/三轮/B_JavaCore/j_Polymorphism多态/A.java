package 三轮.B_JavaCore.j_Polymorphism多态;

/**
 * @author sirius
 * @since 2019/3/14
 */
public class A {
    public void show(D obj){
        System.out.println("A and D");
    }

    public void show(A obj){
        System.out.println("A and A");
    }
}

class B extends A{

    public void show(B obj){
        System.out.println("B and B");
    }

    public void show(A obj){
        System.out.println("B and A");
    }
}

class C extends B{}

class D extends B{}
