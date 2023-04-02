package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //variable
        System.out.print("Input the rectangle value of- start of (x, y) position and end of (x,y) position: ");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        //function call and print
        System.out.println("Path: "+makeRectanglePath(x1,y1,x2,y2));

    }

    //function
    public static String makeRectanglePath(int x1pos, int y1pos, int x2pos, int y2pos){
        int h=x1pos+x2pos;
        int v=y1pos+y2pos;

        String path="M"+x1pos+" "+y1pos+" L"+x2pos+" "+y2pos+" L"+h+" "+v+" Z";

        return path;
    }
}
