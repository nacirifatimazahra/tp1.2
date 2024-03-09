package TP1_2;
import java.util.Scanner;
public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une heure precise : ");
        int h=sc.nextInt();
        System.out.print("Entrez les minutes : ");
        int m=sc.nextInt();
        m++;
        if(m==60){
            m=0;
            h++;
        }
        if(h==24){
            h=0;
        }
        System.out.println("L'heure une minute plus tard est : " +h+ " heure(s) " +m+ " minute(s)");
    }
}
