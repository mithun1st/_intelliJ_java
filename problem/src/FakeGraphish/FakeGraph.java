package FakeGraphish;

public class FakeGraph {

    public static void FakeGraph(int r, int c){

        for(int j=0;j<c;j++){
            System.out.print(" ---");
        }
        System.out.println();
        for (int i=0;i<r;i++){

            for(int j=0;j<c+1;j++){
                System.out.print("|\t");
            }
            System.out.println();
            for(int j=0;j<c;j++){
                System.out.print(" ---");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FakeGraph(4,5);
    }
}
