package instanceofoperator;


//3. If we apply the instanceof operator with any variable that has null value, it returns false.
public class Dog2 {

	public static void main(String[] args) {
		
		Dog2 d2= null;
		
		System.out.println(d2 instanceof Dog2);
	}
}
