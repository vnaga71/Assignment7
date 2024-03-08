/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author venka
 */
import java.util.Scanner;

public class AverageWeight {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number of persons:");
	int n=sc.nextInt();
	double totalWeights=0.0;
	System.out.println("Enter the persons weights:");	
	double personWeights[]=new double[n];
	
	for(int i=0;i<n;i++) {
		 personWeights[i]=sc.nextDouble();
	}
	 System.out.println("Persons Weights:");
	for(int i=0;i<n;i++) {
		 System.out.println(personWeights[i]);
	}
	for (double weights : personWeights) {
		 totalWeights+=weights;
    }
	double avg=totalWeights/n;
	System.out.println("AvarageWeight is:"+avg);
	
	}

}