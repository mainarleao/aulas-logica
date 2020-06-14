public class Principal {
    public static void main(String args[]) {
        System.out.print("\f");
        
        PessoaFisica pessoaFisica = new PessoaFisica(985478, "Alexandre", "Operador de Maquina", "Solteiro", "874.698.258.35", "07/03/1983");
        System.out.println(pessoaFisica);
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica(983651, "Carlos", "Cozinheiro", "Carlos Cuks", "98.781.697/0001-49", "87369527-98", 50.000);
        System.out.println(pessoaJuridica);
    }
}