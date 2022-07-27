package TugasSekolah.SwitchCase.src;

import java.util.*;

public class TugasArray3 {

    public static void main(String [] args){

        
        Scanner input = new Scanner(System.in);
        String minuman [] = {"Es teh", "Es Jeruk", "Jus Apel", "Jus Semangka", "Jus Alpukat", "Jus Mangga", "Jus Melon" };
        String harga[] = {"3K", "3k", "5K", "5K" + "7K" + "4K" + "5K"};

       int urutan = 0;
       System.out.println("Selamat Datang");

       for(int i = 0; i< minuman.length;i++){
           urutan++;
           System.out.println(urutan + "." + minuman[i] + " => " + harga[i]);
        }
        

        System.out.print("Silahkan dipilih :");
        int pilihan = input.nextInt();

        switch(pilihan){
            case  1 :
            System.out.println("Minuman anda adalah :" + minuman[0] + " => " + harga[0] );
            case  2 :
            System.out.println("Minuman anda adalah :" + minuman[1] + " => " + harga[1] );
            case  3 :
            System.out.println("Minuman anda adalah :" + minuman[2] + " => " + harga[2] );
            case  4 :
            System.out.println("Minuman anda adalah :" + minuman[3] + " => " + harga[3] );
            case  5 :
            System.out.println("Minuman anda adalah :" + minuman[4] + " => " + harga[4] );
            case  6 :
            System.out.println("Minuman anda adalah :" + minuman[5] + " => " + harga[5] );
            case  7 :
            System.out.println("Minuman anda adalah :" + minuman[6] + " => " + harga[6] );



        }
        

    }
    
}
