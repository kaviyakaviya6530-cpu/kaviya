import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int a=num.nextInt();
        int b=num.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+temp);
    }
    
}