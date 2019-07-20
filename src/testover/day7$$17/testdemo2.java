package testover.day7$$17;

/**
 * 冒泡排序算法  选择排序算法
 */
public class testdemo2 {
    /*public static void main(String[] args) {
        //定义动态数组
//        int[] arr = new int[5];
        //定义静态数组
        int[] arr = {12,23,25,9,15,36,54};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {      //arr.length - 1 - i减少循环次数
                if (arr[j] > arr[j+1]){
                    //交换位置
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        //必须遍历输出
        for (int i : arr) {
            System.out.println(i);
        }
    }*/


    public static void main(String[] args) {
        int[] arr = {12,23,25,9,15,36,54};
        for (int i = 0; i < arr.length-1; i++) {
            //记录角标
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[index] > arr[j]){
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }








}
