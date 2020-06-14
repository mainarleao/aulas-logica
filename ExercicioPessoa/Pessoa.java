public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private String email;
    private String dataNascimento;
    
    public Pessoa() {
    }
    
    public Pessoa(String nome, String sobrenome, String email, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nSobrenome: " + this.sobrenome
             + "\nE-mail: " + this.email
             + "\nData Nascimento: " + this.dataNascimento;
    }
}