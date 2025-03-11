public abstract class Poligono extends Figura {

    int lados;

    public Poligono(String tipo, int lados) {
        super(tipo);
        if (lados < 3) {
            throw new IllegalArgumentException("O polígono deve ter pelo menos três lados");
        }
        this.lados = lados;
    }

    public int getLados() {
        return lados;
    }

    @Override
    public String[] info() {
        return new String[]{"Lados: " + lados};
    }

    // Tornando os métodos de área e perímetro abstratos para que as subclasses os implementem
    public abstract double area();
    public abstract double perimetro();
}