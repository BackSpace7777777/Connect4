package src.Objects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Peice {
    private int slotx,sloty,targetSlotX=1,targetSlotY=5;
    private int x,y,targetx,targety;
    private int team;
    public Peice(int team,int startSlotx,int startSloty)
    {
        this.team=team;
        y=6+(80*startSloty);
        x=15+(startSlotx*90);
        Thread movingThread=new Thread(new Runnable() {
            public void run() {
                while(true)
                {
                    targetx=15+(targetSlotX*90);
                    targety=6+(80*targetSlotY);
                    if(x<targetx)
                    {
                        x+=1;
                    }
                    else if(x>targetx)
                    {
                        x-=1;
                    }
                    if(y<targety)
                    {
                        y+=1;
                    }
                    else if(y>targety)
                    {
                        y-=1;
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {}
                }
            }
        });
        movingThread.start();
    }
    public void draw(Graphics g)
    {
        if(team==0)
            g.setColor(Color.RED);
        else
            g.setColor(Color.YELLOW);
        g.fillOval(x,y,69,69);
//        g.fillOval(15+(slotx*90),6+(80*sloty),69,69);
    }
    public void setMoveable(int slotX,int slotY)
    {
        x=15+(slotX*90);
        y=6+(80*slotY);
        targetSlotX=slotX;
        targetSlotY=slotY;
    }
    public void set(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void moveTo(int slotX,int slotY)
    {
        targetSlotX=slotX;
        targetSlotY=slotY;
    }
}
