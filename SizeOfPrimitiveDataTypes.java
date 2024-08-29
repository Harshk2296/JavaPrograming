//Write Program to print size of int, float , double
package com.collegePrograms.MCA1;

//import javax.xml.datatype.DatatypeConfigurationException;

public class SizeOfPrimitiveDataTypes {

	public void byteSize() {
		int byteSize=Byte.SIZE/8;
		System.out.println( "1: byte size : "+byteSize+
				"\n Minimum Value "+Byte.MIN_VALUE+ 
				"\n Maximum Value "+ Byte.MAX_VALUE);
		
	}
	
	public void shortSize() {
		int shortSize=Short.SIZE/8;
		System.out.println( "2: char size : "+shortSize+
				"\n Minimum Value "+Short.MIN_VALUE+ 
				"\n Maximum Value "+ Short.MAX_VALUE);
		
	}
	public void charSize() {
		int charSize=Character.SIZE/8;
		System.out.println( "3: char size : "+charSize+
				"\n Minimum Value "+"\\u0000"+ 
				"\n Maximum Value "+ "\\uFFFF");
		
	}
	public void intSize() {
		int intSize=Integer.SIZE/8;
		System.out.println( "4: int size : "+intSize+
				"\n Minimum Value "+Integer.MIN_VALUE+ 
				"\n Maximum Value "+ Integer.MAX_VALUE);
		
	}
	public void longSize() {
		long longSize=Long.SIZE/8;
		System.out.println( "5: long size : "+longSize+
				"\n Minimum Value "+Long.MIN_VALUE+ 
				"\n Maximum Value "+ Long.MAX_VALUE);
		
	}
	public void floatSize() {
		double floatSize=Float.SIZE/8;
		System.out.println( "6: float size : "+floatSize+
				"\n Minimum Value "+Float.MIN_VALUE+ 
				"\n Maximum Value "+ Float.MAX_VALUE);
		
	}
	public void doubleSize() {
		double doubleSize=Double.SIZE/8;
		System.out.println( "7: double size : "+doubleSize+
				"\n Minimum Value "+Double.MIN_VALUE+ 
				"\n Maximum Value "+ Double.MAX_VALUE);
		
	}

	
	
}
