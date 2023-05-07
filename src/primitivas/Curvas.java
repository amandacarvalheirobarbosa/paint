package primitivas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Curvas {

    public static void Hermite(Graphics g, Point p1, Point p2, double r1, double r2, Color rgb) {
        g.setColor(rgb);
        double x, y;
        for (double t = 0.0; t <= 1.0; t += 0.001) {
            x = (2 * t * t * t - 3 * t * t + 1) * p1.x + (-2 * t * t * t + 3 * t * t) * p2.x + (t * t * t - 2 * t * t + t) * r1 + (t * t * t - t * t) * r2;
            y = (2 * t * t * t - 3 * t * t + 1) * p1.y + (-2 * t * t * t + 3 * t * t) * p2.y + (t * t * t - 2 * t * t + t) * r1 + (t * t * t - t * t) * r2;
            g.drawLine((int) x, (int) y, (int) x, (int) y);
        }
    }
    
    public static void Bezier(Graphics g, Point p0, Point p1, Point p2, Point p3, Color rgb) {
        g.setColor(rgb);
        int n = 200;    // número de retas utilizadas para desenhar a curva
        double dt = 1.0 / n;
        double x = p0.x;
        double y = p0.y;
        double x0;
        double y0;

        for (int i = 1; i <= n; i++) {
            double t = i * dt;
            double u = 1 - t;
            double tt = 3 * t * u;
            double c0 = u * u * u;
            double c1 = tt * u;
            double c2 = tt * t;
            double c3 = t * t * t;

            x0 = x;
            y0 = y;
            x = c0 * p0.getX() + c1 * p1.getX() + c2 * p2.getX() + c3 * p3.getX();
            y = c0 * p0.getY() + c1 * p1.getY() + c2 * p2.getY() + c3 * p3.getY();
            g.drawLine((int) x0, (int) y0, (int) x, (int) y);
        }
    }


    public static void BSplines(Graphics g, java.util.List<Point> pts, Color rgb) {
        g.setColor(rgb);
        int m = 50, n = pts.size();
        float xA, yA, xB, yB, xC, yC, xD, yD,
                a0, a1, a2, a3, b0, b1, b2, b3, x = 0, y = 0, x0, y0;
        boolean first = true;
        for (int i = 1; i < n - 2; i++) {
            xA = pts.get(i - 1).x;
            xB = pts.get(i).x;
            xC = pts.get(i + 1).x;
            xD = pts.get(i + 2).x;
            yA = pts.get(i - 1).y;
            yB = pts.get(i).y;
            yC = pts.get(i + 1).y;
            yD = pts.get(i + 2).y;
            a3 = (-xA + 3 * (xB - xC) + xD) / 6;
            b3 = (-yA + 3 * (yB - yC) + yD) / 6;
            a2 = (xA - 2 * xB + xC) / 2;
            b2 = (yA - 2 * yB + yC) / 2;
            a1 = (xC - xA) / 2;
            b1 = (yC - yA) / 2;
            a0 = (xA + 4 * xB + xC) / 6;
            b0 = (yA + 4 * yB + yC) / 6;
            for (int j = 0; j <= m; j++) {
                x0 = x;
                y0 = y;
                float t = (float) j / (float) m;
                x = ((a3 * t + a2) * t + a1) * t + a0;
                y = ((b3 * t + b2) * t + b1) * t + b0;
                if (first) {
                    first = false;
                } else {
                    g.drawLine((int) x0, (int) y0, (int) x, (int) y);
                }
            }
        }
    }    

}
