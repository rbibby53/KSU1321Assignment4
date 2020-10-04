import static java.lang.System.*;
import java.util.Scanner;


public class Assignment4A {
    public static void main(String[] args){
        int c;
        Scanner in = new Scanner(System.in);
        out.println("Enter seed 1: ");
        int a = in.nextInt();
        out.println("Enter seed 2: ");
        int b = in.nextInt();
        out.println("Number of iterations: ");
        int iter = in.nextInt();
        out.print(a+","+b);
        for(int i=0;i<iter;i++){
            c = a + b;
            out.print( "," + c);
            a = b;
            b = c;
        }
    }
}
