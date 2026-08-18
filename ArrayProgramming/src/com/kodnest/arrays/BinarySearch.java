package com.kodnest.arrays;

public class BinarySearch {

public static void display(int[]arr,int key)
{
	int low=0;
	int high=arr.length-1;
	int mid=(low+high)/2;
	while(low<=high)
	{
		if(key==arr[mid])
		{
			System.out.println("key"+key+"is present at index:"+mid);
			return;
			
		}
		else if(key>arr[mid])
		{
			low=mid+1;
			mid=(low+high)/2;
		}
		else
		{
			high=mid-1;
			mid=(low+high)/2;
		}
	
	
}
	System.out.println("key"+key+"is not found");
}
}
	


