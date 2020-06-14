public class Quadrado implements FiguraGeometrica {
    
    protected double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    public double getLado() {
        return this.lado;
    }
    
    public void setLado(double lado) {
         this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
    
    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }
    
    @Override
    public String toString() {
        return "Valor do lado: " + this.lado
             + "\n\nArea: " + this.calcularArea()
             + "\nPerimetro: " + this.calcularPerimetro();
    }
}