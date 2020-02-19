package lab8_2;

public class PersonApp {

    public static void main(String[] args) {

        //create objects
        Person P1 = new Person("Puriwat Lertkrai", "1986");
        Person P2 = new Sheriff("Piyapong Senanus",
                "1983", "Thungsong");
        Person P3 = new Police("Nattapong Kaewboonma",
                "1980", "Nakhorn");

        P1.introduce();
        P2.introduce();
        P3.introduce();



    }
}
