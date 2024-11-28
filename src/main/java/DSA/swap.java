public class swap {

    public void withTemp(){
        int temp = 0;
        int mysalary = 30;
        int manager = 50;

        System.out.println("before mysal"+mysalary+"manager"+manager);
        temp = mysalary;
        mysalary = manager;
        manager = temp;

        System.out.println("after mysal"+mysalary+"manager"+manager);
    }

    public void withoutTemp(){

        int first = 10;
        int second = 20;

        System.out.println("before first"+first+"second"+second);

        first = first-second;
        second = first+second;
        first = second- first;

        System.out.println("before first"+first+"second"+second);



    }


    public static void main(String args[]){
        swap s = new swap();
        s.withTemp();
        s.withoutTemp();
    }
}
