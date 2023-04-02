package p17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {

    static public ArrayList<String> numToLetters(String n){
        switch(n){
            case "2":
                return new ArrayList<String>(Arrays.asList("a","b","c"));
            case "3":
                return new ArrayList<String>(Arrays.asList("d","e","f"));
            case "4":
                return new ArrayList<String>(Arrays.asList("g","h","i"));
            case "5":
                return new ArrayList<String>(Arrays.asList("j","k","l"));
            case "6":
                return new ArrayList<String>(Arrays.asList("m","n","o"));
            case "7":
                return new ArrayList<String>(Arrays.asList("p","q","r","s"));
            case "8":
                return new ArrayList<String>(Arrays.asList("t","u","v"));
            case "9":
                return new ArrayList<String>(Arrays.asList("w","x","y","z"));
            default:
                return null;
        }
    }

    static public ArrayList<String> combinationTwo(ArrayList<String> l1,ArrayList<String> l2){
        ArrayList<String> result=new ArrayList<>(0);
        for(String s1 : l1){
            for(String s2: l2){
                result.add(s1+s2);
            }
        }
        return result;
    }


    static public List<String> letterCombinations(String digits) {

        if(digits.length()==0){
            return new ArrayList<>(0);
        }else if (digits.length()==1){
            return numToLetters(digits);
        }
        else{
            ArrayList r=combinationTwo(numToLetters(digits.substring(0,1)),numToLetters(digits.substring(1,2)));
            for(int i=2;i<digits.length();i++){
                ArrayList tem=r;
                r=combinationTwo(tem,numToLetters(digits.substring(i,i+1)));
            }
            return r;
        }

    }

    public static void main(String[] args){
        System.out.println(letterCombinations("2345"));
    }
}
