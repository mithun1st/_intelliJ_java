package p59;

public class SpiralMatrix {

    public enum Dir{
        RIGHT,DOWN,LEFT,UP
    }

    public int[][] generateMatrix(int n) {

        //create mattrix
        int[][] matrix=new int[n][n];

        //initialize
        int count=0;
        int r=0,c=0;
        Dir d=Dir.RIGHT;

        //assign value in matrix
        while (count< n*n){
            matrix[r][c]=count+1;
            count++;

            if(d==Dir.RIGHT && (c==n-1 || matrix[r][c+1]!=0)){
                d=Dir.DOWN;
            }else if(d==Dir.DOWN && (r==n-1 || matrix[r+1][c]!=0)){
                d=Dir.LEFT;
            }else if(d==Dir.LEFT && (c==0 || matrix[r][c-1]!=0)){
                d=Dir.UP;
            } else if(d==Dir.UP && (r==0 || matrix[r-1][c]!=0)){
                d=Dir.RIGHT;
            }

            if(d==Dir.RIGHT){
                c++;
            }else if(d==Dir.DOWN){
                r++;
            }else if(d==Dir.LEFT){
                c--;
            } else if(d==Dir.UP){
                r--;
            }

        }

        //print
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }

        return matrix;
    }

    public static void main(String[] args) {
        new SpiralMatrix().generateMatrix(4);
    }
}
