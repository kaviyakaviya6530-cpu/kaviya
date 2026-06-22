import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String s=input.next();
        int age=input.nextInt();
        int percentage=input.nextInt();
        System.out.println("name="+s);
        System.out.println("age="+age);
        System.out.println("percentage="+percentage);
    }
    
}
