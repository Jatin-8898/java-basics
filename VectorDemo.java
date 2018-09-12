import java.util.*;
class  VectorDemo
{
	public static void main(String[] args) 
	{
		Vector v=new Vector(3);
		
		System.out.println("intial size="+v.size());
		System.out.println("intial capacity="+v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		System.out.println("capacity after addition="+v.capacity());
		v.addElement(new Double(5.45));
		System.out.println("current capacity="+v.capacity());
		v.addElement(new Double(6.08));
		System.out.println("current capacity="+v.capacity());
		v.addElement(new Double(9.04));
		System.out.println("current capacity="+v.capacity());
		v.addElement(new Integer(11));
		System.out.println("current capacity="+v.capacity());
		v.addElement(new Integer(12));
		System.out.println("current capacity="+v.capacity());
		System.out.println("first element="+(Integer)v.firstElement());
		System.out.println("last element="+(Integer)v.lastElement());
		
		Enumeration vEnum=v.elements();
		System.out.println("elements in vector=");
		while(vEnum.hasMoreElements())	
		System.out.println(vEnum.nextElement()+"");

	}
}
