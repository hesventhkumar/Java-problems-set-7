// CONSECUTIVE PRIME NUMBER


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  num,range,sum,count=0;
        range = sc.nextInt();
        for ( sum=2,num=3; sum<range  &&  num<range;num++) {
            if(isPrime(num)==1){
                sum+=num;
                if(isPrime(sum)==1){
                    System.out.println(sum+" ");
                    count++;
                }
            }
        }
        System.out.println(count);
    }
       static int isPrime(int num)
    {
        int range,fact;            //10
        if(num%2==0 && num!=2)     //
            return 0;
        if(num==2||num==3)
            return 1;
        if(num%6!=5 && num%6!=1)
            return 0;
        range=(int) Math.sqrt(num);
        for(fact=3;fact<range;fact+=2)
            if(num%fact==0)
                return 0;
        return 1;

    }
}




//OUTPUT



// 10
// 5 
//   COUNT =1
