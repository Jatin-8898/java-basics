import java.applet.*;
import java.awt.*;

/*<applet code="Signal" width="500" height="700">
</applet>
*/
public class Signal extends Applet implements Runnable
{
		Thread t;	
		t=new Thread(this,"second thread");
		t=new Thread(this,"third thread");
		t.start();
	
	public void paint(Graphics g)
	{
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		g.drawRoundRect(170,190,170,290,50,60);
		public void run()
		{		g.setColor(Color.RED);
				g.fillOval(230,230,50,50);
				Thread.sleep(500);
		}
		g.setColor(Color.YELLOW);
		g.fillOval(230,300,50,50);
		g.setColor(Color.GREEN);
		g.fillOval(230,380,50,50);
	}
}
class SignalDemo
{
		public static void main(String[] args)
	{	new NewThread();
		try
		{	for(int i=5;i>0;i--)
			g.setColor(Color.YELLOW);
			g.fillOval(230,300,50,50);
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			System.out.println("thread interrupted");
		}

	}
}

