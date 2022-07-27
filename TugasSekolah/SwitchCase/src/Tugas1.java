package TugasSekolah.SwitchCase.src;

import java.util.*;

public class Tugas1 {

    public static void main(String[] Args) {

        int bayar, total, diskon;
        String member, nama;

        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Toko Gratis tapi tutup");
        System.out.println("nama anda siapa ?");
        nama = input.next();

        System.out.println("Punya Kartu member ?");
        member = input.next();

        if (member.equalsIgnoreCase("ya")) {
            System.out.println("Total bayar ?");
            bayar = input.nextInt();
            if (bayar >= 250000) {
                diskon = bayar * 20 / 100;
                total = bayar - diskon;
                System.out.println("Selamat pak " + nama + " Mendapat Diskon sebesar " + diskon + " Anda bayar " + total);
            }
            else if(bayar > 100000){
                diskon = bayar * 15/100;
                total = bayar - diskon;
                System.out.println("Selamat pak " + nama + " Mendapat Diskon sebesar " + diskon + " Anda bayar " + total);

            }


        }else{
            System.out.println("Total bayar ?");
            bayar = input.nextInt();
            diskon = 0;
                total = bayar;
                System.out.println("Mohon Maaf pak " + nama + " Anda mendapatkan diskon sebesar " + diskon + " Anda bayar " + total + " Tambah Belanjaan anda untuk mendapatkan diskon ");
            
        }

        

    }
}
