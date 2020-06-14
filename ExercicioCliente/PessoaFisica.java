public class PessoaFisica extends Cliente {
    
    private String estadoCivil;
    private String CPF;
    private String dataNascimento;
    
    public PessoaFisica() {
        super();
    }
    
    public PessoaFisica(int codigoCliente, String nome, String profissao, String estadoCivil, String CPF, String dataNascimento) {
        this.setCodigoCliente(codigoCliente);
        this.setNome(nome);
        this.setProfissao(profissao);
        this.estadoCivil = estadoCivil;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }
    
    public String getEstadoCivil(){
        return this.estadoCivil; 
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String getCPF() {
        return this.CPF; 
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getDataNascimento() {
        return this.dataNascimento; 
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString() {
        return "###Dados Cliente Pessoa Fisica###"
             + "\nNome: " + getNome()
             + "\nCodigo do Cliente: " + getCodigoCliente()
             + "\nProfissao: " + getProfissao()
             + "\nEstado Civil: " + this.estadoCivil
             + "\nCPF: " + this.CPF
             + "\nData Nascimento: " + this.dataNascimento;
    }
}