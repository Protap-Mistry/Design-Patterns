package factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape_factory sf= new Shape_factory();
		
		Shape s= sf.getShape("circle");
		s.draw();
		
		Shape s2= sf.getShape("square");
		s2.draw();
	}

}
