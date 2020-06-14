public class Gato extends Animal {
    
    private String cor;
    private String porte;
    private String raca;
    
    public Gato() {
       super();
    }
    
    public Gato(String nome, int idade, String cor, String porte, String raca) {
        this.setNome(nome);
        this.setIdade(idade);
        this.cor = cor;
        this.porte = porte;
        this.raca = raca;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getPorte() {
        return this.porte;
    }
    
    public void set(String porte) {
        this.porte = porte;
    }
    
    public String getRaca() {
        return this.raca;
    }
    
    public void setRaca (String raca) {
        this.raca = raca;
    }
    
    public int calcularIdadeEmMeses() {
        return this.getIdade() * 12;
    }
    
    @Override
    public String toString() {
        return "###Dados Gato###" 
             + "\nNome: " + this.getNome()
             + "\nIdade: " + this.getIdade()
             + "\nCor: " + this.cor
             + "\nPorte: " + this.porte
             + "\nRaca: " + this.raca
             + "\nMeses de Vida: " + this.calcularIdadeEmMeses();
    }
}