public class Without_num {
    public static void main(String args[]){
        int one='A'/'A';//1
        String s1="..........";

        for (int i=one;i<=(s1.length()*s1.length());i++){
            System.out.println(i);
        }
        //a=97,b=98 ,d=100
        for (int i=one;i<='d';i+=one){
            System.out.println(i);
        }
        for (int i = 'e'-'d'; i <='d' ; i++) {
            System.out.println(i+"\n");

        }
    }
}
