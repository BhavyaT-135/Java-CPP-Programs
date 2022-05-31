package array;

import java.util.Scanner;

public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = {1, 7, 19, 24, 32, 41, 48, 59, 62, 71, 88, 90};
        System.out.println(arr[ceiling(arr, 99)]);
    }   

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        if(target > arr[end]){
            return -1;
        }
        while(start <= end){
            mid = (start + end) / 2;
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
        if(arr[mid] < target){
            return mid+1;
        }
        else{
            return mid;
        }
    }

}