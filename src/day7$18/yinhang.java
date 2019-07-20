package day7$18;

import java.util.Scanner;

/**
 * 银行操作
 */
public class yinhang {
    static int money = 1000;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    //菜单
    static void menu(){
        while (true){
            System.out.println("*********************************");
            System.out.println("1.查询余额");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.退出");
            System.out.println("请输入功能号：");
            int index= input.nextInt();
            switch (index){
                case 1:
                    lookMoney();
                    break;
                case 2:
                    addMoney();
                    break;
                case 3:
                    drawMoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("没有此功能");
            }
        }
    }

    static void lookMoney(){
        System.out.println(money);
    }

    static void addMoney(){
        System.out.println("请输入存款金额：");
        int cun = input.nextInt();
        input.nextLine();      //消除回车
        money += cun;
        System.out.println("余额为：" + money);
    }

    static void drawMoney(){
        System.out.println("请输入取款金额：");
        int qu = input.nextInt();
        input.nextLine();      //消除回车
        if (money > qu){
            money -= qu;
            System.out.println("余额为：" + money);
        }
    }

    static void transferMoney(){
        System.out.println("请输入转账金额：");
        int zhuan = input.nextInt();
        input.nextLine();      //消除回车
        if (money > zhuan) {
            money -= zhuan;
            System.out.println("余额为：" + money);
        }
    }


}
