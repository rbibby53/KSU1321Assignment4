import java.util.Scanner;
import static java.lang.System.*;

public class Assignment4B {
    public static void main(String[] args){
        Scanner input = new Scanner(in);
        out.println("Size: ");
        int size = input.nextInt();
        for(int i = 0; i < size;i++){
            out.print(new String(new char[i]).replace( "\0", "  "));
            for(int j = 0;j < (size - i);j++){
                out.print(j + " ");
            }
            out.print("\n");
        }
    }
}
