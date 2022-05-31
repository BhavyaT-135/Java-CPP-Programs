package array;

import java.util.Scanner;

public class CeilingOfNumber2 {

    public static void main(String[] args) {
        int[] arr = {1, 7, 19, 24, 32, 41, 48, 59, 62, 71, 88, 90};
        System.out.println(arr[ceiling(arr, 45)]);
    }   

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[end]){
            return -1;
        }
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }   
        }
        return start;
    }

}