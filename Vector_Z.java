package codility_1;

import java.util.Vector;

public class Vector_Z {

	public static void main(String[] args) {
        Vector<Character> vec = new Vector<Character>(); 
        vec.add('t');
        vec.add('e');
        vec.add('k');
        vec.add('a');
        vec.add('r');
        vec.add('c');
        vec.add('h');
        int input = 5;
        for(int i=3; i<input+3; i++) {
        	vec.insertElementAt('Z', i);
        }
        System.out.println(vec);
        
        for(int i=0; i<5; i++) {
        	vec.removeElementAt(6);	
        }
        System.out.println(vec);
	}

}
