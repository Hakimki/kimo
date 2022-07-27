package TugasSekolah.SwitchCase.src;

import java.util.*;

public class VaksinIfElse {

    public static void main(String [] args){

        int umur;

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan umur anda");
        umur = input.nextInt();

        if( umur < 12){
            System.out.println("Anda masih bocil");
        }else if(umur > 50){
            System.out.println("Anda Boleh vaksin, tapi cek kesehatan terlebih dahulu");
        }else if(umur >= 12){
            System.out.println("Anda diperbolehkan Vaksin");
        }
        
    }
    
}
