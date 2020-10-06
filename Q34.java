import java.util.Scanner;

class Circle{
	private double radius;
	private double area;
	
	Circle(){
		this.radius = 0;
		this.area = 0;
	}
	void init(){
		System.out.println("Enter Radius : " );
		Scanner sc = new Scanner(System.in);
		this.radius = sc.nextInt();
	}
	void calculateArea(){
		area = (22/7)*radius*radius;
	}
	void display(){
		System.out.println("\nArea of circle : " + area);
	}
}

class CircleDemo{
	public static void main(String []args){
		Circle c1 = new Circle();
		c1.display();
		c1.init();
		c1.calculateArea();
		}
}