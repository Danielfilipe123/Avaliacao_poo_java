public class Cubo extends Figura3D{
    String tipo; 

    public Cubo (String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("O tipo da figura não pode ser nulo ou vazio.");
        }
        this.tipo = tipo;
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
       
}
