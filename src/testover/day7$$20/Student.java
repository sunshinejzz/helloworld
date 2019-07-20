package testover.day7$$20;

public class Student {
    private String name;
    private int age;
    private char sex;
    Computer comp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    void study(){
        System.out.println("我们学习" + comp.getPinpai() + this.name);
    }
}
