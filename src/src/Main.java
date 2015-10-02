package src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import src.Objects.Board;
import src.Objects.Peice;

public class Main {
    public static JFrame frame=new JFrame();
    public static JPanel panel;
    public static Board board;
    public static GameLogic gl;
//    public static Peice p;
    public static void main(String[] args) {
        board=new Board();
        gl=new GameLogic();
//        p=new Peice(0,1,-1);
        frame.setSize(640,510);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(3);
        frame.setTitle("Connect 4");
        frame.setResizable(false);
        panel=new JPanel()
        {
            
            public void paintComponent(Graphics g)
            {//Board is 7x6 http://docs.oracle.com/javase/tutorial/networking/sockets/index.html
                super.paintComponent(g);
                RF(g);
                gl.draw(g);
                board.draw(g);
                g.setColor(Color.GREEN);
                g.fillRect(0,50,91,10);
                g.setColor(Color.RED);
                g.fillRect(91,50,91,10);
                g.setColor(Color.BLACK);
                g.fillRect(91*2,50,91,10);
                g.setColor(Color.GREEN);
                g.fillRect(91*3,50,91,10);
                g.setColor(Color.RED);
                g.fillRect(91*4,50,91,10);
                g.setColor(Color.BLACK);
                g.fillRect(91*5,50,91,10);
                repaint();
            }
        };
        panel.setBounds(0,0,frame.getWidth(),frame.getHeight());
        panel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                gl.requestSpawn(e.getX(),e.getY());
            }
        });
        frame.add(panel);
        frame.setVisible(true);
    }
    private static void RF(Graphics g)
    {
        g.clearRect(0,0,panel.getWidth(),panel.getHeight());
        g.setColor(Color.WHITE);
        g.fillRect(0,0,panel.getWidth(),panel.getHeight());
    }
}
