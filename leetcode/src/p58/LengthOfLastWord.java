package p58;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int l=s.length()-1;
        String str="";
        while( l>=0&&' '!=s.charAt(l)){
            str+=s.charAt(l);
            l--;
        }

        return str.length();
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  "));
    }
}
