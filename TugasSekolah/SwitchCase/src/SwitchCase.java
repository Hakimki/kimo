package TugasSekolah.SwitchCase.src;

import java.util.*;

public class SwitchCase {

    public static void main(String [] args){
        String kode;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Silahkan memasukkan kode ");
        kode = userInput.next();

        switch (kode) {
            case "1":
                System.out.println("Alat Olah Raga");
                break;
            case "2":
                System.out.println("Alat Elektronik");
                break;
            case "3":
                System.out.println("Alat Masak");
                break;
            default:
                System.out.println("Anda salah memasukkan kode");
                break;
    }
    
    }
}    
