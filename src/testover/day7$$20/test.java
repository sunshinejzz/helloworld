package testover.day7$$20;

public class test {


    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.setPinpai("联想");
        Student st = new Student();
        st.setName("张三");
        st.comp = c1;
        st.study();

    }

}
