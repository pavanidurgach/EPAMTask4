package com.epam.maven_oops;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		double p = sc.nextDouble();
		System.out.println("Enter the time : ");
		double t = sc.nextDouble();
		System.out.println("Enter the interest : ");
		double r = sc.nextDouble();
		Simple_Compound_Interest obj = new Simple_Compound_Interest();
		System.out.println("Simple Interest : "+obj.simpleInterest(p,t,r));
		System.out.println("Compound Interest : "+obj.compoundInterest(p,t,r));
		

	}

}
