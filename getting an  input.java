                                  

//GETTING  AN INPUT

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, ind;
        size = sc.nextInt();  //5
        int[] arr = new int[size];  //
        for (ind = 0; ind < size; ind++) {  //0 1 2 3 4
            arr[ind] = sc.nextInt();        //1  2 3 4 5
        }
        for (ind = 0; ind < size; ind++) { //0 1 2 3 4
            System.out.print(arr[ind] + " ");// 1 2 3 4 5
        }
    }
}

  //OUTPUT
// 5
//   1
//   2
//   3
//   4
//   5
//   1 2 3 4 5 
