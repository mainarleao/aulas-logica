public class Calculadora {

    double numero1;
    double numero2;
    
    public double calcularSoma() {
        return this.numero1 + this.numero2;
    }
    
    public double calcularSubtracao() {
        return this.numero1 - this.numero2;
    }
    
    public double calcularDivisao() {
        return this.numero1 / this.numero2;
    }
    
    public double calcularMultiplicacao() {
        return this.numero1 * this.numero2;
    }
    
    public double calcularRaizQuadradaDoNumero1() {
        return Math.sqrt(this.numero1);
    }
    
    public double calcularPotenciaDoNumero1(double potencia) {
        return Math.pow(this.numero1, potencia);
    }
    
    public double calcularPotenciaComExpoenteComParametroNumero2(double potencia) {
        return Math.pow(this.numero1, potencia);
    }
}