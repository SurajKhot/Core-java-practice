/*<applet code="EXP15_2.class" height=400 width=400>
<param name="Mumbai" value="25">
<param name="Delhi" value="38">
</applet>*/
public class EXP15_2 extends Applet
{
int i,j;
double temp,temp1;
Font f;
public void inti()
{
f=new Font("Arial",Font.BOLD,18);
setBackground(Color.red);
}
public void start()
{
i=Integer.parseInt(getParameter("Mumbai"));
j=Integer.parseInt(getParameter("Delhi"));
setFont(f);
}
public void paint(Graphics g)
{
temp=1.8*i+32;
temp=1.8*i+32;
g.drawString("temperature of Mumbai is "+temp+"f",90,150);
g.drawString("temperature of Delhi is"+temp+"f",90,200);
}
}
