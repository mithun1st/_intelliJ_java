package p541;

public class ReverseStringII {

    static public String reverseFnc(String s){
        String r="";
        for(char chh : s.toCharArray()){
            r=String.valueOf(chh)+r;
        }
        return r;
    }

    static public String reverseStr(String s, int k) {

        if(k>=s.length()){
            return reverseFnc(s);
        }

        boolean flipflop=true;
        String result="";
        for(int i=0;i<s.length();i+=k){
            String tem="";
            if(s.length()-i<=k){
                tem=s.substring(i,s.length());
            }else{
                tem=s.substring(i,i+k);
            }

            result= result + (flipflop ? reverseFnc(tem) : tem);
            flipflop=!flipflop;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefgh",3));
    }
}
