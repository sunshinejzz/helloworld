package testover.day7$$17;

import java.util.Arrays;
import java.util.Random;

public class testdemo4$$$ {

    /**
     * 创建数组，+冒泡排序， +查找
     * @param args
     */

    public static void main(String[] args) {

        //创建动态数组
        int[] jzz = new int[5];
        Random r = new Random();
    //给数组随机赋值
        for (int i = 0; i < jzz.length; i++) {
            jzz[i] = r.nextInt(10);
        }
        //遍历输出数组
        for (int i : jzz) {
            System.out.print(i + "  ");
        }
    //输出换行
        System.out.println();
    //冒泡排序
        for (int i = 0; i < jzz.length; i++) {
            for (int j = 0; j < jzz.length-1; j++) {
                if (jzz[j]>jzz[j+1]){
                    int tmp = jzz[j];
                    jzz[j] = jzz[j+1];
                    jzz[j+1] = tmp;
                }
            }
        }
        for (int i : jzz) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
    //调用函数
        /*boolean a=isExist(jzz, 5);
        System.out.println(a);*/
    }
    //查找数组中是否有指定值
    static boolean isExist(int[] jzz, int target){
        int left  = 0;
        int right = jzz.length-1;
        boolean find = false;
        while (true){
            if (jzz[(left+right)/2] == target){
                System.out.println(jzz[(left+right)/2]);
                find = true;
                break;
            }else if(target > jzz[(left+right)/2]){
                left = (left+right)/2;
            }else {
                right = (left+right)/2;
            }

            if (left == right - 1){
                break;
            }
        }
        return find;
    }



    /*public static void main(String[] args) {
        //定义静态数组
        int[] arr = {12,23,45,65,3,9,15,16,24};
        //排序
        Arrays.sort(arr);
        boolean a = isExists(arr,15);
        System.out.println(a);
    }

    static boolean isExists(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        boolean flag = false;
        while (true){
            if (arr[(left + right)/2] == target){
                System.out.println(arr[(left + right)/2]);
                flag = true;
                break;
            }else if(target > arr[(left + right)/2]){
                left = (left + right)/2;
            }else {
                right = (left + right)/2;
            }
            if (left == right - 1){
                break;
            }
        }
        return flag;
    }*/




}
