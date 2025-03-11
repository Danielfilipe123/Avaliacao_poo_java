public class Retangulo extends Poligono {

    int base, altura;

    public Retangulo(int base, int altura) {
        super("Retangulo", 4); // Passando os valores corretos para Poligono
        setBase(base);
        setAltura(altura);
    }

    public void setBase(int base) {
        if (base <= 0) {
            throw new IllegalArgumentException("A base deve ser maior que zero.");
        }
        this.base = base;
    }

    public void setAltura(int altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public void escalar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("O fator deve ser maior que zero.");
        }
        setBase((int) (base * fator));
        setAltura((int) (altura * fator));
    }

    @Override
    public String getTipo() {
        return "Retângulo";
    }

    @Override
    public int getLados() {
        return 4; // Todo retângulo tem 4 lados
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override

        
    public String[] info() {
        return new String[] {
            "Lados: " + getLados(),
            "Base: " + (double) base,
            "Altura: " + (double) altura 
        };
    }
}