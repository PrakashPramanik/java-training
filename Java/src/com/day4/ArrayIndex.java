package com.day4;



class ArrayIndexOutOfIndexException extends RuntimeException {
	   public ArrayIndexOutOfIndexException(String m) {
	      super(m);
	   }
	}
public class ArrayIndex {
	public static void arryIndex(int[] arr, int i) {
		
	      if(i>=arr.length) {
	    	  throw new ArrayIndexOutOfIndexException("Array index out of bound exception.");
	      }
	      System.out.println("Result: " + arr[i]);
	   }
	 
	   public static void main(String[] args) {
	       try {
	    	   int[] arr= {2,3,4};
	    	   arryIndex(arr, 0);
	       } catch (Exception e) {
	          System.out.println("Caught Exception: " + e.getMessage());
	       }
	   }
}
