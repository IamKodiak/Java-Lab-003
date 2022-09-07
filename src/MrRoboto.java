// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Scanner;

public class MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Concatenate the user response to this String.
        String domo = "Domo arigato ";
        String stan = "no, I'm stan";

        System.out.print("My name is Mr. Roboto, are you Kilroy? ");
        String fun = scanner.nextLine();
        if(fun.equals(stan)){
            System.out.println(domo+stan);
        }
    }
}