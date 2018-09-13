package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class hashMapSortByObject {
	
		private String name;
	    private int salary;
     
    public hashMapSortByObject(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }

	public static void main(String[] args) {
		List<hashMapSortByObject> l= new ArrayList<>();
		
		hashMapSortByObject e11= new hashMapSortByObject("g", 3000000);
		hashMapSortByObject e12= new hashMapSortByObject("f", 3000000);
		hashMapSortByObject e13= new hashMapSortByObject("e", 3);
		hashMapSortByObject e14= new hashMapSortByObject("d", 30000);
		hashMapSortByObject e15= new hashMapSortByObject("c", 3000);
		hashMapSortByObject e16= new hashMapSortByObject("b", 300);
		hashMapSortByObject e17= new hashMapSortByObject("a", 30);
		hashMapSortByObject e18= new hashMapSortByObject("z", 1000);
		l.add(e12);l.add(e11);l.add(e13);l.add(e14);l.add(e15);l.add(e16);l.add(e17);l.add(e18);
		l.sort((hashMapSortByObject o1, hashMapSortByObject o2)->o1.getSalary()-o2.getSalary());
		//l.forEach(System.out::println);
		
		
	HashMap<hashMapSortByObject,Integer> hm = new HashMap<>();
	hm.put(e11, 1);
	hm.put(e12, 2);
	hm.put(e13, 3);
	hm.put(e14, 4);
	hm.put(e15, 5);
	hm.put(e16, 6);
	hm.put(e17, 7);
	hm.put(e18, 8);
//	hm.forEach((key,value)->System.out.println(key+" "+value));
	
	 List<Map.Entry<hashMapSortByObject,Integer>> entryList = new ArrayList<Map.Entry<hashMapSortByObject,Integer>>(hm.entrySet());

     Collections.sort(
             entryList, new Comparator<Map.Entry<hashMapSortByObject,Integer>>() {

				@Override
				public int compare(Entry<hashMapSortByObject, Integer> o1, Entry<hashMapSortByObject, Integer> o2) {
					
					if(o1.getKey().salary > o2.getKey().salary){
			            return 1;
			        } else {
			            return -1;
			        }
				
				
				//for name 
						/* return o1.getKey().getName().
					               compareTo(o2.getKey().getName());*/
				// for salary
				
				/* if(e1.getSalary() > e2.getSalary()){
			            return 1;
			        } else {
			            return -1;
			        }
			    }*/

				}
             }
     
 );
     entryList.forEach(System.out::println);
	}
}
	
	
	
	
	
	