package primitivas;

import java.awt.Point;
import java.util.List;

public class Transformacoes {

    public double[][] multiplicar(double[][] a, double[][] b) {

        int aLin = a.length;
        int aCol = a[0].length;
        int bCol = b[0].length;

        double[][] c = new double[aLin][bCol];
        for (int i = 0; i < aLin; i++) {
            for (int j = 0; j < bCol; j++) {
                for (int k = 0; k < aCol; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public void translacao(List<Point> lista, int Tx, int Ty) {
        double T[][] = new double[][]{
            {1, 0, Tx},
            {0, 1, Ty},
            {0, 0, 1}
        };

        for (int i = 0; i < lista.size(); i++) {
            double p[][] = new double[][]{
                {lista.get(i).x},
                {lista.get(i).y},
                {1}
            };
            double n[][] = multiplicar(T, p);
            lista.set(i, new Point((int) n[0][0], (int) n[1][0]));
        }
    }

    private Point centroMassa(List<Point> lista) {
        int cX = 0, cY = 0;
        for (int i = 0; i < lista.size(); i++) {
            cX += lista.get(i).getX();
            cY += lista.get(i).getY();
        }
        cX = (int) cX / lista.size();
        cY = (int) cY / lista.size();
        return new Point(cX, cY);
    }

    public void escala(List<Point> lista, double Sx, double Sy) {
        double S[][] = new double[][]{
            {Sx, 0, 0},
            {0, Sy, 0},
            {0, 0, 1}
        };

        Point cm = centroMassa(lista);
        double T[][] = new double[][]{
            {1, 0, cm.x},
            {0, 1, cm.y},
            {0, 0, 1}
        };

        double MT[][] = multiplicar(T, S);
        T[0][2] = -cm.x;
        T[1][2] = -cm.y;
        MT = multiplicar(MT, T);

        for (int i = 0; i < lista.size(); i++) {
            double p[][] = new double[][]{
                {lista.get(i).x},
                {lista.get(i).y},
                {1}
            };
            double n[][] = multiplicar(MT, p);
            lista.set(i, new Point((int) n[0][0], (int) n[1][0]));
        }
    }

    public void rotacao(List<Point> lista, double theta) {

        theta = Math.toRadians(theta);
        double S[][] = new double[][]{
            {Math.cos(theta), -Math.sin(theta), 0},
            {Math.sin(theta), Math.cos(theta), 0},
            {0, 0, 1}
        };
        
    }
}
