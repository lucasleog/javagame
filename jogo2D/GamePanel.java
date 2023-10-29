import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GamePanel extends JPanel implements Runnable{

    Player player = new Player();
    Enemy enemy = new Enemy();

    Thread thread;

    Key key = new Key();

    float FPS = 60;
    int segundos = 0;
    int contador = 0;

    GamePanel(){
        addKeyListener(key);
        setFocusable(true);
        setDoubleBuffered(true);
        // setBounds(0, 0, 1280, 720);
        // setBackground(Color.PINK);
        // setOpaque(true);
    }

    public void comecarJogo(){
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep((long) (1000/FPS));
            }catch (InterruptedException e){
            }
            update();
            repaint(); //metodo proprio do jpanel
        }
    }

    public void update(){       
        player.update(key);
        enemy.update(player);

        // contador++;
        // if(contador==60){
        //     segundos++;
        //     contador = 0;
        //     System.out.println(segundos);
        // }
        // System.out.println(segundos);

        //contndo os segundos por fps etc etc
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        player.draw(g2);
        enemy.draw(g2);
    }
}