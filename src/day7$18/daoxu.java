package day7$18;

/**
 * 数组倒序输出
 */
public class daoxu {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(arr);    //输出数组地址
        //输出原数组
        System.out.print("原数组：");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();  //换行

        for (int i = 0; i < arr.length/ 2; i++) {
            //第n个数与倒数第n个数互换位置
            int tmp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tmp;
        }
        //循环输出新数组
        System.out.print("新数组：");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


}
