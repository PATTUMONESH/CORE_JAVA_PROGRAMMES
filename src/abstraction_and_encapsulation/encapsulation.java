package abstraction_and_encapsulation;
class encap
{
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}

public class encapsulation {

	public static void main(String[] args) {
		encap obj= new encap();
		obj.setA(12);
		obj.setB(10);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		

	}

}
