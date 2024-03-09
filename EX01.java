package TP1_2;
import java.util.Scanner;
public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un entier positif : ");
        int x = sc.nextInt();
        if (x <= 0) {
            System.out.println("Veuillez entrer un entier positif.");
        }
        System.out.print("Les diviseurs de " +x+ " sont : ");
        int nombreDiviseurs=0;
        int sommeDiviseurs=0;
        for (int i=1; i<=x; i++) {
            if (x% i==0) {
                System.out.print(i + " ");
                nombreDiviseurs++;
                sommeDiviseurs+=i;
            }
        }
        System.out.println("\nLe nombre de diviseurs de " +x+ " est : " + nombreDiviseurs);
        System.out.println("La somme des diviseurs de " +x+ " est : " + sommeDiviseurs);

    }
}
