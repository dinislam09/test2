package com.test;

import org.testng.annotations.Test;

public class DoubleArray {
	
	
	
	@Test
	public void array() {
		
		
		int x;
		
		int y = 8;
		
		Object [] a = new Object[5];
		
		
		a[0]="4";
		a[1]=5;
		a[2]=6;
		a[3]=5;
		a[4]=7;
	
		
		int [][] k1 = new int[3] [2];
		
		
		k1[0][0]=8;
		k1[0][1]=9;
		
		
		//System.out.println(k1[2][2]);
		

		int [][] k= {{1,4,7},{5,8,9},{2,8}};
		
		int max=k[0][0];
		for(int i=0; i<k.length; i++) {
				for(int j=0; j<k[i].length; j++) {
				  if(k[i][j]>max) {
					  
					  max=k[i][j];
					  
				  }
					
					
				}
			
			
		}
		
		
		System.out.println(max);
		
	
		
		int [] a1 = {1,5,3,6};
		
		
		for(int i=0; i<a1.length;i++) {
			
			//System.out.println(a1[i]);
			
		}
		
		
		
	}
	
	
	

}
