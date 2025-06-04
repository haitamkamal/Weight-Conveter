import java.util.*;

public class Main {
   public static void main (String[] args){
    Scanner f = new Scanner(System.in);
    int a;
    int Poids;
    double nouveauPoids;


        System.out.println("Programme de conversion de Poids");

        System.out.println("1: Conversion lbs to kg");
        System.out.println("2: Conversion kgs to lbs");

        System.out.print("Choisir une option ");
        a = f.nextInt();

        if ( a== 1 ) {
            System.out.print("Entrez Votre Poids dans lbs :");
            Poids = f.nextInt();
            nouveauPoids = Poids * 0.45359237;
            System.out.printf("Le nouveau poids en kg est : %.2f",nouveauPoids);
            
            
        }
        if ( a == 2) {
            System.out.print("Enterz Votre Poids dans kg :");
            Poids = f.nextInt();
            nouveauPoids = Poids * 2.20462262;
            System.out.printf("Le nouveau Poids en lbs est :%.2f",nouveauPoids);
        }
        f.close();
   }
}