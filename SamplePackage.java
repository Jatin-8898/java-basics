package p1;
class SamplePackage
{		SamplePackage()
	{	Protection p=new Protection();
		System.out.println("CONSTRUCTOR FOR SAMEPACKAGE"+"NON SUB CLASS");
		System.out.println("no="+p.no);
//		System.out.println("pri_no="+p.pri_no);
		System.out.println("pro_no="+p.pro_no);
		System.out.println("pub_no="+p.pub_no);
	}
}