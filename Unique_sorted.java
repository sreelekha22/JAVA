package codility_1;

import java.util.ArrayList;
import java.util.List;

public class Unique_sorted {
	static List<Integer> uniqueNumbers = new ArrayList<>();

	   public static void AddNumberToList(int[] num){
		   for(int i=0; i<num.length; i++) {
			   if(!uniqueNumbers .contains(num[i])) {
				   uniqueNumbers .add(num[i]);
			   }else {
				   System.out.println("Error: duplicate occured " + num[i]);
				   continue;
			   }
			   if(i>=5) {
				   System.out.println("size limit is 5. so, ignored rest of the numbers.");
				   break;
			   }
		   }
		   System.out.println(uniqueNumbers);
	    }
	public static void main(String[] args) {
		int[] intArray = {10,20,30,40,30,60,20,100,120};
		AddNumberToList(intArray);
	}

}
