package p66;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean carry=true;

        for(int i=digits.length-1;0<=i;i--){
            if(carry){
                digits[i]=digits[i]+1;
                if(digits[i]==10){
                    digits[i]=0;
                    carry=true;
                }else{
                    carry=false;
                }
                if(i==0 && carry){
                    int[] digits1=new int[digits.length+1];
                    digits1[0]=1;
                    for(i=1;i<digits1.length;i++){
                        digits1[i]=digits[i-1];
                    }
                    return digits1;
                }
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        for(int i : new PlusOne().plusOne(new int[]{1,2,3})){
            System.out.print(i+" ");
        }
    }
}
