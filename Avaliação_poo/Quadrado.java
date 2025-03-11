public class Quadrado extends Retangulo {
    public Quadrado(int lado) {
        super(lado, lado); // Quadrado tem base e altura iguais
    }

    public void setLado(int lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado deve ser maior que zero.");
        }
        setBase(lado);
        setAltura(lado);
    }

    public int getLado() {
        return getBase(); // Como base e altura são iguais, tanto faz pegar um deles
    }

    @Override
    public void escalar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("O fator deve ser maior que zero.");
        }
        setLado((int) (getLado() * fator)); // Escala proporcionalmente
    }

    @Override
    public String[] info() {
        return new String[]{
            "Lados: " + getLados(),
            "Lado: " + (double) getLado()
        };
    }

    public String getTipo() {
        return "Quadrado"; // Tipo específico para quadrado
    }

    
}
