public class Principal {
    public static void main(String arg[]) {
        Calculadora calculadora = new Calculadora();
        
        calculadora.numero1 = 6;
        calculadora.numero2 = 2;
        
        System.out.print("\f");
        
        System.out.println("Calculos Prontos: "
                        +  "\nNumero 1: " + calculadora.numero1
                        +  "\nNumero 2: " + calculadora.numero2
                        +  "\nSoma: " + calculadora.calcularSoma()
                        +  "\nSubtraçao: " + calculadora.calcularSubtracao()
                        +  "\nDivisao: " + calculadora.calcularDivisao()
                        +  "\nMultiplicaçao: " + calculadora.calcularMultiplicacao()
                        +  "\nRaiz Quadrada do Numero 1: " + calculadora.calcularRaizQuadradaDoNumero1()
                        +  "\nPotencia Do Numero 1: " + calculadora.calcularPotenciaDoNumero1(5)
                        +  "\nPotencia Do Numero 1 Com Expoente Parametro Numero 2: " + calculadora.calcularPotenciaComExpoenteComParametroNumero2(calculadora.numero2));
        
        
    }
}