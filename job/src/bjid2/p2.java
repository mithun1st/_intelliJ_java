package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);

        //declare variable
        int l,n,w,h;

        //input length and num of photo
        l=sc.nextInt();
        n=sc.nextInt();

        //loop start
        for (int i=0; i<n;i++){
            w=sc.nextInt();
            h=sc.nextInt();

            if(w<l || h<l){
                System.out.println("UPLOAD ANOTHER");
            }
            else if(h==w){
                System.out.println("ACCEPTED");
            }
            else {
                System.out.println("CROP IT");
            }
        }
    }
}
