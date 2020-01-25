/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitypractice;
import java.util.*;
/**
 * @author smart
 */
public class CodilityPractice {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ChocolatesByNumbers chocolates = new ChocolatesByNumbers();
        int chocs = chocolates.solution(14, 0);
        
        BinaryGap bg = new BinaryGap();
        int binaryGap = bg.solution(561892);
        
        CyclicRotation cr = new CyclicRotation();
        int[] rotated = cr.solution(new int[] {3, 8, 9, 7, 6}, 3);
        
        //OddOccurrencesInArray oa = new OddOccurrencesInArray();
        //int oddNum = oa.solution(new int[]{9, 3, 9, 3, 9, 7, 9});
        
        System.out.println(binaryGap);
    }
    
}
