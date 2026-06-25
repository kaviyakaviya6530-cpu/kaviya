import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
           /////  System.out.print(arr[i]+"");
       //// int[] arr1={1,2,3,4,5};
       //// for(int i=0;i<arr1.length;i++){
            ////System.out.print(arr1[i]+"");
        }
        System.out.println(max);
       /// System.out.println(arr[3]);
        // System.out.println(arr1[3]);   
     }
}
