import java.awt.*;
import java.applet.*;
/*<applet code="EXP16_2.class"height=400 width=400>
</applet>*/
public class EXP16_2 extends Applet
{
	String s1;
	public void init()
	{
		s1="Concentric Cirlces by IF5E ";
		Font f1=new Font("Calibri",Font.BOLD|Font.ITALIC,18);
		setFont(f1);
	}
	public void paint(Graphics g)
	{
		g.drawString(s1+" ",20,20);
		for(int i=50,j=100;i<=90;i=i+10,j=j-20)
		{
			g.setColor(new Color(i+40,j,200));
			g.fillOval(i+10,i+10,j-20,j-20);
		}
	}
}
