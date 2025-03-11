public class Circulo extends Figura {
    double raio;

    // Construtor que define o tipo e valida o raio
    public Circulo(double raio) {
        // Chama o construtor da classe Figura com o tipo "Círculo"
        super("Círculo");

        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    // Getter para o raio
    public double getRaio() {
        return raio;
    }

    // Setter para o raio, com validação
    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    // Retorna o tipo do círculo (já definido na classe Figura)
    @Override
    public String getTipo() {
        return super.getTipo(); // Retorna "Círculo" (herdado de Figura)
    }

    // Retorna as informações do círculo
    @Override
    public String[] info() {
        return new String[]{"Raio: " + raio};
    }

    // Calcula a área do círculo
    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    // Calcula o perímetro do círculo
    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    // Escala o círculo, multiplicando o raio pelo fator
    @Override
    public void escalar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("O fator de escala deve ser maior que zero.");
        }
        this.raio *= fator;
    }
}