package TugasSekolah.SwitchCase.src;

import java.util.*;

public class Diskonn {

        public static void main(int [] dataArray) {
                int array[], i, n;
                array = new int[100];
                float rata, total = 0;

                Scanner scan = new Scanner(System.in);
                System.out.print("Masukkan banyaknya elemen array: ");
                n = scan.nextInt();
                for (i = 1; i <= n; i++) {
                        System.out.print("Nilai Ke-" + i + " : ");
                        array[i] = scan.nextInt();
                        total = total + array[i];
                }

                if (n<i){
                        System.out.println("Nilai n lebih besar dari i");
                }else if (i<n){
                        System.out.println("nilai i lebih besar dari n");
                }
                

        }

}
