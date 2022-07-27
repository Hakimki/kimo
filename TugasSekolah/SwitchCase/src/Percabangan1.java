package TugasSekolah.SwitchCase.src;

import java.util.*;

public class Percabangan1 {

    public static void main(String[] args) {
        // Nomor 1

        int nilai;

        Scanner input = new Scanner(System.in);
        
        System.out.println("input nilai");
        nilai = input.nextInt();

        if(nilai>90){
        System.out.println("grade = A");
         }
         if(nilai>80){
        System.out.println("grade = B+");
         }
        if(nilai>70){
        System.out.println("grade B");
        }else{
        System.out.println("grade F");
                }
            }
        
       

    }

