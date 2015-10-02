package src;

import java.awt.Graphics;
import src.Objects.Peice;

public class GameLogic {
    private Peice p[]=new Peice[7*6];
    private boolean[][] holding=new boolean[7][6];
    private boolean spawn=false;
    public GameLogic()
    {
        for(int i=0;i<p.length;i++)
            p[i]=null;
        for(int i=0;i<7;i++)
        {
            for(int o=0;o<6;o++)
                holding[i][o]=false;
        }
    }
    public void requestSpawn(int x,int y)
    {
        for(int i=0;i<p.length;i++)
        {
            if(p[i]==null)
            {
                p[i]=new Peice(0,mouseToSlot(x),-1);
                determine(p[i]);
                break;
            }
        }
    }
    private void determine(Peice pe)
    {
        
    }
    public int mouseToSlot(int x)
    {
        int out=-1;
        if(x>=0 && x<91)
            out=0;
        else if(x>=91 && x<(91*2))
            out=1;
        else if(x>=(91*2) && x<(91*3))
            out=2;
        else if(x>=(91*3) && x<(91*4))
            out=3;
        else if(x>=(91*4) && x<(91*5))
            out=4;
        else if(x>=(91*5) && x<(91*6))
            out=5;
        else if(x>=(91*6) && x<(91*7))
            out=6;
        return out;
    }
    public void draw(Graphics g)
    {
        for(int i=0;i<p.length;i++)
        {
            try
            {
                p[i].draw(g);
            }
            catch(Exception ex){}
        }
    }
}
