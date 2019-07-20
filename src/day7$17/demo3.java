package day7$17;


/**
 * 方法调用（几次幂）
 */

public class demo3 {
    public static void main(String[] args) {
        //调用pow方法，并用x接收
        int x = pow(5,3);
        System.out.println(x);

    }
    //封装方法
    public static int pow(int a, int n){
        int tmp = a;
        for (int i = 0; i < n - 1; i++) {
            a = a * tmp;
        }
            return a;
    }


}
