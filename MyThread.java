class MyThread 
{
	public static void main(String[] args) 
	{	
		Thread t=Thread.currentThread();
		System.out.println("welcome to multithreading");
		System.out.println("name="+t.getName());
		System.out.println("priority="+t.getPriority());
		t.setName("JAVA THREAD");
		System.out.println("after changing name="+t);
		Thread.currentThread().setPriority(4);
		System.out.println("after changing prority="+t);
	}
}
