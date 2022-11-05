package p6;

public class ZigzagConversion {
    public String convert(String s, int numRows) {

        if(numRows==1){
            return s;
        }

        int r=numRows;
        int l=s.length();

        String[][] matttix = new String[r][l/2+1];

        //init value
//        for(int i=0;i<matttix.length;i++){
//            for(int j=0;j<matttix[0].length;j++){
//               matttix[i][j]="-";
//            }
//        }


        //calculation
        int c=0;
        int len=1;
        matttix[0][0]=String.valueOf(s.charAt(0));
        while(c<l){
            for(int i=1;i<r && len<l;i++){
                matttix[i][c]=String.valueOf(s.charAt(len));
                len++;
            }
            c++;
            for(int i=r-2; i>=0 && len<l ;i--){
                matttix[i][c]=String.valueOf(s.charAt(len));
                len++;
                if(i!=0){
                    c++;
                }
            }
        }


        //print-------
//        for(int i=0;i<matttix.length;i++){
//            for(int j=0;j<matttix[0].length;j++){
//                System.out.print(matttix[i][j]+" ");
//            }
//            System.out.println();
//        }

        //print-------return
        String result="";
        for(int i=0;i<matttix.length;i++){
            for(int j=0;j<matttix[0].length;j++){
                if(matttix[i][j]!=null){
                    result+=matttix[i][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new ZigzagConversion().convert("xasdf",2);
    }
}
