public class PessoaJuridica extends Cliente {
    
    private String razaoSocial;
    private String CNPJ;
    private String inscricaoEstadual;
    private double capitalInicial;
    
    public PessoaJuridica(){
        super();
    }
    
    public PessoaJuridica(int codigoCliente, String nome, String profissao, String razaoSocial, String CNPJ, String inscricaoEstadual, double capitalInicial) {
        this.setCodigoCliente(codigoCliente);
        this.setNome(nome);
        this.setProfissao(profissao);
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.inscricaoEstadual = inscricaoEstadual;
        this.capitalInicial = capitalInicial;
    }
    
    public String getRazaoSocial() {
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public String getCNPJ(){
        return this.CNPJ;
    }
    
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    
    public void setInscricaoEstadual (String     inscricaoEstadual) {
         this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public double getCapitalInicial(){
        return this.capitalInicial;
    }
    
    public void setCapitalInicial() {
        this.capitalInicial = capitalInicial;
    }
    
    @Override
    public String toString() {
        return "\n###Dados Cliente Pessoa Juridica###"
             + "\nNome: " + getNome()
             + "\nCodigo do Cliente: " + getCodigoCliente()
             + "\nProfissao: " + getProfissao()
             + "\nRazao Social: " + this.razaoSocial
             + "\nCNPJ: " + this.CNPJ
             + "\nInscriçao Social: " + this.inscricaoEstadual
             + "\nCapital Inicial: " + this.capitalInicial;
    }
}