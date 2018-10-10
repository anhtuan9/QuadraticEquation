import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số thứ 1");
        double a = input.nextDouble();
        System.out.println("nhập số thứ 2");
        double b = input.nextDouble();
        System.out.println("nhập số thứ 3");
        double c = input.nextDouble();
        QuadraticEquation pt = new QuadraticEquation(a,b,c);
        if (pt.getRoot1()== pt.getRoot2()){
            System.out.println(pt.getRoot1());
        }else {
            System.out.println(pt.getRoot1() + " " + pt.getRoot2());
        }
    }
}
