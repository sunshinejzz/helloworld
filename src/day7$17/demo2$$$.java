package day7$17;

/**
 * 冒泡排序   +    选择排序     （独立源码）
 */
public class demo2$$$ {
    //冒泡排序
    /*public static void main(String[] args) {
        //创建数组
        int[] arr = {12,23,14,5,16,45,4,3};
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //交换位置
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        //循环输出数组
        for (int i : arr) {
            System.out.println(i);
        }
    }*/


    /*选择排序*/
    public static void main(String[] args) {
        int[] arr = {12, 23, 14, 5, 16, 45, 4, 3};
        for (int i = 0; i < arr.length-1; i++) {
            int index = i;// 记录角标
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}





