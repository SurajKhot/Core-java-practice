import java.awt.*;
import java.applet.*;
/*<applet code="EXP15.class"height=200 width=300></applet>*/
public class EXP15 extends Applet implements Runnable
{
int i,x=20,y=20;
Thread t=new Thread();
public void inti()
{
t.start();
}
public void run()
{
repaint();
}
public void paint(Graphics g)
{
for(i=1;i<=10;i++)
{
try
{
g.drawString(""+i,x,y);
y=y+15;
Thread.sleep(100);
}
catch(Exception e){}
}
}
}
