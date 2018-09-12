abstract class Shapes
{	int side1,side2;
	void set(int s)
	{	side1=s;
		side2=0;
	}
	void set(int s1,int s2)
	{	side1=s1;
		side2=s2;
	}
	abstract void area();
	abstract void perimeter();
}
class Rectangle extends Shapes
{	void area()
	{
		System.out.println("AREA OF RECTANGGLE="+(side1*side2));
	}
	void perimeter()
	{
		System.out.println("PERIMETER OF RECTANGGLE="+(2*(side1+side2)));
	}
}
class Triangle extends Shapes
{	void area()
	{
		System.out.println("AREA OF TRIANGLE="+(0.5F*(side1*side2)));
	}
	void perimeter()
	{
		System.out.println("PERIMETER OF TRIANGLE="+(side1+side2+side1));
	}
}
class Square extends Shapes
{	void area()
	{
		System.out.println("AREA OF SQUARE="+(side1*side1));
	}
	void perimeter()
	{
		System.out.println("PERIMETER OF SQUARE="+(4*side1));
	}
}



class AbstractDemo
{
	public static void main(String[] args) 
	{
		Rectangle r= new Rectangle();
		Triangle t = new Triangle();
		Square s= new Square();
		r.set(10,20);
		t.set(20,30);
		s.set(10);
		r.area();
		r.perimeter();
		t.area();
		t.perimeter();
		s.area();
		s.perimeter();

	
	}
}
