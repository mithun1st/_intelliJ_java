package p1832;

import java.util.HashMap;

public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        for(int i=97;i<=122;i++){
            Boolean isExit=false;
            for(int j=0;j<sentence.length();j++){
                if(sentence.charAt(j)==i){
                    isExit=true;
                    break;
                }
            }
            if(!isExit){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(new CheckIfTheSentenceIsPangram().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}
