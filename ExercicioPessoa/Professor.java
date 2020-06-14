public class Professor extends Pessoa {
    
    private int numeroRegistro;
    private double horasTrabalhadas;
    private double valorHora;
    
    public Professor() {
        super();
    }
    
    public Professor(String nome, String sobrenome, String email, String dataNascimento, int numeroRegistro, double horasTrabalhadas, double valorHora) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setEmail(email);
        this.setDataNascimento(dataNascimento);
        this.numeroRegistro = numeroRegistro;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    public int getNumeroRegistro() {
        return this.numeroRegistro;
    }
    
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }
    
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double getValorHora() {
        return this.valorHora;
    }
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double calcularSalarioBruto() {
        return this.horasTrabalhadas * this.valorHora;
    }
    
    public double calcularFGTS() {
        return (8.0 / 100) * (this.horasTrabalhadas * this.valorHora);
    }
    
    @Override
    public String toString() {
        return "\n###Dados do Professor###"
             + "\nNome: " + this.getNome()
             + "\nSobrenome: " + this.getSobrenome()
             + "\nE-mail: " + this.getEmail()
             + "\nData de Nascimento: " + this.getDataNascimento()
             + "\nNumero  de Registro: " + this.numeroRegistro
             + "\nHoras Trabalhadas: " + this.horasTrabalhadas
             + "\nValor Hora: " + this.valorHora
             + "\nSalario Bruto: " + this.calcularSalarioBruto()
             + "\nValor FGTS: " + this.calcularFGTS();
    }
}