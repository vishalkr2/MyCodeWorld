public class factorial {

   static int fact(int n) {
       if (n == 0) return 1;


       return n * fact(n - 1);
   }

      // System.out.println(i);


       //return fact(n);

    public static void main(String args[]){
      // int n=5;
       // System.out.println(fact(5));
        int s=0;
        int j=1;//
        int a=5;
        for(int i=1;i<=a;i++){
           // i=i*a[i];
            j=j*i;


          // System.out.println(j);

        }
        System.out.println(j);
    }
}
