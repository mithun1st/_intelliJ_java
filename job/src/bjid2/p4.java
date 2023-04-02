package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //input amount
        System.out.print("Withdraw Amount: ");
        int amount = sc.nextInt();

        //operation
        if(amount> 20000){
            System.out.println("EXCEEDED AMOUNT");
        }
        else if(amount < 500 || amount%500!=0){
            System.out.println("INVALID AMOUNT");
        }
        else if( !(amount> 20000) && !(amount < 500 || amount%500!=0) ){
            System.out.println("TRANSACTION SUCCESSFUL");
        }
        else{
            System.out.println("“Error Occurred");
        }

    }
}
