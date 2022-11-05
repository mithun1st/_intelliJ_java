package p5;

public class LongestPalindromicSubstring {

    public static Boolean isPal(String s){
        String revS="";
        for (int i=s.length()-1;i>=0;i--){
            revS+=s.charAt(i);
        }
        return (revS.matches(s)) ? true : false;
    }

    public String longestPalindrome(String s) {

        if(s.length()==1) {
            return s;
        }
        else if(s.length()==2 && s.charAt(0)!=s.charAt(1)){
            return String.valueOf(s.charAt(0));
        }

        String longestPal=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+2;j<s.length()+1;j++){
                if(isPal(s.substring(i,j))&&s.substring(i,j).length()>longestPal.length()){
                    longestPal=s.substring(i,j);
                }
            }
        }

        return longestPal;
    }

    public static void main(String[] args) {
//        System.out.println(new LongestPalindromicSubstring().longestPalindrome("babab"));
        //System.out.println(new LongestPalindromicSubstring().longestPalindrome("abbaxabbabb"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }
}
