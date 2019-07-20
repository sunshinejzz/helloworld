package day7$18;

import java.util.Arrays;

/**
 * 冒泡排序、选择排序（返回数组方法）
 */
public class huigu$$$ {
    public static void main(String[] args) {
        //创建静态数组
        int[] arr = {12,23,21,5,6,14,56,54};
    //**********************************************************
        //接收冒泡排序后的数组(保持原数组不变)
        int[] a = maopao(arr);
        //循环输出
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
    //**********************************************************
        //接收选择排序后的数组（原数组改变）
        /*int[] b = xuanze(arr);
        //循环输出
        for (int i : b) {
            System.out.println(i);
        }*/
    //*********************************************************
        System.out.println();
        System.out.println();
        //输出原数组
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    /*
    * 冒泡排序方法
    * */
    static int[] maopao(int[] arr1){
        //复制一份数组与原数组保持一致
        int[] arr = Arrays.copyOf(arr1,arr1.length);
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int imp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = imp;
                }
            }
        }
        return arr;
    }

    /*
    * 选择排序方法
    * */
    static int[] xuanze(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            //记录角标
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[index]>arr[j]){
                    int tmp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
