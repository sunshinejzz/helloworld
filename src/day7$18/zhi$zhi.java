package day7$18;

/**
 * 值传递(不改变原数)、址传递（改变原数）
 */
public class zhi$zhi {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int a = 10;
        for (int i : arr) {
            System.out.print(i+" ");
        }
            System.out.println(a);
        a =zhi(arr,a);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println(a);
    }

    static int zhi(int[] arr,int a){
        arr[1] = 9;
        a=100;
        return a;
    }
}