package p682;

import java.util.ArrayList;

public class BaseballGame {
    static public int calPoints(String[] operations) {
        ArrayList<Integer> score= new ArrayList<Integer>(0);
        //score generate
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                score.remove(score.size()-1);
            }else if(operations[i].equals("D")){
                score.add(score.get(score.size()-1)*2);
            }
            else if(operations[i].equals("+")){
                score.add(score.get(score.size()-1)+score.get(score.size()-2));
            }
            else {
                score.add(Integer.parseInt(operations[i]));
            }
        }
        //score sum
        int sum=0;
        for(int s : score){
            sum+=s;
        }
        return sum;
    }

    public static void main(String[] args) {
        //30
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
    }
}
