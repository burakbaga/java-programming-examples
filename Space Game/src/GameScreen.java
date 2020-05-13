
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class GameScreen extends JFrame {
    
    public GameScreen(String title) throws HeadlessException {
        super(title);
    }
    
    public static void main(String[] args) {
        GameScreen ekran = new GameScreen("Space Game");
        
        ekran.setResizable(false);// not resizable
        ekran.setFocusable(false); // focus jpanel
        ekran.setSize(800, 600);// screen size
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Game oyun = new Game();
        oyun.requestFocus(); // focus keyboad
        
        oyun.addKeyListener(oyun); // klavyeden işlemleri al
        
        oyun.setFocusable(true); // odak jpanele veril
        
        oyun.setFocusTraversalKeysEnabled(false); // for keyboard 
        
        
        ekran.add(oyun); //add jpanel to jframe
        
        ekran.setVisible(true);// when jpanel add to jframe show jframe
        
        
    }
    
}
