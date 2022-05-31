package bhavya;

import java.util.Scanner;
import java.util.Arrays;

public class TwoDArraySearch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {{18, 12, 9, 14, 77, 50}, {1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}};
        System.out.println(Arrays.toString(linearSearch(arr, 11)));
    }

    static int[] linearSearch(int[][] arr, int val){
        int[] ans = {-1,-1};

        if(arr.length==0) {
            return ans;
        }

        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[i].length; j++) {
                if(arr[i][j] == val) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}