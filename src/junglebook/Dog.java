package junglebook;

public class Dog extends Animal{
	int nails;
	String breed;
	public void drink() {
		System.out.println(name+"is lapping");
	}
	public void run() {
		System.out.println(name+"is running");
	}
	public void run(String alias) {
		System.out.println( alias+" "+name+"is running");
	}
	public void run(int duration) {
		System.out.println(name+"is running since "+duration+" hours");
	}
	public void run( String alias, int duration) {
		System.out.println( alias+""+name+"is running since"+duration+"hours");
	}
	public void run(int duration,String alias) {
		System.out.println( alias+""+name+"is running since"+duration+"hours-Switch");
	}
	public void bark() {
		System.out.println(name+"is barking");
	}
	public void sleep() {
		System.out.println(name+"is sleeping");
	}

}
