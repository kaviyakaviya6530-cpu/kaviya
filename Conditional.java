class Conditional {
    public static void main(String[] args){
        int i=2;
        if(i<5){
            System.out.println("value is less than 5");
            if(i<3){
                System.out.println("value is less than 3");
            }
        }
        else if(i<10){
            System.out.println("value is less than 10");
        }
         else{
        System.out.println("value is greater than 10");
         }
        System.out.println("outside if-else block");
    }
   
    
}

