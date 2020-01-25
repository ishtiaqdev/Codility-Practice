/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitypractice;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author smart
 */
public class ChocolatesByNumbers {
    public int solution(int N, int M) {

        Set<Integer> set = new HashSet<>();
        
        int currentNumber =0;
        set.add(currentNumber); // add first chocolate
        int numChocolate = 1;   // eat first chocolate
        
        while(true){
            currentNumber = (currentNumber + M) % N;
            if(set.contains(currentNumber) == true){
                break;
            }
            else{
                numChocolate++; // increase eating of one more chocolate
                set.add(currentNumber);
            }
        }
        return numChocolate;
    }
}
