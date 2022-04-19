package mock;

import java.util.Arrays;

public class RemoveDupAndSort {
	
	public static void main(String[] args) {
		int[] arr= {4,5,6,4,5,3,5,3,8,4};
		arr=remove(arr);
		System.out.println(Arrays.toString(arr));
		}
		
		public static int[] remove(int[] arr) {
		    int index=0;
		for(int i=0;i<arr.length;i++) {
			for(index=i+1;index<arr.length;index++) {//for deleting duplicaelements
			if(arr[i]==arr[index]) {
				arr=deleteIndex(arr,index);}
			}
            }
		arr=sort(arr);
		return arr;
		}
public static int[] deleteIndex(int[] arr, int index) {
	  int[] arr1=new int[arr.length-1];
	  for(int i=0,k=0;i<arr.length;i++) { 
		  if(i!=index) {
			  arr1[k]=arr[i];
			  k++;}
	  }
	  return arr1;
}
public static int[] sort(int[] arr) {
	  for(int i=0;i<arr.length;i++) {
		//comparing adjacent elements
		for(int j=1;j<arr.length;j++) {
			int k=0;
			if(arr[j]<arr[j-1]) {
				k=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=k;	
			}
		}
	}
       return arr;
  }
}