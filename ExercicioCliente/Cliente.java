public class Cliente {
    
    private int codigoCliente;
    private String nome;
    private String profissao;
    
    public Cliente(){
    }
    
    public Cliente(int codigoCliente, String nome, String profissao) {
        this.codigoCliente = codigoCliente;
        this.nome = nome;
        this.profissao = profissao;
    }
    
    public int getCodigoCliente() {
        return this.codigoCliente;
    }
    
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getProfissao() {
        return this.profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome
             + "\nCodigo do Cliente" + this.codigoCliente
             + "\nProfissao: " +this.profissao;
    }
}