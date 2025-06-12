import figurasGeometricas.CirculoDibujable;
import figurasGeometricas.CuadradoDibujable;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Crear figuras
        CirculoDibujable circulo = new CirculoDibujable(100, 50, 50);
        CuadradoDibujable cuadrado = new CuadradoDibujable(100, 200, 50);

        System.out.println("El perimetro del circulo es: " + circulo.getPerimetro());
        System.out.println("El area del circulo es: " + circulo.getArea());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.getPerimetro());
        System.out.println("El area del cuadrado es: " + cuadrado.getArea());

        JFrame frame = new JFrame("Dibujar figuras");
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                circulo.dibujar2D(g);
                cuadrado.dibujar2D(g);
            }
        };

        panel.setPreferredSize(new Dimension(500, 500));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}













