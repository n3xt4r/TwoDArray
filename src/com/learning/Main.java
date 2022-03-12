package com.learning;

public class Main {
    public static void main(String args[]) {
        String text = "One does not simply walk into Mordor";
        String transposeMatrixText = "";
        char boxChar[][] = new char[6][6];
        int i,j;
        // matrix
        for(i=0;i<6;i++) {
            for(j=0;j<6;j++) {
                boxChar[i][j] = text.charAt(i*6+j);
                System.out.print(boxChar[i][j] + " ");
            }
            System.out.println();
        }
        //transpose matrix
        for(i=0;i<6;i++) {
            for(j=0;j<6;j++) {
                transposeMatrixText=transposeMatrixText+boxChar[j][i];
            }
            System.out.println();
        }
        System.out.println(transposeMatrixText);
    }
}