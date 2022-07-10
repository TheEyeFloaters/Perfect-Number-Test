package APComputerScience;

import java.util.Scanner;

public class PerfectSayi {
    public static void main(String[] args) {
        int counter = 0 ;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz : ");
        int sayi = s1.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                counter = i + counter;
                if (counter == sayi){
                    System.out.println("Mukemmel Sayi ");
                }
            }
            if (i==sayi-1 && counter!=sayi){
                System.out.println("Mukemmel sayi degil");
            }
        }

    }
}


