package mivneiNetunim;

import java.util.Arrays;

public class Ex1 {

	 public static void QuickSort (int[] arr){
		  QuickSort (arr, 0, arr.length-1);
	  }
	 
	 public static void QuickSort(int[] arr, int start, int end) {
		 if(start < end) {
		 	int[] pivots=Partition(arr,start,end);	
		 	int pivot1=pivots[0];
		 	int pivot2=pivots[1];
		 	QuickSort(arr, start, pivot1-1); //Sort the left part of the array
		 	QuickSort (arr, pivot1+1, pivot2-1); //Sort the middle part of the array
		 	QuickSort(arr, pivot2+1, end); //Sort the right part of the array
		 }
	 }
	 
	  public static int[] Partition(int[] arr, int low, int high) {
		  int[]pivots=new int[2];
	 
	      int pivot1=arr[low];   //Defining the pivots as members in the end positions in the array
	      int pivot2=arr[high];
	 
	      if (pivot1>pivot2){      //Verifying that Pivot 1 is smaller than Pivot 2
	          swap(arr, low, high);
	          pivot1=arr[low];
	          pivot2=arr[high];
	      }
	      else if (pivot1==pivot2){     //Make sure the pivots are not equal
	          while (pivot1==pivot2 && low<high){
	              low++;
	              pivot1=arr[low];
	          }
	      }
	      int i=low+1;
	      int st=low+1;
	      int bt=high-1;
	 
	      while (i<=bt){
	 
	          if (arr[i]<pivot1){
	              swap(arr, i, st);   //If the value in place i is less than pivot 1 we will move it backwards
	              i++;
	              st++;
	          }
	          else if (pivot2<arr[i]){  //If the value in place i is greater than pivot 2 we will move it forward
	              swap(arr, i, bt);
	              bt--;
	          }
	          else{    //else, we will not move it and only promote the i
	              i++;
	          }
	 
	      }
	      st--;  //We came with 'st' one step further too far so we will lower it by 1
	      swap(arr, low, st); //Move the pivot1 to the correct position in the sorted array
	      bt++;   //We came with 'bt' one step back too much so we will advance him by 1
	      swap(arr, high, bt); //Move the pivot2 to the correct position in the sorted array
	    pivots[0]=st;
	    pivots[1]=bt;
	    return pivots;
	 
	  }
	  
	  public static void swap(int[] arr,int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {9,8,7,6,5,4,3,2,1};
//		int[] arr2 = {87,81,98,75,76,12,25};
//		QuickSort(arr2);
//		System.out.println(Arrays.toString(arr2));
	}

}
