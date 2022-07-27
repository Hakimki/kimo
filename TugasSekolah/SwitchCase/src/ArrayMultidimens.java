package TugasSekolah.SwitchCase.src;

public class ArrayMultidimens {

    public static void main(String[] args){

        int[][] no = {{1},{3,5},{7,9,11},{13,15,17,19}};
         for(int i=0;i<4;i++){
             for(int j=0;j<=i;j++){
                 System.out.print(no[i][j]+"\t");
             }
             System.out.println(" ");
         }
    } 
}
    

