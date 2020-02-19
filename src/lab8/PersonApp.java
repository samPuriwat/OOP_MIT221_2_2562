package lab8;

public class PersonApp {

    public static void main(String[] args) {
        //create object
        Student std1 = new Student("1111111111111",
                "Puriwat Lertkrai",
                "STD001",
                "Information Technology");
        Person p1 = new Person("222222222222222",
                "Piyapong Senanus");

        System.out.println(std1.getName());
        System.out.println(p1.getName());

        System.out.println(std1.toString());
        System.out.println(p1.toString());





    }
}
