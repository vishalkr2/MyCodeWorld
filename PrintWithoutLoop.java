public class PrintWithoutLoop {
    //recursive function
    static void PrintNum(int no){
        if (no==0) return;
        else{
            PrintNum(no-1);
           System.out.println(no);
        }


//            no++;
//            PrintNum(no);//calling recursive function




    }
    public static void main(String[] args) {
        PrintNum(100);




    }
}
