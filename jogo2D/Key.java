import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key implements KeyListener{

    boolean praCima;
    boolean praBaixo;
    boolean praEsquerda;
    boolean praDireita;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == 87){
            praCima = true;
        }
        if(code == 83){
            praBaixo = true;
        }
        if(code == 65){
            praEsquerda = true;
        }
        if(code == 68){
            praDireita = true;
        }

        //w = 87
        //a = 65
        //s = 83
        //d = 68
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == 87){
            praCima = false;
        }
        if(code == 83){
            praBaixo = false;
        }
        if(code == 65){
            praEsquerda = false;
        }
        if(code == 68){
            praDireita = false;
        }
    }

    
}
