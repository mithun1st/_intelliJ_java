package p36;

import java.util.ArrayList;
import java.util.List;

public class ValidSudoku {
    public static void print(char [][] ch){
        for(char[] c : ch){
            for(char c1 : c){
                System.out.print(c1+"\t");
            }
            System.out.println();
        }
    }

    public static boolean isDuplicateExist(char[] ch){
        List<Character> list=new ArrayList<Character>(0);
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='.') {
                continue;
            }
            list.add(ch[i]);
        }

        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    return true;
                }
            }
        }
        return false;
    }


    public boolean isValidSudoku(char[][] board) {

        char [] nxn=new char[9];
        int index=0;

        //horizontal
        //System.out.println("Main Hori");

        for(int i =0;i<board.length;i++){
            if(isDuplicateExist(board[i])){
                return false;
            }
        }

        //vertical
        //System.out.println("Main Ver");
        for(int i =0;i<board[0].length;i++){
            for (int j=0;j<board.length;j++){
                nxn[j]=board[j][i];
            }
            if(isDuplicateExist(nxn)){
                return false;
            }
        }


        //------------ 3x3
        //System.out.println("A Hori");
        index=0;
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                nxn[index]=board[i][j];
                index++;
            }
        }
        if(isDuplicateExist(nxn)){
            return false;
        }


        //System.out.println("A ver");
//        for(int i =0;i<3;i++){
//            for(int j=0;j<3;j++){
//                txt[j]=board[j][i];
//            }
//        }
//
//
//        //B
        //System.out.println("B Hori");
        index=0;
        for(int i =0;i<3;i++){
            for(int j=3;j<6;j++){
                nxn[index]=board[i][j];
                index++;
            }
        }
        if(isDuplicateExist(nxn)){
            return false;
        }

//        //System.out.println("B ver");
//        for(int i =3;i<6;i++){
//            for(int j=0;j<3;j++){
//                txt[j]=board[j][i];
//            }
//            if(isDuplicateExist(board[i])){
//                return false;
//            }
//        }
//
//        //C
//        //System.out.println("C Hori");
        index=0;
        for(int i =0;i<3;i++){
            for(int j=6;j<9;j++){
                nxn[index]=board[i][j];
                index++;
            }
        }
        if(isDuplicateExist(nxn)){
            return false;
        }
//        //System.out.println("C ver");
//        for(int i =6;i<9;i++){
//            for(int j=0;j<3;j++){
//                txt[j]=board[j][i];
//            }
//            if(isDuplicateExist(board[i])){
//                return false;
//            }
//        }
//
//
//        //D
//        //System.out.println("D Hori");
        index=0;
        for(int i =3;i<6;i++){
            for(int j=0;j<3;j++){
                nxn[index]=board[i][j];
                index++;
            }
        }
        if(isDuplicateExist(nxn)){
            return false;
        }

//        //System.out.println("D ver");
//        for(int i =0;i<3;i++){
//            for(int j=3;j<6;j++){
//                txt[j-3]=board[j][i];
//            }
//            if(isDuplicateExist(board[i])){
//                return false;
//            }
//        }
//
//        //E
//        //System.out.println("E Hori");
        index=0;
        for(int i =3;i<6;i++){
            for(int j=3;j<6;j++){
                nxn[index]=board[i][j];
                index++;
            }
        }
        if(isDuplicateExist(nxn)){
            return false;
        }

//        //System.out.println("E ver");
//        for(int i =3;i<6;i++){
//            for(int j=3;j<6;j++){
//                txt[j-3]=board[j][i];
//            }
//            if(isDuplicateExist(board[i])){
//                return false;
//            }
//        }
//
//
//        //F
//        //System.out.println("F Hori");
        index=0;
        for(int i =3;i<6;i++){
            for(int j=6;j<9;j++){
                nxn[index]=board[i][j];
                index++;
            }
        }
        if(isDuplicateExist(nxn)){
            return false;
        }

//        //System.out.println("F ver");
//        for(int i =6;i<9;i++){
//            for(int j=3;j<6;j++){
//                txt[j-3]=board[j][i];
//            }
//            if(isDuplicateExist(board[i])){
//                return false;
//            }
//        }
//
//        //G
//        //System.out.println("G Hori");
        index=0;
        for(int i =6;i<9;i++){
            for(int j=0;j<3;j++){
                nxn[index]=board[i][j];
                index++;
            }
        }
        if(isDuplicateExist(nxn)){
            return false;
        }
//        //System.out.println("G ver");
//        for(int i =0;i<3;i++){
//            for(int j=6;j<9;j++){
//                txt[j-6]=board[j][i];
//            }
//            if(isDuplicateExist(board[i])){
//                return false;
//            };
//        }
//
//        //H
//        //System.out.println("H Hori");
        index=0;
        for(int i =6;i<9;i++){
            for(int j=3;j<6;j++){
                nxn[index]=board[i][j];
                index++;
            }
        }
        if(isDuplicateExist(nxn)){
            return false;
        }
//        //System.out.println("H ver");
//        for(int i =3;i<6;i++){
//            for(int j=6;j<9;j++){
//                txt[j-6]=board[j][i];
//            }
//            if(isDuplicateExist(board[i])){
//                return false;
//            }
//        }
//
//        //I
//        //System.out.println("I Hori");
        index=0;
        for(int i =6;i<9;i++){
            for(int j=6;j<9;j++){
                nxn[index]=board[i][j];
                index++;
            }
        }
        if(isDuplicateExist(nxn)){
            return false;
        }
//        //System.out.println("I ver");
//        for(int i =6;i<9;i++){
//            for(int j=6;j<9;j++){
//                txt[j-6]=board[j][i];
//            }
//            if(isDuplicateExist(board[i])){
//                return false;
//            }
//        }
//


        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidSudoku().isValidSudoku(new char[][]{
                  {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}
        ));

    }
}