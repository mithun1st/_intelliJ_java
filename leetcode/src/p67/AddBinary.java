package p67;

import java.math.BigInteger;

public class AddBinary {

    static BigInteger bin2dec(String s){
        BigInteger res = new BigInteger("0");
        for(int i=s.length()-1,j=0;0<=i;i--,j++){
//            res=res+Integer.parseInt(String.valueOf(s.charAt(i)))*Math.pow(2,j);
            long ii=(long)(Integer.parseInt(String.valueOf(s.charAt(i)))*Math.pow(2,j));
            System.out.println(ii);
            res=res.add(new BigInteger(String.valueOf(ii)));
//
     //
            //System.out.println(ii);
        }
        return res;
    }

    static String dec2bin(long n){
        String bin="";
        while(0<n){
            long r=n%2;
            n=n/2;
            bin+=String.valueOf(r);
        }
        String bin2="";
        for(int i=bin.length()-1;0<=i;i--){
            bin2+=bin.charAt(i);
        }
        if(bin2.isEmpty()){
            bin2="0";
        }
        return bin2;
    }

//    public String addBinary(String a, String b) {
//        long res=bin2dec(a)+bin2dec(b);
//        return dec2bin(res);
//    }

    public static void main(String[] args) {
//        String b1="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
//        String b2="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
//        System.out.println(new AddBinary().addBinary(b1,b2));
//        System.out.println(bin2dec("1111"));
//        System.out.println(bin2dec(b2));
//
        BigInteger bi1 = new BigInteger("637824629384623845238423545642384");
        BigInteger bi2 = new BigInteger("3039768898793547264523745379249935");

        BigInteger bigSum = bi1.add(bi2);

        BigInteger bigProduct = bi1.multiply(bi2);

        System.out.println(bin2dec("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"));


    }
}
