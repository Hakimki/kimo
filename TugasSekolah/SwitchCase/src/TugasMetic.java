package TugasSekolah.SwitchCase.src;

import java.util.*;

public class TugasMetic {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Masukkan angka ");
    
            int angka = input.nextInt();
            if(angka %2==0){
                System.out.println("genap");
            } else{
                System.out.println("ganjil");
            }
                System.out.println("Apakah ingin diulang? (Y/G)");



            }while(input.next().equalsIgnoreCase("Y"));
            input.close();
        
      
        
        
    }   
        
    
}
