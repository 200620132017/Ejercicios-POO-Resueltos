package Model;

public class Libro {
    private String sTitulo;
    private String sAutor;
    private String sIsbn;

    public Libro(String sTitulo, String sAutor, String sIsbn) {
        this.sTitulo = sTitulo;
        this.sAutor = sAutor;
        this.sIsbn = sIsbn;
    }

    public String getsTitulo() {
        return sTitulo;
    }

    public String getsAutor() {
        return sAutor;
    }

    public String getsIsbn() {
        return sIsbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "sTitulo='" + sTitulo + '\'' +
                ", sAutor='" + sAutor + '\'' +
                ", sIsbn='" + sIsbn + '\'' +
                '}';
    }
}
