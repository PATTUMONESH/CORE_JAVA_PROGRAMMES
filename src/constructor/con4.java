package constructor;
class apple
{
	String name;
	int id;
	String city;
	int marks;
	public apple(String name, int id, String city, int marks) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.marks = marks;
	}
	

	@Override
	public String toString() {
		return "apple [name=" + name + ", id=" + id + ", city=" + city + ", marks=" + marks + "]";
	}
	
}

public class con4 {

	public static void main(String[] args) {
		apple obj=new apple("monesh",101,"ap",99);
		System.out.println(obj.toString());
		

	}

}
