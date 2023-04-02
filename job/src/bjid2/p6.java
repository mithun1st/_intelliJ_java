package com.company;

import java.util.Scanner;

public class Main {

    //function Define
    public  static void numPrint(int num){
        int limit = num;
        while (num > 0){
            System.out.print(num);
            num--;
        }
        num++;
        while (num<limit){
            num++;
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

	    //input number
        System.out.print("Enter Number as a Input: ");
        int limit = sc.nextInt();

        for (int i=1;i<=limit;i++){
            for (int j=1;j<=limit-i;j++){
                System.out.print(" ");;
            }
            numPrint(i);
            System.out.println();
        }

    }

}
