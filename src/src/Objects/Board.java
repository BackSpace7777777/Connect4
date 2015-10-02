package src.Objects;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Board {
    private ImageIcon board;
    public Board()
    {
        board=new ImageIcon(Board.class.getResource("/src/Objects/Connect4Board.png"));
    }
    public void draw(Graphics g)
    {
        g.drawImage(board.getImage(),0,0,null);
    }
}
