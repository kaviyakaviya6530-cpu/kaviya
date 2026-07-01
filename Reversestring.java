public class Reversestring {
    public static void main(String[] args) {
        String s="Reverse";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();//reverse the string
        String reversedstring=sb.toString();//convert stringbuilder into string
        System.out.println(reversedstring);
    }
}
