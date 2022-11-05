package p12;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    /*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
    */

    public String intToRoman(int num) {
        Map<String,Integer> romanValue=new HashMap<>(){
            {
                put("I",1);
                put("V",5);
                put("X",10);
                put("L",50);
                put("C",100);
                put("D",500);
                put("M",1000);
            }
        };

        String roman="";
        while(num!=0){
            if(num>=romanValue.get("M")){
                num-=romanValue.get("M");
                roman+="M";
            }
            else if(num>=900){
                num-=900;
                roman+="CM";
            }
            else if(num>=romanValue.get("D")){
                num-=romanValue.get("D");
                roman+="D";
            }
            else if(num>=400){
                num-=400;
                roman+="CD";
            }
            else if(num>=romanValue.get("C")){
                num-=romanValue.get("C");
                roman+="C";
            }
            else if(num>=90){
                num-=90;
                roman+="XC";
            }
            else if(num>=romanValue.get("L")){
                num-=romanValue.get("L");
                roman+="L";
            }
            else if(num>=40){
                num-=40;
                roman+="XL";
            }
            else if(num>=romanValue.get("X")){
                num-=romanValue.get("X");
                roman+="X";
            }
            else if(num>=9){
                num-=9;
                roman+="IX";
            }
            else if(num>=romanValue.get("V")){
                num-=romanValue.get("V");
                roman+="V";
            }
            else if(num>=4){
                num-=4;
                roman+="IV";
            }
            else if(num>=romanValue.get("I")){
                num-=romanValue.get("I");
                roman+="I";
            }
        }

        return roman;
    }

    public static void main(String[] args) {

        System.out.println(new IntegerToRoman().intToRoman(694));
    }
}
