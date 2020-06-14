public class Produto {
    
    String descricao;
    String fornecedor;
    double valorCusto;
    int quantidade;
    double porcentagem;
    
    public double calcularValorEstoque() {
        return this.valorCusto * this.quantidade;
    }
    
    public double adicionar65PorCentoValorCusto() {
        return this.valorCusto * 1.65;
    }
    
    public double adicionarPorcetagemDigitadaAoValorCusto() {
        return this.valorCusto + ((this.valorCusto*porcentagem)/100);
    }
}