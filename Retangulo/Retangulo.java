public class Retangulo {
    
    private double base;
    private double altura;
    
    public Retangulo() {
    }
    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return this.base;
    }
    
    public void setBase(double altura) {
        this.base = base;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularAreaDoRetangulo() {
        return this.base * this.altura;
    }
    
    public double calcularPerimetroDoRetangulo() {
        return this.base + this.base + this.altura + this.altura;
    }
    
    @Override
    public String toString() {
        return "Base: " + this.base
              + "\nAltura: " + this.altura
              + "\nArea do Retangulo: " + calcularAreaDoRetangulo()
              + "\nPerimetro do Retangulo: " + calcularPerimetroDoRetangulo();
    }
}