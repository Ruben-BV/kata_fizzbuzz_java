package org.factoriaf5.kata_fizzbuzz_java;

public class Fizzbuzz {

    public static void main(String[] args) {
        
        int number = 32;
        
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        
        boolean result01 = fizzbuzz.isDivisibleByThree(number);
        boolean result02 = fizzbuzz.isDivisibleByFive(number);


        if(result01 == true && result02 == false) {
            System.out.println("Fizz");
        }

        else if(result01 == false && result02 == true) {
            System.out.println("Buzz");
        }

        else if(result01 == true && result02 == true) {
            System.out.println("FizzBuzz");
        }

        else {
            System.out.println(number);
        }
    }

    public boolean isDivisibleByThree(int number) {
        
        if(number % 3 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isDivisibleByFive(int number) {
        
        if(number % 5 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}