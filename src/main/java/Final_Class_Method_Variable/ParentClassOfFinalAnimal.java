package Final_Class_Method_Variable;

/// when initialize the make the class as final --> its will prevent the subclasses to inherit
// public final class ParentClassOfFinalAnimal
public  class ParentClassOfFinalAnimal {

    // Declare the Constant in the java
    // final variable --> no one can change or reassign the declared values so we can anywhere we want
    public static final double PI_VALUE =  3.14343;

    // when u declare the method as final --> we cant override the method in child classes to prevent
    // overriding ------> public final void eat(){
    public  void eat(){
        System.out.println("eat");
    }

    public void stopEat(){
        System.out.println("Im Stopped eating");
    }



}
