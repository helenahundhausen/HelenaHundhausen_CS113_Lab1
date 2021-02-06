package edu.miracosta.cs112.helenahundhausen;
//Write a program that prints the numbers from 1 to 100
//How to turn it in
public class Main {
    public static void main(String[] args) {
        String buzz = "Buzz";
        String fizz = "Fizz";
        int n = 100;

        for (int i = 1; i <= n; i++)
        {
            //numbers that can be multiplied by both three and five print "FizzBuzz"
            if(i%15 == 0)
                System.out.print(fizz + buzz + " ");
            //numbers that can be multiplied by 3 print "Fizz"
            else if (i%3 == 0)
                System.out.print(fizz + " ");
            //numbers that can be multiplied by 5 print "Buzz"
            else if(i%5 == 0)
                System.out.print(buzz + " ");
            //if the number can not be divided in any situation just print
            else
                System.out.print(i + " ");
        }
    }
}

