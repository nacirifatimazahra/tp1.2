package TP1_2;
import java.util.Scanner;
public class EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le poids en kg : ");
        double poids = sc.nextDouble();
        System.out.print("Entrez la taille en m : ");
        double taille = sc.nextDouble();
        System.out.print("Entrez le sexe (F pour femme, H pour homme) : ");
        char sexe = sc.next().charAt(0);
        double imc = poids / (taille * taille);
        System.out.println("L'IMC est : " + imc);
        if ((sexe == 'F' || sexe == 'f') && imc < 19) {
            System.out.println("Maigreur");
        } else if ((sexe == 'F' || sexe == 'f') && imc >= 19 && imc <= 24) {
            System.out.println("Poids normal");
        } else if ((sexe == 'F' || sexe == 'f') && imc > 24 && imc <= 30) {
            System.out.println("Surcharge pondérale");
        } else if ((sexe == 'F' || sexe == 'f') && imc > 30 && imc <= 40) {
            System.out.println("Adiposité");
        } else if ((sexe == 'F' || sexe == 'f') && imc > 40) {
            System.out.println("Obésité");
        } else if ((sexe == 'H' || sexe == 'h') && imc < 20) {
            System.out.println("Maigreur");
        } else if ((sexe == 'H' || sexe == 'h') && imc >= 20 && imc <= 25) {
            System.out.println("Poids normal");
        } else if ((sexe == 'H' || sexe == 'h') && imc > 25 && imc <= 30) {
            System.out.println("Surcharge pondérale");
        } else if ((sexe == 'H' || sexe == 'h') && imc > 30 && imc <= 40) {
            System.out.println("Adiposité");
        } else if ((sexe == 'H' || sexe == 'h') && imc > 40) {
            System.out.println("Obésité");
        } else {
            System.out.println("Sexe non reconnu.");
        }
    }
}
