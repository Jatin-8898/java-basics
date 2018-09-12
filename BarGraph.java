import java.applet.*;
import java.awt.*;
/*<applet code="BarGraph" width="1400" height="700">
</applet>
*/
public class BarGraph extends Applet 
{
	public void paint(Graphics g) 
	{
		g.drawLine(100,500,1200,500);
		g.fillRect(100,250,50,250);
		g.fillRect(150,120,50,380);
		g.fillRect(200,250,50,250);
		g.fillRect(300,180,50,320);
		g.fillRect(350,140,50,360);
		g.fillRect(400,300,50,200);
		g.fillRect(500,400,50,100);
		g.fillRect(550,350,50,150);
		g.fillRect(600,300,50,200);
		g.fillRect(700,250,50,250);
		g.fillRect(750,150,50,350);
		g.fillRect(800,350,50,150);

	}
}
