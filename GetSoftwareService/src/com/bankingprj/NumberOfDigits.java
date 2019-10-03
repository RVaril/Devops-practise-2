package com.bankingprj;

public class NumberOfDigits {

	public static void main(String[] args) {
		int count=0; int n= 1 ; 
		while (n!=0)
		{
			n/=10;
			count++;
			
		}
		System.out.println("Number of Digits: " + count);
	}

}
