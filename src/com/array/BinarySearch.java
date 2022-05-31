package array;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 7, 19, 24, 32, 41, 48, 59, 62, 71, 88, 90};
        System.out.println(binarySearch(arr, 45));
    }   

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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
        return -1;
    }

}