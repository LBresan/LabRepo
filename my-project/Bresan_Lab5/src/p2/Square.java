package p2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Square {
        
    private static Random generator = new Random();
        
    private int size;
    private int x;
    private int y;
    private int r;
    private int g;
    private int b;
    private Color color;
    
    static final int hundred = 100;
    static final int fourHundred = 400;
    static final int sixHundred = 600;

    public Square(){
        size = generator.nextInt(hundred) + hundred;
        x = generator.nextInt(sixHundred);
        y = generator.nextInt(fourHundred);
          
        color = new Color(generator.nextInt());
    }
    
    public void draw(Graphics page){
        
        page.setColor(color);
        page.fillRect(x,y,size,size);
    }
    
}
