package com.company;

import java.util.Scanner;

public class Main {

    public static  int toNum(char c){
        return ((int)c)-64;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input =scanner.nextLine();

        int sum=0;
        int limit = input.length()-1;

        for (int i=0;i<input.length()-1;i++,limit--){
            sum+=(int)(toNum(input.charAt(i))*(Math.pow(10,limit)));
        }
        sum+=toNum(input.charAt(input.length()-1));
        System.out.println(sum);
    }
}
