// Given a number, find the next prime number
package com.temp;

public class Temp {
  public static void main(String[] args) {
    System.out.println(nextPrime(7));
  }
  
  static int nextPrime(int n) {
    int ans = 0;
    int iter = n + 1;
    boolean isFound = false;
    while (!isFound) {
      boolean isPrime = true;
      for (int i = 2; i < iter / 2; i++) {
        if (iter % i == 0) {
          isPrime = false;
        }
      }
      if (isPrime == true) {
        isFound = true;
        ans = iter;
      }
      iter ++;
    }
    
    return ans;
  }
}