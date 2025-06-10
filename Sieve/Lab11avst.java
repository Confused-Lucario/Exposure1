package Sieve;
// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bound ===>>  ");
        final int MAX = input.nextInt();
        boolean primes[] = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        // start here
        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == true) {
                for (int k = 2; k * i < primes.length; k++) {
                    primes[(i * k)] = false;
                }


            }
        }

    }

    public static void displayPrimes(boolean primes[]){

        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        // Output all values of the list
        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == true) {
                if (i < 10) {
                    System.out.print("000" + i + " ");
                } else if (i < 100) {
                    System.out.print("00" + i + " ");
                } else if (i < 1000){
                    System.out.print("0" + i + " ");
                } else {
                    System.out.print(i + " ");
                }

            }
        }

        System.out.println();

    }

}