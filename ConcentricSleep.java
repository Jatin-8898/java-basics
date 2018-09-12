import java.awt.*;
import java.applet.*;
import java.awt.event.*;
// <applet code="ConcentricSleep" width="300" height="300"></applet>
public class ConcentricSleep extends Applet
{	try
	{
		Thread t;
		
		int x1,y1;
		public void init()
		{	
				t=new Thread(this);
				addMouseListener(new MyMouseAdapter1(this));
		}
		public void paint(Graphics g)
		{
				public void run()
			{	g.setColor(Color.red);
				g.fillOval(x1-45,y1-45,90,90);
				Thread.sleep(1000);
			}
				g.setColor(Color.green);
				g.fillOval(x1-30,y1-30,60,60);
				Thread.sleep(1000);

				g.setColor(Color.blue);
				g.fillOval(x1-15,y1-15,30,30);
				Thread.sleep(1000);
			
		}
	}
			catch (Exception e){}
}
class MyMouseAdapter1 extends MouseAdapter
{
		ConcentricSleep obj;
		MyMouseAdapter1(ConcentricSleep refObj)
		{
				obj = refObj;
		}
		public void mouseClicked(MouseEvent me)
		{
				
				obj.x1=me.getX();
				obj.y1=me.getY();
				obj.repaint();
		}
}
