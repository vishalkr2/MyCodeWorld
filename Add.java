import java.util.Arrays;
import java.util.BitSet;


public class Add {
    public static void main(String[] args) {
        Object num[]=new Object[100];
        Arrays.fill(num,new Object(){
            int i=0;

                    @Override
                    public String toString() {
                        return Integer.toString(++i);
                    }
                });
        System.out.println(Arrays.toString(num));
        String set=new BitSet(){
            {
                set(1,100);
            }
        }.toString();
        System.out.append(set,1,set.length());
    }
}
