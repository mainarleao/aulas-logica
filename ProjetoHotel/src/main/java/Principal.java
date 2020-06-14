import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AuxiliarArray hotel = new AuxiliarArray();
        Hotel hotelaria = null;

        int opcao = 0;
        int opcaoDesejada;

        do {
            System.out.print("\nHotel Sunshine"
                             + "\nMenu do Cliente"
                             + "\n1 - Cadastro de Hospedem"
                             + "\n2 - Calcular Valor a Pagar"
                             + "\n3 - Ver Cadastros"
                             + "\n4 - Filtrar Hospede"
                             + "\n5 - Verificar Quantidade de Cadastros"
                             + "\n6 - Limpar Lista de Cadastro"
                             + "\n7 - Remover um Cadastro do Sistema"
                             + "\n8 - Alterar Um item Cadastro"
                             + "\n9 - Sair"
                             + "\nDigite a Opção Desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    hotelaria = new Hotel();

                    System.out.println("Digite o nome hospede:");
                    hotelaria.setHospede(scanner.next());

                    System.out.println("Digite o seu CPF:");
                    hotelaria.setCPF(scanner.nextLong());

                    System.out.println("Digite o seu numero de telefone:");
                    hotelaria.setTelefone(scanner.next());

                    hotel.cadastrar(hotelaria);

                    System.out.println("Hospede cadastrado.");
                    break;

                case 2:
                    System.out.println("\nTipo de Quarto:"
                            + "\n1-Standart: R$350 a diaria"
                            + "\n2-Suite: R$250 a diaria"
                            + "\n3-Simples: R$150 a Diaria"
                            + "\nDigite o numero do Quarto que deseja ficar:");
                    hotelaria.setTipoQuarto(scanner.nextInt());

                    System.out.println("Digite A quantidade de dias que deseja Ficar:");
                    hotelaria.setPeriodo(scanner.nextInt());

                    System.out.println(hotelaria.calcularvalorEstadia());
                    break;

                case 3:
                    if (hotel.verificarQuantidade() != 0) {
                        for(Hotel hotel1 : hotel.buscar()) {
                            System.out.println(hotel1.toString());
                        }
                    } else {
                        System.out.println("Não Existem Hospedes Cadastrados.");
                    }
                    break;
                case 4:
                    hotelaria = new Hotel();

                    System.out.println("\nVocê deseja filtrar por:"
                                     + "\n1-Hospede"
                                     + "\n2-CPF"
                                     + "\n3-Telefone"
                                     + "\nDigite a opção desejada: ");
                    opcaoDesejada = scanner.nextInt();

                    switch (opcaoDesejada) {
                        case 1:
                        System.out.println("Digite o nome do hospede: ");
                        hotelaria.setHospede(scanner.next());
                        hotelaria = hotel.filtrar(hotelaria, 1);
                        System.out.println(hotelaria != null ? hotelaria : "Cadastro não encontrado");
                        break;
                        case 2:
                            System.out.println("Digite o CPF do hospede: ");
                            hotelaria.setCPF(scanner.nextLong());
                            hotelaria = hotel.filtrar(hotelaria, 2);
                            System.out.println(hotelaria != null ? hotelaria : "Cadastro não encontrado");
                            break;
                        case 3:
                            System.out.println("Digite o numero do hospede: ");
                            hotelaria.setTelefone(scanner.next());
                            hotelaria = hotel.filtrar(hotelaria, 3);
                            System.out.println(hotelaria != null ? hotelaria : "Cadastro não encontrado");
                            break;
                        default:
                            System.out.println("Dados invalidos");
                    }
                    break;

                case 5:
                    System.out.println("Existem " + hotel.verificarQuantidade() + " Cadastro(s).");
                    break;

                case 6:
                    hotel.apagarLista();
                    System.out.println("Cadastro Apagado.");
                    break;

                case 7:
                    System.out.println("Digite o numero do cadastro que deseja apagar");
                    int index = scanner.nextInt();
                    hotel.apagarItem(index);
                    System.out.println("Cadastro apagado");
                    break;
                case 8:
                    break;

                case 9:
                    System.exit(0);
                    break;
                default:

            }
        }while (opcao != 9);
    }
}
