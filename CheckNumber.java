public class CheckNumber {
    public static void main(String[] args) {
        int[] a={1,2,3,4,6,7};
        int exp=a.length+1;
        int t=exp*(exp+1)/2;
        //System.out.println(t);
        int s=0;
        for (int i = 0; i < a.length; i++) {
            s=a[i]+s;

        }
        System.out.println("missing number "+(t-s));

            }


        }
