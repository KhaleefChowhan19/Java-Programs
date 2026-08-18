package com.kodnest.arrays;

public class Search {
public static String linearSearch(int[]arr,int key)
{
	for(int i=0;i<=arr.length-1;i++)
	{
		if(key==arr[i])
		{
			return("key"+key+"is present at index :"+i);
		}
	}
	return("key"+key+"is not present");
}
}
