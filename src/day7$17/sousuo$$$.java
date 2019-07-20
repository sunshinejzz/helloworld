package day7$17;


import java.util.Arrays;

/**
 * 搜索
 */
public class sousuo$$$ {
    public static void main(String[] args) {
        //创建数组
        int[] arr = {12,23,5,45,21,6,34,21};
        boolean a = isExist(arr, 123);
        System.out.println(a);
    }
    //搜索方法（前提：数组排序完毕）
    static boolean isExist(int[] arr, int target){
        //数组排序
        Arrays.sort(arr);
        //查找
        int left = 0;
        int right = arr.length - 1;
        boolean flag = false;
        while(true) {
            if (arr[(left+right)/2] == target){
                System.out.println(arr[(left+right)/2]);
                flag = true;
                break;
            }else if(target < arr[(left+right)/2]){
                    right = (left+right)/2;
            }else {
                left = (left+right)/2;
            }
            if (left == right - 1){
                break;
            }
        }
        return flag;

    }
}
