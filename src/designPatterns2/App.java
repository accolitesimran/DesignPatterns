package designPatterns2;

public class App {
	public static void main(String[] args) {
	
		//There are two different objects created but the class gets instantiated only once.
		//Thus the constructor is called only once.
		Singleton instance=Singleton.getInstance();
		Singleton newInstance=Singleton.getInstance();
		System.out.println(instance);
		System.out.println(newInstance);
		instance.getStudents();
		newInstance.getStudents();
	}
}
