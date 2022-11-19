package Learn;

public class Dog{
    String name;
    int age;

    // this the default contractor it will call by java when the object (new) is created
    // when we use declare the constructor manually java will call the constructor only
    // it does not create the new constructor
//    public Dog(){
//        System.out.println("I'm defautl constructor");
//    }
//
//    // this is the default constructor but the values are assign to the field
//      public Dog(){
//          name = "mani";
//          age = 24;
//      }
//
//    public Dog(String name){
//        this.name = name;
//    }
//
//    public Dog(int age){
//        this.age = age;
//    }

    // this is the parameterized constructor with two args
    public Dog(String name,int age){
      this.name = "balaji";
      this.age = 23;
    }

}
