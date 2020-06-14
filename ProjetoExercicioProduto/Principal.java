import java.util.Scanner;
public class Principal{
    public static void main(String arg[]) {
        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);
        
        produto.descricao = "Celular";
        produto.fornecedor = "Motorola";
        produto.valorCusto = 550;
        produto.quantidade = 50;
        
        System.out.print("\f");
        
        System.out.print("Digite o valor da procetagem a ser calculada: ");
        produto.porcentagem = scanner.nextDouble();
        
        System.out.println("Dados do Produto."
                        +  "\nDescriçao: " + produto.descricao
                        +  "\nFornecedor: " + produto.fornecedor
                        +  "\nValor Custo: " + produto.valorCusto
                        +  "\nQuantidade em Estoque: " + produto.quantidade
                        +  "\nValor em Estoque: " + produto.calcularValorEstoque()
                        +  "\nValor Custo + 65% do Valor: " + produto.adicionar65PorCentoValorCusto()
                        +  "\nPorcetagem Digitada: " + produto.porcentagem
                        +  "\nValor Custo Mais o Valor de Porcentagem Digitada: " + produto.adicionarPorcetagemDigitadaAoValorCusto()); 
    }
}