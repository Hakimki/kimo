package TugasSekolah.SwitchCase.src;

import java.util.*;

public class KasirDiskon {
    public static void main(String[] args){
        String member;
        int diskon, harga,  bayar;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Apakah anda memiliki member? : ");
        member = inputUser.nextLine();
        System.out.print("Masukkan harga : ");
        harga = inputUser.nextInt();
        
        if(member.equals("ya")){
            if(harga >= 100000){
                diskon = harga *10/100;
                bayar = harga - diskon;
                System.out.println("Terimakasih Member");
                System.out.println("Anda mendapat diskon 10% :v");
                System.out.println("Harga barang = Rp." + harga);
                System.out.println("Diskon = Rp." + diskon);
                System.out.println("Total Bayar = Rp." + bayar);
            }else{
                diskon = 0;
                bayar = harga - diskon;
                System.out.println("Terimakasih Member");
                System.out.println("Maaf anda kurang beruntung");
                System.out.println("Tambah belanjaan anda untuk mendapatkan diskon :D");
                System.out.println("Harga barang = Rp." + harga);
                System.out.println("Diskon = Rp." + diskon);
                System.out.println("Total Bayar = Rp." + bayar);
            }
        }else{
            if(harga >= 100000){
                diskon = harga *5/100;
                bayar = harga - diskon;
                System.out.println("Terimakasih Member");
                System.out.println("Anda mendapat diskon 5% :v");
                System.out.println("Harga barang = Rp." + harga);
                System.out.println("Diskon = Rp." + diskon);
                System.out.println("Total Bayar = Rp." + bayar);    
            }else{
                diskon = 0;
                bayar = harga - diskon;
                System.out.println("Terimakasih Member");
                System.out.println("Maaf anda kurang beruntung");
                System.out.println("Tambah belanjaan anda untuk mendapatkan diskon :D");
                System.out.println("Harga barang = Rp." + harga);
                System.out.println("Diskon = Rp." + diskon);
                System.out.println("Total Bayar = Rp." + bayar);

            }
        }
    }

}
    
        




