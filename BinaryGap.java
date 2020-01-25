/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitypractice;

/**
 *
 * @author smart
 */
public class BinaryGap {
    //Binary Gap
    public int solution(int n) 
    {
        int a, longestBinaryGap = 0;
        String x = "";
        while(n > 0)
        {
            a = n % 2;
            x = a + "" + x;
            n = n / 2;
        }
        
        
        char[] arr = x.toCharArray();
        int currentBinaryGap = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == '1')
            {
                if(longestBinaryGap > currentBinaryGap)
                {
                    currentBinaryGap = longestBinaryGap;
                }
                longestBinaryGap = 0;
             }
            else
            {
                longestBinaryGap++;
            }
        }
        return currentBinaryGap;
    }    
}
