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
public class CompilerError {
	 public static void main(String[] args) {
	        int a = 10; //outside variable	        
	        if (true) {
	            int b = 20; //local variable
	           System.out.println("InsideVariable: " + b);
	          System.out.println("OutsideVariable:" + a); 
	        } 
	        
	        //System.out.println("insideVariable: " + b); // Compiler Error occur we can't access local variable in outside of the block
	        System.out.println("OutsideVariable: " + a);
	    }
	}