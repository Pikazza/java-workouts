package com.pikazza.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayMinAndMaxRearrange {

  public static void main(String args[]) {
    System.out.println("Rearranging sorted array elements with alternate order with first max number");
    int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println("1. Before "+Arrays.toString(arr));
    int arrReArranged[] = getRearranchedArrayWithFirstMax(arr);
    System.out.println("1. After rearranged with first max "+Arrays.toString(arrReArranged));
    
    System.out.println("Rearranging scrambled array elements with alternate order with first min number");
    
    int arr2[] = new int[] { 1, 3, 8, 2, 7, 5, 6, 4};
    Arrays.sort(arr2);
    System.out.println("2. Before "+Arrays.toString(arr2));
    int arrReArranged2[] = getRearranchedArrayWithFirstMin(arr2);
    System.out.println("2. After Rearranged with first min "+Arrays.toString(arrReArranged2));
    
    System.out.println("Rearranging scrambled array elements with List ");
    
    Integer arr3[] = new Integer[] { 1, 3, 8, 2, 7, 5, 6, 4};
    List<Integer> list = Arrays.asList(arr3);
    Collections.sort(list);
    System.out.println("3. Before "+list);
    
  }

  private static int[] getRearranchedArrayWithFirstMax(int[] arr) {
    int temp[] = new int[arr.length];
    int max = arr.length - 1;
    int min = 0;
    for (int i = 0; i < arr.length; i++) {
      if ( i % 2 == 0) {
        temp[i] = arr[max];
        max--;
      } else {
        temp[i] = arr[min];
        min++;
      }
    }
    return temp;
  }
  
  private static int[] getRearranchedArrayWithFirstMin(int[] arr) {
    int temp[] = new int[arr.length];
    int max = arr.length - 1;
    int min = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i == 0 || i % 2 == 0) {
        temp[i] = arr[min];
        min++;
      } else {
        temp[i] = arr[max];
        max--;
      }
    }
    return temp;
  }

}
