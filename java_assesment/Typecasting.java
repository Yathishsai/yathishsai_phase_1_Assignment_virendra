package java_assesment;

public class Typecasting {
		
		public static void main(String[] args) 
	    { 
	        String si="123";
	        int n = Integer.parseInt(si);
	        System.out.println("Conversion of String to int: "+n);
	        String sf="12.3";
	        float f=Float.parseFloat(sf);
	        System.out.println("Conversion of String to Float: "+f);
	        String sl="13824234324";
	        long l=Long.parseLong(sl);
	        System.out.println("Conversion of String to Long: "+l);
	        String sd="138.0988";
	        double d=Double.parseDouble(sd);
	        System.out.println("Conversion of String to Double: "+d);
	        String sb="Pavan";
	        String sb1="FALSE";
	        Boolean b1=Boolean.valueOf(sb);
	        Boolean b2=Boolean.valueOf(sb1);
	        System.out.println("Conversion of String to Boolean: "+b1);
	        System.out.println("Conversion of String to Boolean: "+b2);
	        String by="101";
	        byte b=Byte.parseByte(by);
	        System.out.println("Convertion of String to Byte: "+b);
	        char ch = sb.charAt(4);
	        System.out.println("Convertion of String to Character: "+ch);
	        
	        
	    } 
	}