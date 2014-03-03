package p2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class DrawSquares extends JApplet{
    
    private static final byte SQUARES = 5;
    
    public void paint (Graphics draw){
        draw.setColor(Color.white);
        draw.fillRect(0,0, 800,600);
        for (int i = 0; i < SQUARES; i++) {
            Square square1 = new Square();
            square1.draw(draw);
        }
    }
}
