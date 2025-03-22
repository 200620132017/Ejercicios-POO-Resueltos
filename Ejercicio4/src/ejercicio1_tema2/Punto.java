package ejercicio1_tema2;

public class Punto {
    private double x, y;
    private static int numPuntos;

    public Punto() {
        x = 0;
        y = 0;
        numPuntos++;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        numPuntos++;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString() {
        return "Punto(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Punto otro = (Punto) obj;
        return Double.compare(x, otro.x) == 0 && Double.compare(y, otro.y) == 0;
    }
}
