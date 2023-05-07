
package computacao_grafica.desenhandoLinhas;

import javax.swing.JFrame;

public class Smile {

    public static void main(String[] args) {
        
        DesenharLinhas dl = new DesenharLinhas();
        JFrame jf = new JFrame();
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(dl);
        jf.setSize(400,400);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
}
