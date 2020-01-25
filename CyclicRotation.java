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
public class CyclicRotation {
    //Cyclic array rotations
    public int[] solution(int[] A, int K) {
        int[] rotatedArray = new int[A.length];
        if(A.length > 0)
        {
            rotatedArray = A;
            for(int i=0; i < K; i++)
            {
                rotatedArray = CyclicRotation.rotateArray(rotatedArray);
            }
        }
        return rotatedArray;
    }
    
    public static int[] rotateArray(int[] A)
    {
        int[] rotatedArray = new int[A.length];
        int temp = A[A.length - 1];
        for (int i=A.length - 1; i > 0; i--)
        {
            rotatedArray[i] = A[i - 1];
        }
        rotatedArray[0] = temp;
        return rotatedArray;
    }
}
