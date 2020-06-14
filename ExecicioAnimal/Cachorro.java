public class Cachorro extends Animal {
    
    private String origem;
    private double peso;
    private String pelo;
    
    public Cachorro() {
        super();
    }
    
    public Cachorro(String nome, int idade, String origem, double peso, String pelo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.origem = origem;
        this.peso = peso;
        this.pelo = pelo;
    }
    
    public String getOrigem() {
        return this.origem;
    }
    
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String getPelo() {
        return this.pelo;
    }
    
    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
    
    public int calcularIdadeHumana() {
        return this.getIdade() * 7;
    }
    
    @Override
    public String toString() {
        return "\n###Dados Cachorro###" 
             + "\nNome: " + this.getNome()
             + "\nIdade: " + this.getIdade()
             + "\nIdade Humana: " + this.calcularIdadeHumana()
             + "\nOrigem: " + this.origem
             + "\nPeso: " + this.peso
             + "\nPelo: " + this.pelo;
    }
}