class Noofwords {
    public static void main(String[] args) {
        String s="Hello from java programming";
     int wordcount=0;
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)==32){
            wordcount++;
        }
     }
     System.out.println(wordcount++);
    }
}
