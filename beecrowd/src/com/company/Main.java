package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double m= 2.0,n=6.5,o=4.0,p=9.0;

//        Scanner sc = new Scanner(System.in);
//         m=sc.nextDouble();
//         n=sc.nextDouble();
//         o=sc.nextDouble();
//         p=sc.nextDouble();
///4.8
        double avg=(((m*2)+(n+3)+(o+4)+(p*1))/10);

        if(avg>=7){
            System.out.println("Madia: "+String.format("%.1f",avg)+ "\nAluno aprovado.");
        }
        else if(avg<5){
            System.out.println("Madia: "+String.format("%.1f",avg)+ "\nAluno reprovado.");
        }
        else{

        System.out.println(String.format("%.1f",avg));
        }

    }
}
