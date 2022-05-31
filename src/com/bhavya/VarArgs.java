package bhavya;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        multiple (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    static void multiple(int a, int b, int ...v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(v.length);
        System.out.println(Arrays.toString(v));
    }

    static void fun (int ...v) {
        System.out.println(v.length);
        System.out.println(Arrays.toString(v));
    }
}