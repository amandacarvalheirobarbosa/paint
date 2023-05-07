/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class MinhasLinhas extends JPanel{
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color cor; //cor das linhas 

    public MinhasLinhas() {
    }
    
    public MinhasLinhas(int x1, int y1, int x2, int y2, Color cor) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.cor = cor;
    }
    
    public void desenhar(Graphics g){
        g.setColor(cor);
        g.drawLine(x1, y1, x2, y2);
    }
}
