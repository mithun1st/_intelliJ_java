package p120;
import java.util.*;

public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        //        [[2],[3,4],[6,5,7],[4,1,8,3]]
        int sum=0;
        for(int i=0;i<triangle.size();i++){
//            System.out.println(  triangle.get(i).size()%2==1 ? (triangle.get(i).size()/2) : (triangle.get(i).size()/2)-1 );
//            System.out.println(triangle.get(i).get( triangle.get(i).size()%2==1 ? (triangle.get(i).size()/2) : (triangle.get(i).size()/2)-1 ));
            sum+=triangle.get(i).get( triangle.get(i).size()%2==1 ? (triangle.get(i).size()/2) : (triangle.get(i).size()/2)-1 );
        }
//        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(2)),
                        new ArrayList<>(Arrays.asList(3,4)),
                        new ArrayList<>(Arrays.asList(6,5,7)),
                        new ArrayList<>(Arrays.asList(4,1,8,3))
                )
        );

        new Triangle().minimumTotal(list);
    }
}
