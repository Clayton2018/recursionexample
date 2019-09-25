public class RecursionExample {

    public static void main(String[] args) {

        recurseMethod(4);
        factorial(5);
        fibonacci(5);

    }

    private static void recurseMethod(int num) {

        if(num == 0){ return;}//end if

        else{

            System.out.println("Hello " + num);
            recurseMethod(--num);
            System.out.println("" + num);
            return;

        }//end else

    }//end recursiveMethod

    public static double factorial(double d){

        //sort elements by title case.
        if(d <= 1){

            return 1;

        }//end if

        else {

            return d * factorial(d -1);

        }//end else

    }//end factoral method

    //Non-linear Recursion Fibonacci Problem
    public static double fibonacci(double d){
        //sort elements by title case
        if(d < 2){

            return d;

        }//end if

        else {

            return fibonacci(d - 1) + fibonacci(d -2);

        }//end else


    }//end fibonacci

}//end class
