package TugasSekolah.SwitchCase.src;
import java.util.*;
import java.util.Arrays;

import BelajarJavaDasar.src.JavaDasar.Array;

public class ArrayScanner {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String nama[] = new String[3];
        String kelas[] = new String [3];
        int absen[] = new int [3];

        //NAMA
        System.out.println("silahkan input nama array indeks ke 0 ");
        nama[0]= input.next();
        System.out.println("silahkan input nama array indeks ke 1");
        nama[1] = input.next();
        System.out.println("silahkan input nama array indeks ke 2 ");
        nama[2] = input.next();

        //ABSEN
        System.out.println("Masukkan nomor absen untuk " + nama[0]);
        absen[0] = input.nextInt();
        System.out.println("Masukkan nomor absen untuk " + nama[1]);
        absen[1] = input.nextInt();
        System.out.println("Masukkan nomor absen untuk " + nama[2]);
        absen[2] = input.nextInt();

        //Kelas
        System.out.println("Masukkan kelas untuk " + nama[0]);
        kelas[0] = input.next();
        System.out.println("Masukkan kelas untuk " + nama[1]);
        kelas[1] = input.next();
        System.out.println("Masukkan kelas untuk " + nama[2]);
        kelas[2] = input.next();



        System.out.println("Yang anda inputkan adalah " + Arrays.toString(nama));
        System.out.println("Nomor absen " + Arrays.toString(absen));
        System.out.print("Kelas " + Arrays.toString(kelas));



    }
    
}
