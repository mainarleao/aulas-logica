public class Principal {
    public static void main(String args[]) {
        System.out.print("\f");

        CalculoProduto calculoProduto = new CalculoProduto();

        calculoProduto.setNumero1(4);
        calculoProduto.setNumero2(4);
        calculoProduto.setNumero3(4);

        System.out.println(calculoProduto);

    }
}