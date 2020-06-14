public class Principal {
    public static void main(String args[]) {
        System.out.print("\f");
        
        Aluno aluno = new Aluno("Guilherme", "Ribeiro", "guizin@mail.com", "01-05-1997", 5, 8);
        System.out.println(aluno);
        
        Professor professor = new Professor("Ze", "Da Silva", "dasilva@mail.com", "28-07-1968", 54876, 180, 6.9);
        System.out.println(professor);
        
        Funcionario funcionario = new Funcionario("Beti", "Guimaraes", "betig@mail.com", "18-04-1987", 31974, 1045);
        System.out.println(funcionario);
    }
}