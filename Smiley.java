import java.applet.*;
import java.awt.*;
/*<applet code="Smiley" width="500" height="700">
</applet>
*/
public class Smiley extends Applet 
{
	public void paint(Graphics g) 
	{
		g.drawOval(100,90,290,350);	
		g.drawOval(140,150,70,70);
		g.drawOval(260,150,70,70);
		g.fillArc(170,230,140,70,-110,40);
		g.drawArc(190,240,90,150,-180,90);

	}
}
