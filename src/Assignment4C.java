import java.util.Scanner;
import static java.lang.System.*;

public class Assignment4C {
    public static void main(String[] args){
        Scanner input = new Scanner(in);
        out.print("Width: ");
        int width = input.nextInt();
        out.println("*" + new String(new char[width - 1]).replace("\0", " "));
        for (int i = 0;i < width - 2; i++){
            out.print("* ");
            out.println(new String(new char[width * 2 - 4]).replace("\0", " "));
            out.print("* ");
        }
        out.println("*" + new String(new char[width - 1]).replace("\0", "*"));
    }
}
