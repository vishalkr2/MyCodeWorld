import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] b=new int[] {1, 2, 3, 4, 5};

       int a=sc.nextInt();
        int c=0;
        for ( int i = 0;i<b.length;i++) {
            c=c+b[i];
        }
        System.out.println(c);

    }
}
