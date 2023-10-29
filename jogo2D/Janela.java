import javax.swing.JFrame;

public class Janela extends JFrame{

    GamePanel gamePanel = new GamePanel();

    Janela(){
        setSize(1200, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Jogo 2D MEUDEUS");
        add(gamePanel);

        setLocationRelativeTo(null);
        setVisible(true);
        gamePanel.comecarJogo();
    }
} 