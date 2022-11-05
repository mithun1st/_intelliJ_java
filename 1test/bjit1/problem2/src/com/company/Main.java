package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Limit of Test Case: ");
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            //initial and declare
            System.out.print("Enter Three Character as a Input: ");
            char ch1=sc.next().charAt(0);
            char ch2=sc.next().charAt(0);
            char ch3=sc.next().charAt(0);

            //data type convert
            int a=(int) ch1;
            int b=(int) ch2;
            int c=(int) ch3;

            //function call
            isValid(a,b,c);
        }

    }


    //triangle validity check function
    public static void isValid(int a,int b,int c){
        if( ((a+b)>c)    &&   ((b+c)>a)   && ((c+a)>b) ){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
