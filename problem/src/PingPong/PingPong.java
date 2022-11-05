package PingPong;
//https://slides.com/beavis28/deck-5#/7

public class PingPong {
    public static void main(String[] srgs){
        //input
        int time[][] = {{9,13},{11,15},{10,16},{17,18},{11,18}};
//        int time[][] = {{9,11}, {12,14}, {13,15}, {11,18}, {14,18}, {10,14}, {15,18}};
//        int time[][] = {{9,10}, {9,12}, {14,15}, {16,18}, {14,18}, {10,13}, {15,18}, {10,14}, {9,13}};


        //code
        int[] totalPlayTime =new int[18-9+1];
        for (int i=9;i<18;i++){
            int commonTime=0;
            for(int j=0;j<time.length;j++){
                if(time[j][0]<=i && time[j][1]>i){
//                    System.out.println(i);
                    commonTime++;
                }
            }
            totalPlayTime[i-9]=commonTime;
//            System.out.println(i+"-"+commonTime);
        }
        int singleHour=0;
        int doubleHour=0;
        for(int i=0;i< totalPlayTime.length-1;i++){
            if(totalPlayTime[i]>=2 && totalPlayTime[i]<4){
                singleHour++;
            }
//            System.out.println(totalPlayTime[i]);
        }
        for(int i=0;i< totalPlayTime.length-3;i++){
            if(totalPlayTime[i]>=4){
                doubleHour++;
            }
        }
        System.out.println(singleHour+","+doubleHour);
        System.out.println("Singles "+singleHour+" Hour, Doubles "+doubleHour+" Hour");
    }
}
