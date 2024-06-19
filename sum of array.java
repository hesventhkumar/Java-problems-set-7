// SUM OF ARRAY

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, ind,sum=0;
        size = sc.nextInt();  //5
        int[] arr = new int[size];  //
        for (ind = 0; ind < size; ind++) {  //0 1 2 3 4
            arr[ind] = sc.nextInt();        //1  2 3 4 5
        }
        for (ind = 0; ind < size; ind++) { //0 1 2 3 4
//
            System.out.print(arr[ind] + " " );// 1 2 3 4 5
            sum=sum+arr[ind];

        }
        System.out.println(sum+" ");



    }
}


// OUTPUT

// 5
// 1
// 2
// 3
// 4
// 5
// 1 2 3 4 5 15



