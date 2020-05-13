
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bagat
 */
public class GrafikKullanimi extends JPanel {

    public GrafikKullanimi() {
        setBackground(Color.black);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.

        g.setColor(Color.red);
        g.drawRect(100, 10, 30, 40);
        g.fillRect(150, 20, 40, 60);
        g.setColor(Color.blue);
        g.drawOval(200, 30, 60, 60);
        g.fillOval(280, 40, 60, 60);
        g.setColor(Color.yellow);
        g.drawLine(100, 50, 280, 200);
        

    }

}
