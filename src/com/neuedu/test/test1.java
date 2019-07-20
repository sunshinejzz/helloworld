package com.neuedu.test;

public class test1 {

    public static void main(String[] args) {

        /*挤压打印三角形*/

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > i ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();


        /*输出26个字母*/
        /*for (int i = 97; i < 123; i++) {
            System.out.print((char)i);
        }
        for (int i = 121; i >= 97; i--) {
            System.out.print((char)i);
        }*/
        /*方法2*/
        for (int i = 97; i < 148; i++) {
            if (i<123){
            System.out.print((char)i);
            }else{
                System.out.print((char)(244-i));
            }
        }

    }
}
