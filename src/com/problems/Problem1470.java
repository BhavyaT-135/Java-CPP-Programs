import java.util.Arrays;

public class Problem1470 {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }

    static int[] shuffle(int[] nums, int n) {
        int mid = nums.length/2;
        int pos = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < mid; i++){
            ans[i+pos] = nums[i];
            ans[nums.length -1 -i -pos] = nums[nums.length -1 -i];
            pos ++;
        }
        return ans;
    }
}

