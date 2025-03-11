public abstract class Figura3D {
    String tipo;
    
    public Figura3D(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("O tipo da figura não pode ser nulo ou vazio.");
        }
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    } 
    public String[] info() {
        return new String[] {"Teste"};
    }
    
    public double area() {
        return 0;
    }

    public double perimetro() {
            return 0;
       } 

       public double volume(){
        return 0;
       }
       
    public void escalar(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("O fator de escala deve ser maior que zero.");
        }
    }
    }



