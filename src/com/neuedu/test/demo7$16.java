package com.neuedu.test;

import java.util.Scanner;
/**
 * 鸡兔同笼；裴波那契数列；水仙花数；
 */
public class demo7$16 {

    public static void main(String[] args) {

        /*鸡兔同笼*/
        System.out.println("请输入头的个数：");
        Scanner scanner = new Scanner(System.in);
        int head = scanner.nextInt();
        System.out.println("请输入脚的个数：");
        int foot = scanner.nextInt();

        if (head > 0 && foot > 0 && (foot >= 2*head) && (foot <= 4*head) && (foot % 2 == 0)){
            int x = 0;
            int y = 0;
            x=(4*head-foot)/2;
            y = head - x;
            System.out.println("鸡有" + x + "只");
            System.out.println("兔有" + y + "只");
        }else {
            System.out.println("请输入正确的头和脚！");
        }

        /*裴波那契数列*/
        /*int a = 1;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 100; i++) {
            c = a+b;
            a = b;
            b = c;
            if (c >= 1000)
                break;
            System.out.println(c);
        }*/

        /*水仙花数*/
        /*for (int i = 100; i < 1000; i++) {
            int bai = i/100;
            int shi = (i%100)/10;
            int ge = i%10;
            if (Math.pow(bai,3) + Math.pow(shi,3) + Math.pow(ge,3) == i){
                System.out.println(i);
            }

        }*/



    }


}
