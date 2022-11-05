package p13;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    /*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
     */
    public int romanToInt(String s) {
        Map<Character,Integer> romanKeyValue= new HashMap<>(0){
            {
                put('I',1);
                put('V',5);
                put('X',10);
                put('L',50);
                put('C',100);
                put('D',500);
                put('M',1000);
            }
        };

        int[] resultArray=new int[s.length()];
        int index=0;
        for (int i=0;i<s.length();i++){
            resultArray[index]+=romanKeyValue.get(s.charAt(i));
            if(i<s.length()-1 &&s.charAt(i)!=s.charAt(i+1)){
                if(s.charAt(i)=='I' && (s.charAt(i+1)=='V'||s.charAt(i+1)=='X')){
                    resultArray[index]*=-1;
                }
                if(s.charAt(i)=='X' && (s.charAt(i+1)=='L'||s.charAt(i+1)=='C')){
                    resultArray[index]*=-1;
                }
                if(s.charAt(i)=='C' && (s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
                    resultArray[index]*=-1;
                }
                index++;
                continue;
            }
        }

        int result=0;
        for(int i : resultArray){
//            System.out.print(i+"\t");
            result+=i;
        }


//        System.out.println();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }
}
