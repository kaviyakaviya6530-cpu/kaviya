import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
       Scanner cal=new Scanner(System.in);
       int a=cal.nextInt(); 
       int b=cal.nextInt();
       char c=cal.next().charAt(0);
    switch(c){
        case '+':
            System.out.println(a+b);
            break;
        case '-':
            System.out.println(a-b);
            break;
        case '*':
            System.out.println(a*b);
            break;
        case '/':
            System.out.println(a/b);
            break;
        default:
            System.out.println("default ");
            break;
    }
    }
}
