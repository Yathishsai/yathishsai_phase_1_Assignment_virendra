package java_assesment;
 import java.util.Scanner;
 
 class Calculator {
	
		  public static void main(String[] args) {

		    char operator;
		    Double d1, d2, result;

		    
		    Scanner input = new Scanner(System.in);    

		 
		    System.out.println("Choose an operator: A, B, C,D  or E");
		    operator = input.next().charAt(0);

		    	   
		    System.out.println("Enter the first number");
		    d1 = input.nextDouble();

		    System.out.println("Enter the second number");
		    d2 = input.nextDouble();

		    switch (operator) {

		      
		      case 'A':
		        result = d1 + d2;
		        System.out.println( "Addtion of two numbres are "+ d1 + " + " + d2 + " = " + result);   
		        break;

		      
		      case 'B':
		        result = d1 - d2;
		        System.out.println("Subtraction of two numbres are "+d1 + " - " + d2 + " = " + result); 
		        break;

	   	      case 'C':
		        result = d1 * d2;
		        System.out.println("Multiplication of two numbres are "+d1 + " * " + d2 + " = " + result); 
		        break;

		      
		      case 'D':
		        result = d1 / d2;
		        System.out.println("Division of two numbres are "+d1 + " / " + d2 + " = " + result); 
		        break;

		        
		      case 'E':
			        result = d1 % d2;
			        System.out.println("Modulus of two numbres are "+d1 + " % " + d2 + " = " + result); 
			        break;
			        
			        
		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }

		    input.close();
		  }
		}
