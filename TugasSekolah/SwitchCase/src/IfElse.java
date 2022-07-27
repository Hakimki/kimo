package TugasSekolah.SwitchCase.src;

import java.util.Scanner;

public class IfElse {
    
    
    public static void main(String [] Args){

        //Nilai Ulangan Harian
        //nilai<75

        int nilai;

        System.out.println("Masukkan Nilai ");

        Scanner naila = new Scanner(System.in);
        nilai = naila.nextInt();

        if(nilai<75){
            System.out.println("Anda Remidi");

        }else{
            System.out.println("Anda Tidak remidi");
        }






        


    }
}
