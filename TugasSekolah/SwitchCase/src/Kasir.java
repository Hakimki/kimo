package TugasSekolah.SwitchCase.src;
import java.util.*;

public class Kasir {

    public static void main(String [] args){

        int total, diskon, jumlah;

        Scanner input = new Scanner(System.in);

        System.out.println("total pembelian Rp. ");
        total = input.nextInt();

        if(total>=50000){
            diskon = 10000;
        }else{
            diskon = 0;
        }

        jumlah = total-diskon;
        System.out.println("Besar potongan adalah  " + diskon);
        System.out.println("Jumlah yang harus dibayar adalah" + jumlah);

        
    }
    
}
