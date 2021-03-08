package codility_1;

import java.util.ArrayList;
import java.util.Collections;

class ParkedCar {
	
    private String model;
    private String vehicleNumber;
    private int minutesParked;
    
    public ParkedCar(String model, String vehicleNumber, int minutesParked){
    	this.model = model;
    	this.vehicleNumber = vehicleNumber;
    	this.minutesParked = minutesParked;
    }
    public int getminutesParked(){
        return minutesParked;
    }
    public String getModel(){
        return model;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
}
public class Parking_mergeSort {

	public static void main(String[] args) {
		ArrayList<ParkedCar> list1 = new ArrayList<ParkedCar>();
		list1.add(new ParkedCar("Toyota", "KA03 3456", 50));
		list1.add(new ParkedCar("BMW", "AP03 1234", 30));
		list1.add(new ParkedCar("Tesla", "TS04 7890", 70));
		
		ArrayList<ParkedCar> list2 = new ArrayList<ParkedCar>();
		list2.add(new ParkedCar("Mercidez", "TN30 9876", 45));
		list2.add(new ParkedCar("Range Rover", "MR34 6543", 55));
		list2.add(new ParkedCar("KIA", "PN99 1199", 60));
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for(int i=0; i<list1.size(); i++) {
			a1.add(list1.get(i).getminutesParked());
		}
		for(int i=0; i<list2.size(); i++) {
			a1.add(list2.get(i).getminutesParked());
		}
		
        Collections.sort(a1, Collections.reverseOrder()); 
        System.out.println(a1);
        for(int i=0; i<list1.size(); i++) {
        	if (a1.get(0) == list1.get(i).getminutesParked()) {
        		System.out.println(list1.get(i).getModel());
        		System.out.println(list1.get(i).getVehicleNumber());
        		System.out.println(list1.get(i).getminutesParked());
        	}		
        }	
        for(int i=0; i<list2.size(); i++) {
        	if (a1.get(0) == list2.get(i).getminutesParked()) {
        		System.out.println(list2.get(i).getModel());
        		System.out.println(list2.get(i).getVehicleNumber());
        		System.out.println(list2.get(i).getminutesParked());
        	}		
        }	
	}

}
