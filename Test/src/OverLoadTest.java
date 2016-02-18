
public class OverLoadTest {
	
	public static void main(String[] args){
		new OverLoadTest().test();
	
		
		int a = 4;
		}
	private void test(){
		Fruit fruit = new Apple();
		System.out.println(fruit.getName());
		
	}

}

class Fruit {
	private String name;

	public Fruit() {
		this.name = "unknown";
	}

	public String getName() {
		return name;
	}
}

class Apple extends Fruit {
	public String getName() {
		return "apple";
	}
}
