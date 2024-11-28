import java.awt.*;
import java.util.Scanner;

public class triangle {

    public void trianglePattern(int row,int col,int lines,String pat){

        for (row=0;row<lines;row++){
            for (col=0;col<=row;col++){
                System.out.print(" "+pat+" ");
            }
            System.out.println(" ");
        }

    }
    public void numberPattern(int rows,int cols,int liness,int starting){

        for (rows=0;rows<liness;rows++){
            for (cols=0;cols<=rows;cols++){
                System.out.print(" "+starting+" ");
                starting++;
            }
            System.out.println(" ");
        }
    }

    public static void main(String args[]){

        triangle t = new triangle();
        Scanner scan = new Scanner(System.in);
        System.out.println("1 for triangle / 2 for numbers");
        int cases = scan.nextInt();
        switch (cases){
            case 1:
                int row = scan.nextInt();
                int col = scan.nextInt();
                int lines = scan.nextInt();
                String pat = scan.next();
                t.trianglePattern(row,col,lines,pat);
                break;

            case 2:
                int rows = scan.nextInt();
                int cols = scan.nextInt();
                int liness = scan.nextInt();
                int starting = scan.nextInt();
                t.numberPattern(rows,cols,liness,starting);
                break;
            default:
                break;
        }



    }

}
