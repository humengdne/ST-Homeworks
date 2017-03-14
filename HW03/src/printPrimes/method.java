package printPrimes;

import java.awt.Dialog.ModalExclusionType;

public class method {
	/******************************************************* 
     * Finds and prints n prime integers 
     * Jeff Offutt, Spring 2003 
     ******************************************************/ 
    public  String printPrimes (int n) 
    { 
        int curPrime; // Value currently considered for primeness 
        int numPrimes; // Number of primes found so far. 
        boolean isPrime; // Is curPrime prime? 
        final int MAXPRIMES = 5;
        String s = null;
        int [] primes = new int [MAXPRIMES]; // The list of prime numbers. 

        // Initialize 2 into the list of primes. 
        primes [0] = 2; 
        numPrimes = 1; 
        curPrime = 2; 
        while (numPrimes < n) 
        { 
            curPrime++; // next number to consider ... 
            isPrime = true; 
            for (int i = 0; i <= numPrimes-1; i++) 
            { // for each previous prime. 
                if (isDivisible(primes[i], curPrime)) 
                { // Found a divisor, curPrime is not prime. 
                    isPrime = false; 
                    break; // out of loop through primes. 
                } 
            } 
            if (isPrime) 
            { // save it! 
                primes[numPrimes] = curPrime; 
                numPrimes++; 
            } 
        } // End while 
        
        // Print all the primes out. 
        for (int i = 0; i <= numPrimes-1; i++) 
        { 
            System.out.println ("Prime: " + primes[i]); 
            s += String.valueOf(primes[i]); 
        }
		return s; 
    } // end printPrimes
    public static boolean isDivisible(int a, int b)
    {
    	int c;
    	c = b % a;
    	if(c != 0){
    	  return false;
    	}
    	else{
		  return true;
    	}
    }

}
