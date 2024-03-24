package designPatterns2;

import java.util.ArrayList;

public class Singleton {
	private static Singleton instance;
	private ArrayList<String> students;
	private Singleton() {
		System.out.println("Class is instantiated");
		students=setStudents();
	}
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized(Singleton.class) {
				if(instance==null) {
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
	public void getStudents() {
		for(int i=0;i<students.size();i++)
		{
			System.out.println(students.get(i));
		}
	}
	private ArrayList<String> setStudents() {
		ArrayList<String> students=new ArrayList<String>();
		students.add("Kashish");
		students.add("Manish");
		students.add("Manasvi");
		students.add("Kavya");
		return students;
	}
}

