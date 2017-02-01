import java.awt.*;
import java.applet.*;
/*<applet code="MySkillTest.class" width=490 height=170>
<param name="String" value="Rushiraj">
</applet>
*/
public class MySkillTest extends Applet
{
	public void init()
	{
		setBackground(Color.yellow);
		setForeground(Color.magenta);
		Font f=new Font("Old English Text MT",Font.BOLD,70);
		setFont(f);
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello "+getParameter("String"),30,100);
	}
}