import java.applet.*;
import java.awt.*;
/* <applet code="DrawStringApplet" width="300" height="50">
<param name="message" value="123">
</applet>
*/
public class DrawStringApplet extends Applet
{	
	public String defaultMessage="Hello!";
	public void paint(Graphics g)
	{
		String inputFrmPage=this.getParameter("Message");
		if(inputFromPage==null)
			inputFromPage=defaultMessage;
		g.drawString(inputFromPage,50,25);
	}


}
