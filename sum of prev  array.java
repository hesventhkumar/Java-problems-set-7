  //SUM OF PREV ARRAY

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, i, sum = 0;
        size = sc.nextInt();
        int arr[] = new int[size];
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sum = ArraySum(arr);
        for (i = size-1; i >= 0; i--) {
            arr[i] = sum - arr[i];
            sum=arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    static int ArraySum(int[] res) {
        int i, sum = 0;
        for (i = 0; i < res.length; i++) {
            sum += res[i];
        }
        return sum;
}
}

//OUTPUT
5
// 10 20 37 40 47
// [0, 10, 30, 67, 107]
