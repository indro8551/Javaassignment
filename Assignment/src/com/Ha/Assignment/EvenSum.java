package com.Ha.Assignment;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,result=0;
		for(i=0;i<=50;i++)
	       if(i%2==0)
	       {
	    	   result=result+i;
	    	   System.out.println(result);
	       }
		if(result%2==0)
		System.out.println("Result "+result+ " is Even" );
		else
		System.out.println("Result "+result+ " is Odd ");
	}


	}

