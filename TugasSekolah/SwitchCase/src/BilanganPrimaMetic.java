package TugasSekolah.SwitchCase.src;

import java.util.*;

public class BilanganPrimaMetic {
    


    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        
        do{
        System.out.println("Silahkan Masukkan Bilangan");
        int angka = input.nextInt();
        int temp;
        boolean prima = true;
        
        //penggunaan for loop
        for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
         
         temp = angka % pembagi;
         
         if(temp == 0){
          
          prima = false;
          break;
          
         }
            
            
            }
            if(prima && ((angka >0 )&&(angka != 1)))
             System.out.println(angka + " adalah bilangan prima");
            else
             System.out.println(angka + " bukanlah bilangan prima");
            
            System.out.println("Apakah anda ingin lanjut ? (Y/G)" );
        }
        while(input.next().equalsIgnoreCase("Y"));
        input.close();

         

        

    }

}


            
        
    
        

              

        
    

        
    
    


