package Learn;

public class PassValue {
    final int  c = 10;
    static int Change(int a){
        a = a + 10;
        //System.out.println(a);
        return  a;
    }

    public int chages(int b){
        b = b+100;
        return b;
    }

    public static void Method1(){

    }

    public  void method2() {
        method2();
    }

    public static void main(String[] args) {

        PassValue p = new PassValue();
        int b = 10;
        int ans =  p.chages(b);
        System.out.println("new "+ans);
        int a = 10;
        int val = Change(a);
        System.out.println("copy"+a);

    }
}
