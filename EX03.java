package TP1_2;
import java.util.Scanner;
public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre eniter : ");
        int n = sc.nextInt();
        if(n<=1){
            System.out.print("Veuillez entrer un entier positif supérieur à 1.");
        }
        else{
            int sumdiviseurs=1;
            for(int i=2;i<=n/2;i++){
                if (n%i==0) {
                    sumdiviseurs+=i;
                }
            }
            if (sumdiviseurs==n) {
                System.out.println(n+ " est un nombre parfait.");
            } else {
                System.out.println(n+ " n'est pas un nombre parfait.");
            }
        }

    }
}
