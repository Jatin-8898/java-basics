package p2;
class OtherPackage 
{	
	OtherPackage()
	{	p1.Protection p=new p1.Protection();
		System.out.println("DIFF PACKAGE NON SUB CLASS CONST");
//		System.out.println("n="+no);
//		System.out.println("pri_n="+pri_no);
//		System.out.println("pro_n="+pro_no);
		System.out.println("pub_n="+p.pub_no);
	}
}
