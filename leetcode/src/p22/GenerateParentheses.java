package p22;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        String[] ar=new String[n*2];
        for(int i=0;i<n;i++){
            ar[i]="(";
        }
        for(int i=n;i<n*2;i++){
            ar[i]=")";
        }

        for(String s: ar){
            System.out.print(s);
        }

        return new ArrayList<>(0);
    }

    public static void main(String[] args) {
        new GenerateParentheses().generateParenthesis(3);
    }
}
