public class Aluno extends Pessoa {
    
    private double nota1;
    private double nota2;
    
    public Aluno() {
        super();
    }
    
    public Aluno(String nome, String sobrenome, String email, String dataNascimento, double nota1, double nota2) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setEmail(email);
        this.setDataNascimento(dataNascimento);
        this.nota1 = nota2;
        this.nota2 = nota2;
    }
    
    public double getNota1() {
        return this.nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return this.nota2;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double calcularMediaAluno() {
        return (this.nota1 + this.nota2) / 2;
    }
    
    @Override
    public String toString() {
        return "###Dados do Aluno###"
             + "\nNome: " + this.getNome()
             + "\nSobrenome: " + this.getSobrenome()
             + "\nE-mail: " + this.getEmail()
             + "\nData de Nascimento: " + this.getDataNascimento()
             + "\nNota 1: " + this.nota1
             + "\nNota 2: " + this.nota2
             + "\nMedia de Aluno: " + this.calcularMediaAluno();
    }
}