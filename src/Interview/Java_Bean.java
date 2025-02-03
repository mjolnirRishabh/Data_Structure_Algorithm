package Interview;

public class Java_Bean implements java.io.Serializable {

        String name ;
        int roll;
        String branch;

    public Java_Bean() {
        this.name = name;
        this.roll = roll;
        this.branch = branch;
    }

    public static void main(String[] args) {

        Java_Bean bean = new Java_Bean();
        bean.name = "Rishabh";
        bean.roll = 18;
        System.out.println(bean.toString());
    }
}
