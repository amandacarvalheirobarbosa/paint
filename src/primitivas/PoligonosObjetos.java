package primitivas;

import java.awt.Color;
import java.awt.Graphics;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;

public class PoligonosObjetos {

    private Random rn = new Random();
    private MinhasLinhas ml[];
    
    
    public void smile(Graphics g) {
        //desenhando a carinhas
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        //desenhando os olhos
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        //desenhando a boca
        g.fillOval(50, 110, 120, 60);

        //retocando a boca para criar um sorriso
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
        
        Color c = new Color(rn.nextInt(256), rn.nextInt(256), rn.nextInt(256));
    }
    
     public void desenharLinhas() {
        ml = new MinhasLinhas[5 + rn.nextInt(5)^2];
        for (int i = 0; i < ml.length; i++) {
            //gerando linhas aleatorias
            int x1 = rn.nextInt(200);
            int y1 = rn.nextInt(300);
            int x2 = rn.nextInt(400);
            int y2 = rn.nextInt(300);

            //gerar cores aleatorias
            Color c = new Color(rn.nextInt(256), rn.nextInt(256), rn.nextInt(256));

            //adiciona as linahs a listas de linhas
            ml[i] = new MinhasLinhas(x1, y1, x2, y2, c);
        }
    }
    
    /*public void casa(){
        
    }
    
    public void carro(){
        
    }*/

}
