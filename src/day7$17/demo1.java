package day7$17;

import java.util.Random;

/**
 * 创建数组：数组最小值、最大值、总和、平均值
 */
public class demo1 {
    public static void main(String[] args) {
        /*定义数组*/
        int[] arr = new int[5];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
            System.out.println(arr[i]);
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
            }
        }

        /*总和、平均值*/
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("总和" + sum);
        System.out.println("平均值为" + (sum / arr.length));
    }


}
