import java.applet.*;
import java.awt.*;
/*<applet code="PieChart" width="1000" height="700">
</applet>
*/
public class PieChart extends Applet 
{
	public void paint(Graphics g) 
	{

		English(g);
		Science(g);
		Mup(g);
		Wpd(g);
		Maths(g);
	}
		public void English(Graphics g)
	{	
		g.setColor(Color.RED);
		g.drawString("English",240,80);
		g.fillArc(230,250,310,310,0,45);		
	}
		public void Science(Graphics g)
	{	g.setColor(Color.YELLOW);
		g.drawString("Science",240,100);
		g.setColor(Color.YELLOW);
		g.fillArc(230,250,310,310,45,90);
	}
		public void Mup(Graphics g)
	{	
		g.setColor(Color.BLUE);
		g.drawString("Mup",240,120);
		g.fillArc(230,250,310,310,90,100);
	}
		public void Wpd(Graphics g)
	{	
		g.setColor(new Color(100,200,84));
		g.drawString("Wpd",240,140);
		g.fillArc(230,250,310,310,180,115);
	}	
	
		public void Maths(Graphics g)
	{	
		g.setColor(Color.PINK);
		g.drawString("Maths",240,160);
		g.fillArc(230,250,310,310,290,90);
	}

	
}