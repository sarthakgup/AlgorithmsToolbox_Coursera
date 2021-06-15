import java.util.Scanner;

//  6/14/21 Coursera course

class APlusB
{
    static int sumOfTwoDigits(int inputOne, int inputTwo)
    {
        int output = inputOne + inputTwo;
        return output;
    }


    //Starter code below
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(sumOfTwoDigits(a, b));
    }
}