package testover.day7$$18;

import java.util.Scanner;

/**
 * 递归
 */
public class demo2 {
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        int x = jiecheng(index);
        System.out.println(x);
    }

    static int jiecheng(int index){
        if (index> 0){
            return index * jiecheng(index - 1);
        }else {
            return 1;
        }
    }*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        jiecheng(index);
    }

    static void jiecheng(int index){
        if(index > 0){
            int imp = 1;
            for (int i = index; i > 0; i--) {
                imp = imp * index;
            }
            System.out.println(imp);
        }else {
            System.out.println("cuowu");
        }
    }

}
