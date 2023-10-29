import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

public class Player {

    Rectangle rectangle = new Rectangle();

    Key key; 

    int x = 0;
    int y = 0;
    int speed = 5;

    Player(){

    }

    public void update(Key key){

        rectangle.x = x;
        rectangle.y = y;
        rectangle.width = 100;
        rectangle.height = 100;

        this.key = key;

        if(key.praCima){
            y-= speed;
        }if(key.praBaixo){
            y+= speed;
        }if(key.praDireita){
            x+=speed;
        }if(key.praEsquerda){
            x-=speed;
        } 
    }
    
    public void draw(Graphics2D g2){
        g2.setColor(Color.BLUE);
        g2.fillRect(x, y, 100, 100);
        g2.setColor(Color.BLACK);
        g2.draw(rectangle);
    }
}
