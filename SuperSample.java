class Box
{	double width,depth,height;
	Box(double de,double he,double we)
	{	depth=de;
		height=he;
		width=we;
	}
	double volume()
	{	return(width*depth*height);
	}
}
class BoxWeight extends Box
{	double weight;
	BoxWeight(double d,double h,double w,double we)
	{	super(d,h,w);
		weight=we;
	}
}
class SuperSample
{	public static void main(String[] args) 
	{	BoxWeight subobj= new BoxWeight(10,20,30,40);
		double vol;
		vol=subobj.volume();
		System.out.println("volume="+ vol);
		System.out.println("weight="+ subobj.weight);
	}
}
