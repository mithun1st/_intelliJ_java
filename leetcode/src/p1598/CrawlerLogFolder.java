package p1598;

public class CrawlerLogFolder {
    static public int minOperations(String[] logs) {
        int step=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("./")){
                continue;
            }else if (logs[i].equals("../")){
                step--;
                if(step<0){
                    step=0;
                }
            }else{
                step++;
            }
            //System.out.println(step);

        }
        return  step;
    }

    public static void main(String[] args) {
//        ["d1/","d2/","../","d21/","./"]
        System.out.println(minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"}));
    }
}
