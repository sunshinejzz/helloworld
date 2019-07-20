package day7$18;

import java.util.Scanner;

/**
 * 阶乘；递归；
 */
public class digui {
    /*//for循环
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        if(index>0){
            int tmp = 1;
            for (int i = index; i >0; i--) {
                tmp = tmp * i;
            }
            System.out.println(tmp);
        }

    }*/


    //递归
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        int a = jiecheng(index);
        System.out.println(a);
    }
    static int jiecheng(int index){
        if (index>0){
            return index * jiecheng(index-1);
        }else {
            return 1;
        }
    }


}
