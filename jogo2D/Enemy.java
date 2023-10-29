import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

public class Enemy {

    Rectangle rectangle = new Rectangle();
    
    int x = 1000;
    int y = 580;
    int v = 3;
    float vX;
    float vY;
    float angulo;

    Enemy(){

    }

    public void update(Player player){ //aqui ele arregaçou dms começou a fazer umas conta de tangente na lousa slk to entendendo nada
        rectangle.x = x;
        rectangle.y = y;
        rectangle.width = 100;
        rectangle.height = 100;
        
        angulo = (float) Math.atan2(player.y - y, player.x - x);
        vX = (float) (v * Math.cos(angulo));
        vY = (float) (v * Math.sin(angulo));
        x += vX;
        y += vY;

        if(rectangle.intersects(player.rectangle)){
            System.out.println("AIAI");
        }
    }

    public void draw(Graphics2D g2){
        g2.setColor(Color.PINK);
        g2.fillRect(x, y, 100, 100);
        g2.setColor(Color.BLACK);
        g2.draw(rectangle);
    }
}
