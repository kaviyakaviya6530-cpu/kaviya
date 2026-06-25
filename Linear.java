 import java.util.Scanner;
 public class Linear {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] linear=new int[n];
    for( int i=0;i<n;i++){
        linear[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    boolean isFound=false;
    for(int i:linear)
    {
      if(i==target){
    
        System.out.println("value found");
        isFound=true;

    }
}
      if(!isFound){
            System.out.println("  no value found");
}
    }
 }
    

