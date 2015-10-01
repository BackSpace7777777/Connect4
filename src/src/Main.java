package src;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static JFrame frame=new JFrame();
    public static JPanel panel;
    public static void main(String[] args) {
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(3);
        frame.setTitle("Connect 4");
        frame.setResizable(false);
        panel=new JPanel()
        {
            public void paintComponent(Graphics g)
            {//Board is 7x6 http://docs.oracle.com/javase/tutorial/networking/sockets/index.html
                super.paintComponent(g);
                g.clearRect(0,0,panel.getWidth(),panel.getHeight());
                
                drawBoardFore(g);
                repaint();
            }
        };
        panel.setBounds(0,0,frame.getWidth(),frame.getHeight());
        frame.add(panel);
        frame.setVisible(true);
    }
    private static void drawBoardBack(Graphics g)
    {
        
    }
    private static void drawBoardFore(Graphics g)
    {
        
    }
    
}
