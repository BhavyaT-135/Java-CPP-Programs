package array;

import java.util.Scanner;

public class FloorOfNumber {

    public static void main(String[] args) {
        int[] arr = {1, 7, 19, 24, 32, 41, 48, 59, 62, 71, 88, 90};
        System.out.println(arr[floor(arr, 45)]);
    }   

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target < arr[start]){
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
        return end;
    }

}