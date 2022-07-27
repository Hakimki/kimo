package TugasSekolah.SwitchCase.src;

public class TugasArray {
    public static void main(String [] args){
        
        int angka [] =  new int[52];
        int index = 1;
        int nilaiAwal = 9;
        for(int i = 24;i<=angka.length;i++){
            if (i %3== 0){
                angka[index]=i;
                System.out.println("Deret ke " + nilaiAwal + " = " + i);
                nilaiAwal++;
                index++;

            }
        }


           }
            
        }



        

    
    
