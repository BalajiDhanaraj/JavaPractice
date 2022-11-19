package Final_Class_Method_Variable;

public class ChildClassOfFinal extends ParentClassOfFinalAnimal {


    @Override
    public void eat(){
        System.out.println("Child is eating nwo "+ParentClassOfFinalAnimal.PI_VALUE);
    }

    public void childEatingNow(){
        System.out.println("Child is eating nwo");
    }




}
