package TugasSekolah.SwitchCase.src;

public class TugasArray2 {
    public static void main(String [] args){

        int angka [] = new int[487];
        int nilaiAwal = 1;
        int index = 1;

        for(int i = 4;i<angka.length;i++){
            if(i%7==4){
                angka[index] = i;
                System.out.println("Deret ke " + nilaiAwal + " = " + i);
                nilaiAwal++;
                index++;
                if(nilaiAwal==61){
                    System.out.println("=======================");
                }
              }

            }
        }
        
        

        }
        

        
   
    
    
 
  
