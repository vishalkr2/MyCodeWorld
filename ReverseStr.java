public class ReverseStr {

    public static void main(String[] args) {
        String word="olleH dlrow";
        String word1="eyb";
        String rev="";
        for (int i=word.length()-1;i>=0;i--){
            rev=rev+word.charAt(i);
        }
        System.out.println(rev);
        StringBuffer b=new StringBuffer(word1);
        System.out.println(b.reverse());
    }
}
