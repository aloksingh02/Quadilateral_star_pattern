package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        for (int i =0;i<5;i++)
        {
            for(int k=4;k>i;k--)
            {
                System.out.print(" ");
            }
            for (int j=0;j<i;j++)
            {
                System.out.print((i+j)+" ");

            }
            System.out.println();

        }



    }
}
