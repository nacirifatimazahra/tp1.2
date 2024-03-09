package TP1_2;
import java.util.Scanner;
public class EX04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre eniter n : ");
        int n = sc.nextInt();
        System.out.print("Entrez un nombre eniter m : ");
        int m = sc.nextInt();
        if (n <= 1 || m <= 1) {
            System.out.println("Veuillez entrer des entiers positifs supérieurs à 1.");
        } else {
            int sn1 = 0, sm2 = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    sn1 += i;
                }
            }
            for (int j = 2; j <= m / 2; j++) {
                if (m % j == 0) {
                    sm2 += j;
                }
            }
            if (sm2 == n && sn1 == m) {
                System.out.print("les nombres n et m sont des amis ");
            } else {
                System.out.print("les nombres n et m ne sont pas des amis ");
            }
        }

    }
}