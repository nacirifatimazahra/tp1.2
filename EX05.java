package TP1_2;
import java.util.Scanner;
public class EX05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] butsJoueurs=new int[22];
        for (int i=0; i<22; i++) {
            System.out.print("Entrer le nombre de buts pour le joueur n°" +(i+1)+ " : ");
            butsJoueurs[i] = sc.nextInt();
        }
        int maxButs = -1;
        int numeroButeur = -1;
        for (int i=0; i<butsJoueurs.length; i++) {
            if (butsJoueurs[i]>maxButs) {
                maxButs=butsJoueurs[i];
                numeroButeur=i+1;
            }
        }
        System.out.println("Le numéro du buteur de l'équipe est le joueur n°" + numeroButeur);
        int totalButs=0;
        for (int buts:butsJoueurs) {
            totalButs+=buts;
        }
        System.out.println("Le nombre total de buts inscrits par l'équipe est : " + totalButs);
        int joueursSansBut = 0;
        for (int buts:butsJoueurs) {
            if (buts == 0) {
                joueursSansBut++;
            }
        }
        System.out.println("Le nombre de joueurs qui n'ont pas marqué de buts est : " + joueursSansBut);
        System.out.print("Entrer le nouveau nombre de buts pour le joueur n°9 : ");
        int nouveauxButs=sc.nextInt();
        butsJoueurs[8] = nouveauxButs;
        System.out.println("Le nombre de buts du joueur n°9 a été mis à jour à : " + nouveauxButs);
        System.out.println("Tableau des buts mis à jour :");
        for (int i = 0; i < butsJoueurs.length; i++) {
            System.out.println("Joueur n°" + (i + 1) + " : " + butsJoueurs[i] + " buts");
        }
    }
}
