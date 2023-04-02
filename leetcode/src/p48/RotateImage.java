package p48;

public class RotateImage {



    public void rotate(int[][] matrix) {

        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int[] list=matrix[i];
                matrix[i]=matrix[j];
                matrix[j]=list;
            }
        }

        //print
//        for(int i=0;i<matrix.length;i++){
//            for (int j=0;j<matrix[i].length;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0, k=i; j<k ;j++,k--){
                //System.out.print(k+"/"+j+" ");
                int tem=matrix[k][j];
                matrix[k][j]=matrix[j][k];
                matrix[j][k]=tem;
            }
            //System.out.println();
        }

        //System.out.println();

        for(int i=1;i<matrix.length;i++){
            for(int j=i, k=matrix.length-1; j<k ;j++,k--){
                //System.out.print(k+"/"+j+" ");
                int tem=matrix[k][j];
                matrix[k][j]=matrix[j][k];
                matrix[j][k]=tem;
            }
            //System.out.println("");
        }




        //print
//        for(int i=0;i<matrix.length;i++){
//            for (int j=0;j<matrix[i].length;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
    }

    public static void main(String[] args) {

//        123
//        456
//        789

//        789
//        456
//        123

//        7410
//        8520
//        9630

        new RotateImage().rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
