import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {

         try (Scanner scanner = new Scanner(System.in)) {
             while(true) {
                 String mot = scanner.nextLine();
                 if (mot.equals("quit")) {
                     break;
                 }
                 if(mot.equals("fibo"))
                 {
                     System.out.print( "Veuillez saisir un premier entier : " );
                     int a = scanner.nextInt();

                     int nbr1=0, nbr2=1, nbr3=0, i, count=a+1;
                     //afficher 0 et 1
                     //La boucle commence par 2 car 0 et 1 sont deja affiches
                     for(i=2; i<count; ++i)
                     {
                         nbr3 = nbr1 + nbr2;
                         nbr1 = nbr2;
                         nbr2 = nbr3;
                     }
                     System.out.print(nbr3);

                     break;
                 }

                 System.out.print("Unknow command\n");
             }
         }
    }
}

