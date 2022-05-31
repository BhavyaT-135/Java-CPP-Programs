package array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {18, 12, 9, 14, 77, 50};
        System.out.println(linearSearch(arr, 77));
    }

    static int linearSearch(int[] arr, int val) {
        if(arr.length==0) {
            return -1;
        }
        
        for(int i=0; i < arr.length; i++) {
            if(arr[i] == val) {
                return i;
            }
        }
        return -1;
    }
}