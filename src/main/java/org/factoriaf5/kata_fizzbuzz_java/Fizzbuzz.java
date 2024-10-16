package org.factoriaf5.kata_fizzbuzz_java;

public class Fizzbuzz {

    public static void main(String[] args) {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        int number = 60;
        System.out.print(fizzbuzz.fizzBuzz(number));
    }


    public String fizzBuzz(int number) {
        
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        
        boolean result01 = fizzbuzz.isDivisibleByThree(number);
        boolean result02 = fizzbuzz.isDivisibleByFive(number);
        boolean containsThree = fizzbuzz.containsThree(number);
        boolean containsFive = fizzbuzz.containsFive(number);


        if((result01 == true && result02 == false) || containsThree) {
            return "Fizz";
        }

        else if((result01 == false && result02 == true) || containsFive) {
            return "Buzz";
        }

        else if(result01 == true && result02 == true) {
            return "FizzBuzz";
        }

        else {
            return Integer.toString(number);
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

    public boolean containsThree(int number) {
        if(Integer.toString(number).indexOf("3") != -1){
            return true;
        }
        else{return false;}
        
    }

    public boolean containsFive(int number) {
        if(Integer.toString(number).indexOf("5") != -1){
            return true;
        }
        else{return false;}
    }
}