import java.applet.*;
import java.awt.*;

/*<applet code="Signal" width="500" height="700">
</applet>
*/
public class Signal extends Applet implements Runnable
{
		Thread t=new Thread();
	
	
	public void run()
	{
		t.start();
	}
	public void paint(Graphics g)
	{
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		g.drawRoundRect(170,190,170,290,50,60);
	try{	
		g.setColor(Color.RED);
		g.fillOval(230,230,50,50);
		Thread.sleep(500);
		g.setColor(Color.BLACK);
		g.fillOval(230,230,50,50);

		
		g.setColor(Color.YELLOW);
		g.fillOval(230,300,50,50);
		Thread.sleep(500);
		g.setColor(Color.BLACK);
		g.fillOval(230,300,50,50);


		g.setColor(Color.GREEN);
		g.fillOval(230,380,50,50);
		Thread.sleep(500);
		g.setColor(Color.BLACK);
		g.fillOval(230,380,50,50);
		repaint();
	}
	
	catch(InterruptedException e)
	{	System.out.println("interrupted");
	}
}
}

