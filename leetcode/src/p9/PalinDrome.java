package p9;

public class PalinDrome {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        boolean flag=true;
        for(int i=0,j=s.length()-1;i<s.length();i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                flag=false;
                break;
            }
        }
        return flag;
    }

    public static void main (String[] args){
        System.out.println(new PalinDrome().isPalindrome(88));

    }
}
