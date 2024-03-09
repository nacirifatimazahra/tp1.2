package TP1_2;
import java.util.Scanner;
public class EX08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez l'âge : ");
        int age = sc.nextInt();
        System.out.print("Entrez le sexe (M pour homme, F pour femme) : ");
        char sexe = sc.next().charAt(0);
        if ((sexe == 'M' || sexe == 'm') && age > 20) {
            System.out.println("L'habitant est imposable.");
        } else if ((sexe == 'F' || sexe == 'f') && age >= 18 && age <= 35) {
            System.out.println("L'habitant est imposable.");
        } else {
            System.out.println("L'habitant n'est pas imposable.");
        }
        sc.close();
    }
}
