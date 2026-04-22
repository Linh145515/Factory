package decorator;

public class Circle implements Component {
	public Circle() {
		
	}
	@Override
	public void draw() {
		System.out.print("Drawing Circle");
	}

}
