package TugasSekolah.SwitchCase.src;

import java.util.*;

public class ArrayMetic {

    public static  int highest (int[] a) {
    
        int highest = a[0];
         
        // for each loop
        for (int num : a)
        {
            if (num > highest)
            {
                highest = num;
            }
        }
    return highest;  
                
        }
        

}


