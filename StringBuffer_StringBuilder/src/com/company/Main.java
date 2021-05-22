package com.company;

public class Main {

    public static void main(String[] args) {
        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer("");

        stringBuffer.append('M');
        stringBuffer.append('H');
        stringBuffer.append(94);
        stringBuffer.append("Mithun");

        System.out.println(stringBuffer);
        System.out.println(stringBuffer.charAt(0));
        System.out.println(stringBuffer.replace(0,2,"+-"));
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.delete(9,10)+"\n\n");


        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder("");

        stringBuilder.append('X');
        stringBuilder.append('Y');
        stringBuilder.append(12);
        stringBuilder.append("Abcdef");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.charAt(4));
        System.out.println(stringBuilder.replace(0,2,"*#"));
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.delete(9,10));
    }
}
