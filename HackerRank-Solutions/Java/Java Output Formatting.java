//Prepare>Java>Introduction>Java Output Formatting
//Java 7

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.print(s1);
                int space = 15 - s1.length();
                for(int j = 0; j<space; j++)
                System.out.print(" ");
                if(x<10)
                System.out.println("00"+x);
                else if(x<100)
                System.out.println("0"+x);
                else
                System.out.println(x);
            }
            System.out.println("================================");

    }
}



