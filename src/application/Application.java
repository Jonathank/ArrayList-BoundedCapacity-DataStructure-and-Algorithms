package application;

import arraylist.ArrayList;

public class Application {

	public static void main(String[] args) {
		Integer a=2,b=3,c=4,d=5;
		
		ArrayList<Integer>list = new ArrayList<>();
		
		System.out.println("size: "+list.size());
		list.addnew( b);
		System.out.println("size: "+list.size());
		list.addnew( a);
		list.addnew( c);
		System.out.println("size: "+list.size());
		System.out.println("2nd  : "+list.get(2));
		System.out.println("removed  : "+list.remove(2));
		list.add(2, d);
		System.out.println("2nd  : "+list.get(2));
		list.add(3, 8);
		System.out.println("nnn : "+list.get(3));
		System.out.println("size: "+list.size());
		list.add(1, 60);
		System.out.println("@ 1 : "+list.get(1));
		
		System.out.println("size: "+list.size());
		
	}
}
