package Learn;


public class Const {

    public static void main(String[] args){
//        Dog mydog = new Dog("Hello");
//        System.out.println(mydog.name+" this is one parameter or one args contractor");
//
//        Dog mydogs = new Dog(5);
//        System.out.println(mydogs.age+" this is one parameter or one args contractor");

        Dog set = new Dog("balaji ",23);
        System.out.println(set.name+" "+set.age);

        Dog def = new Dog();
        System.out.println(def.name+" "+def.age);


    }
}
