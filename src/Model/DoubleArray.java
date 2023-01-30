/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sruthisivasankar
 */

import java.util.Arrays;

public class DoubleArray {
    public static void Array(int[] arr){
        for(int i=0; i<arr.length;i++){
            if(i%2==0){
                arr[i] *=2;
                
            } 
            else{
            arr[i] *=3;
            }
        }
    }
    
    public static void main(String[] args){
        int[]arr= {7,12,15,20};
        Array(arr);
        System.out.println("Changed array" + Arrays.toString(arr));
    }
    
}
