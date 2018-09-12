class  StringBufferDemo

{
	public static void main(String[] args) 
	{
		
		StringBuffer sb=new StringBuffer("Hello World");
		System.out.println("length="+sb.length());
		System.out.println("capacity="+sb.capacity());
		sb.setLength(20);
		System.out.println("after set length");
		System.out.println(sb);
		System.out.println("new length="+sb.length());
		System.out.println("new capacity="+sb.capacity());
		sb.trimToSize();
		System.out.println("after trimming");
		System.out.println(sb);
		System.out.println("new length="+sb.length());
		System.out.println("new capacity="+sb.capacity());
		sb.deleteCharAt(3);
		System.out.println(sb);
		System.out.println("new length="+sb.length());
		System.out.println("new capacity="+sb.capacity());
		sb.replace(5,11,"Students");
		System.out.println("after replace");
		System.out.println(sb);
		System.out.println("new length="+sb.length());
		System.out.println("new capacity="+sb.capacity());
		sb.insert(5,"all");
		System.out.println("after insert");
		System.out.println(sb);
		System.out.println("new length="+sb.length());
		System.out.println("new capacity="+sb.capacity());
		sb.reverse();
		System.out.println("after reverse");
		System.out.println(sb);



	}
}
