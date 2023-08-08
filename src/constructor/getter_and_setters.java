package constructor;
class abc
{
	int id;
	String name;
	String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "abc [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
}

public class getter_and_setters {

	public static void main(String[] args) {
		abc obj=new abc();
		obj.setName("mony");
		obj.setId(101);
		obj.setCity("delhi");
		
		System.out.println(obj.getId());
		System.out.println(obj.getCity());
		System.out.println(obj.getName());
		

	}

}
