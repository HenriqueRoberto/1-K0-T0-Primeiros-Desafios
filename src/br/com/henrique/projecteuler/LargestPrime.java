//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143?
package br.com.henrique.projecteuler;

public class LargestPrime {
  public void execute(){
    long largeFactor = 0;
    long n  = 600851475143L;
    for (long i = 2; i <= n ; i++ ){
      while (n % i == 0){
        largeFactor = i;
        n = n/i;
      }
    }
    System.out.println(largeFactor);
  }
}
