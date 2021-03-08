package codility_1;

import java.util.ArrayList;

public class Remove_without_collection {
	static ArrayList<String> unique = new ArrayList<String>();
	
	public static void AddNumberToList(String[] arr){
		   for(int i=0; i<arr.length; i++) {
			   if(!unique .contains(arr[i])) {
				   unique .add(arr[i]);
			   }else
				   continue;  
		   }
		   System.out.println(unique);
	}
	public static void main(String[] args) {
		String[] Array = {"Jimmy", "Tommy", "nancy", "Jimmy", "Kitty"};
		AddNumberToList(Array);
	}

}
