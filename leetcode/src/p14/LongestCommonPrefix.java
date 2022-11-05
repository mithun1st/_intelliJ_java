package p14;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length==1){
            return strs[0];
        }

        //smallest string
        int smallIndex=0;
        int smallString= strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<smallString){
                smallString=strs[i].length();
                smallIndex=i;
            }
        }
//        System.out.println("SMALL- "+strs[smallIndex]);

        //calculate
        int l=0;
        Boolean brk=true;
        for(int i=0;i<strs[smallIndex].length();i++){
            for(int j=0;j<strs.length;j++){
//                System.out.print(strs[smallIndex].charAt(i)+"/"+strs[j].charAt(i)+"\t");
                if(strs[smallIndex].charAt(i)!=strs[j].charAt(i)){
                    l=i;
                    brk=false;
//                    System.out.println(i);
                    break;
                }
            }
            if(!brk){
                break;
            }
//            System.out.println();
        }
        if(brk){
            return strs[smallIndex];
        }

//        System.out.println(strs[0].substring(0,l));

        return strs[0].substring(0,l);
    }

    public static void main(String[] args) {

        String[] str=new String[]{"aflower","afloww","a","aflobc"};
//        String[] str=new String[]{"aflower","afloww","afloight","aflobc"};
//        String[] str=new String[]{"a","ab"};

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(str));
    }
}
