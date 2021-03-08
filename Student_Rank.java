package codility_1;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;
class Student { 
    int rollno, marks; 
    String name; 
  
    public Student(int rollno, String name, 
                   int marks) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.marks = marks; 
    } 
  
    public String toString() 
    { 
        return this.rollno + " "
            + this.name + " "
            + this.marks; 
    } 
} 
public class Student_Rank {
 
	public static void main(String[] args) {
		TreeMap<Student, Integer> tree_map = new TreeMap<Student, Integer>(new Sortbyroll()); 
		 tree_map.put(new Student(11, "jimmy", 750), 1); 
		 tree_map.put(new Student(13, "tommy", 333), 2); 
		 tree_map.put(new Student(12, "nancy", 650), 5); 
		 tree_map.put(new Student(14, "jenny", 950), 3); 
		 tree_map.put(new Student(15, "simon", 826), 4); 

		 //System.out.println("TreeMap: "+ tree_map);
		 int i = 0;
		 for (Entry<Student, Integer> e : tree_map.entrySet()) {
	            System.out.println(e.getKey() + " : Rank " + (i+1)); 
		 i++;
		 if(i == 3)
			 break;
		 }
	}

}

class Sortbyroll implements Comparator<Student> { 

	public int compare(Student a, Student b) { 
		return b.marks - a.marks; 
	}

} 