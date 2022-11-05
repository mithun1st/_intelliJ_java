package p1662;

public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";

        for(int i=0;i<word1.length;i++){
            for (int j=0;j<word1[i].length();j++){
                s1+=word1[i].charAt(j);
            }
        }
        for(int i=0;i<word2.length;i++){
            for (int j=0;j<word2[i].length();j++){
                s2+=word2[i].charAt(j);
            }
        }

        return s1.matches(s2);
    }
    public static void main (String[] atgs){
        String[] w1=new String[]{"abc", "d", "defg"};
        String[] w2=new String[]{"abcddefg"};
        System.out.println(new CheckIfTwoStringArraysAreEquivalent().arrayStringsAreEqual(w1,w2));
    }
}
