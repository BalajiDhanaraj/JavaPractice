import java.util.*;

public class reverseString {

    public void reverseStringInbuild(){

        String res = "Hello world";
        char[] chars = res.toCharArray();
        StringBuffer sb = new StringBuffer();
        sb.append(chars);
        System.out.println(sb.reverse());
    }

    public void ownFunction(){

        String name = "Priyanka";
        char[] chars = name.toCharArray();
        String res = " ";
        for(int i =chars.length-1;i>=0;i--){
            res = res+chars[i];
        }

        System.out.println(res);

    }

    public void usingCollection(){

        String name = "priyanka";
        char[] res = name.toCharArray();
        List<Character> resList = new ArrayList<Character>();
        for (Character ch : res) {
            resList.add(ch);
        }

        Collections.reverse(resList);

        ListIterator lst =  resList.listIterator();
        while (lst.hasNext()){
            System.out.print(lst.next());
        }



    }

    public static void main(String args[]){

        reverseString rs = new reverseString();
        rs.reverseStringInbuild();
        rs.ownFunction();
        rs.usingCollection();



    }

}
