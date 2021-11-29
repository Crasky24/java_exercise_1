import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {

         try (Scanner scanner = new Scanner(System.in)) {
             while(true) {
                 String a = scanner.nextLine();
                 if (a.equals("quit")) {
                     break;
                 } else {
                     System.out.print("Unknown command\n");
                 }
             }
         }
    }
}

