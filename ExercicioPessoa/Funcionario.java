public class Funcionario extends Pessoa {
    
    private int numeroRegistro;
    private double salarioFixo;
    
    public Funcionario() {
        super();
    }
    
    public Funcionario(String nome, String sobrenome, String email, String dataNascimento, int numeroRegistro, double salarioFixo) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setEmail(email);
        this.setDataNascimento(dataNascimento);
        this.numeroRegistro = numeroRegistro;
        this.salarioFixo = salarioFixo;
    }
    
    public int getNumeroRegistro() {
        return this.numeroRegistro;
    }
    
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    public double geSalarioFixo() {
        return this.salarioFixo;
    }
    
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    public double calcularFGTS() {
        return (8.0 / 100) * this.salarioFixo;
    }
    
    @Override
    public String toString() {
        return "\n###Dados do Funcionario###"
             + "\nNome: " + this.getNome()
             + "\nSobrenome: " + this.getSobrenome()
             + "\nE-mail: " + this.getEmail()
             + "\nData de Nascimento: " + this.getDataNascimento()
             + "\nNumero  de Registro: " + this.numeroRegistro
             + "\nSalario Fixo: " + this.salarioFixo
             + "\nFGTS: " + this.calcularFGTS();
    }
}