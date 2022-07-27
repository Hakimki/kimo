package TugasSekolah.SwitchCase.src;

import java.util.*;
import java.util.Arrays;

public class UlanganArray {
    public static void main(String[] args){

        

        Scanner xixixi= new Scanner(System.in);

            System.out.print("Masukkan jumlah angka : ");
            int n = xixixi.nextInt();

        String kata [] = new String [n];

        for(int i = 0; i<kata.length; i++){
            System.out.print("kata ke "+(i+1)+": ");
            kata [i] = xixixi.next();
        }

        System.out.println("Kata yang dimasukkan");
        for(int i = 0; i<kata.length; i++){
            System.out.println("kata ke - "+i+" adalah "+kata[i]);
        }


       
        
    }
    
}
