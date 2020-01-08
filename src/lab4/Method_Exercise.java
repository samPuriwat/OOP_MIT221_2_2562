package lab4;

import java.util.Scanner;

public class Method_Exercise {
    //1. เขียนโปรแกรมเพื่อรับค่าจำนวนจริง 2 จำนวน จากนั้นสร้างเมธอดสำหรับ
    // บวก ลบ คูณ หาร แสดงผลทางจอภาพ

    public static void main(String[] args) {
        //1. input data
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number 1: ");
        double x = sc.nextDouble();
        System.out.print("Enter  number 2: ");
        double y = sc.nextDouble();

        //display
        System.out.println("The summation of "+x+"and "+y+": "+sum(x,y));

    }
    //sum
    public static double sum(double x, double y){
        return x + y;
    }
    //sub
    //mul
    //div
}
