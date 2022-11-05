package p1531;

import java.util.ArrayList;
import java.util.HashMap;

public class StringCompression {

//              aaa b ccc bb
    public int getLengthOfOptimalCompression(String s, int k) {

        ArrayList<String> list=new ArrayList<>(0);

        //separate pattern
        String tem="";
        for(int i=0;i<s.length();i++){
            tem+=s.charAt(i);
            if(i<s.length()-1&&s.charAt(i)==s.charAt(i+1)){
                continue;
            }
            list.add(tem);
            tem="";
        }

        //sort
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).length()<list.get(j).length()){
                    String t=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,t);
                }
            }
        }

        System.out.println(list);

        //remove max len
        for (int i=0;i<k;i++){
            list.remove(0);
        }

        System.out.println(list);

        //calculate len
        for(int i=0;i<list.size();i++){
            if(list.get(i).length()==1){
                tem+=list.get(i).charAt(0);
            }
            else{
                tem+=list.get(i).charAt(0)+String.valueOf(list.get(i).length());
            }
        }

        System.out.println(list);
        System.out.println(tem);

        return tem.length();
    }


    public static void main(String[] args){
        System.out.println(new StringCompression().getLengthOfOptimalCompression("aabbaa",2));;
    }
}
