import java.util.Scanner;

interface FindFib{
    public int calculate_fib(int a);
}
class FibIteration implements FindFib{
   @Override
    public int calculate_fib(int a) {
        if (a == 1 || a == 2){
            return 1;
        }
        int b = 1;
        int c = 1;
        int d = 0;
        for (int i = 3; i <= a; i++){
         d=b+c;
         b=c;
         c=d;
        }
        return d;
    }
}
class FibFormula implements FindFib{

    @Override
    public int calculate_fib(int a) {
        double fNOne = (1 + Math.sqrt(5))/2;
        return (int) Math.round((Math.pow(fNOne,a) - Math.pow(-fNOne, -a)) / Math.sqrt(5));
    }
}
public class Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to find the Fibonacci Series for:");
        int response = Integer.parseInt(sc.next());

        FibIteration fibIteration = new FibIteration();
        FibFormula fibFormula = new FibFormula();

        int iterationNumber = fibIteration.calculate_fib(response);
        int formulaNumber = fibFormula.calculate_fib(response);

        System.out.println("Fib of " + response + " by iteration is: " + iterationNumber +
                "\nFib of " + response + " by formula is: " + formulaNumber);

        //Got help from students in GroupMe to help understand how to format fibonacci formula into Java
    }
}
