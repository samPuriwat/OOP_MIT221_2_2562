package lab6;

import java.util.StringTokenizer;

public class exStringBuffer {
    public static void main(String[] args) {

        // StringBuffer เป็นคลาส ที่มีเมธอดต่างๆ
        // ที่สามารถปรับปรุงแก้ไขข้อมูลที่เป็น String ได้มากกว่าคลาส String ทั่วไป

        StringBuffer strBuf = new StringBuffer("Hello");
        System.out.println(strBuf);
        //append() ใช้สำหรับต่อ String
        strBuf.append("Saiyai");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.delete(0,6);
        System.out.println(strBuf);


        //StringTokenizer
        String s = "On 31 December 2019, WHO was alerted to several " +
                "cases of pneumonia in Wuhan City, Hubei Province " +
                "of China. The virus did not match any other known virus. " +
                "This raised concern because when a virus is new, " +
                "we do not know how it affects people";
        // word counting
        StringTokenizer tokenizer = new StringTokenizer(s);
        int countWord = tokenizer.countTokens();
        System.out.println("Word count from message: "+countWord);

        // word cutting
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }//main

}//class
