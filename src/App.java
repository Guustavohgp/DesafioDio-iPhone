import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Iphone myIPhone = new Iphone();

        Scanner sc = new Scanner (System.in);

        while (true) {
            System.out.println("\nEscolha a categoria para testar:");
            System.out.println("1- Reprodutor Musical");
            System.out.println("2- Aparelho Telefônico");
            System.out.println("3- Navegador de Internet");
            System.out.println("4- Sair");
            System.out.print("Digite sua escolha: ");

            int categoria = sc.nextInt();

            switch (categoria) {
                // funcionalidades do reprodutor
                case 1:
                    System.out.println("\n --Reprodutor Musical-- ");
                    System.out.println("Escolha a funcionalidade:");
                    System.out.println("1- Play");
                    System.out.println("2- Pause");
                    System.out.println("3- Selecionar Música");
                    System.out.print("Digite sua escolha: ");
                    int opcaoReprodutor = sc.nextInt();
                    switch (opcaoReprodutor) {
                        case 1:
                            myIPhone.play();
                            break;
                        case 2:
                            myIPhone.pause();
                            break;
                        case 3:
                            myIPhone.selecionarMusica();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                // funcionalidades do phone
                case 2:
                    System.out.println("\n --Aparelho Telefônico--");
                    System.out.println("Escolha a funcionalidade:");
                    System.out.println("1- Ligar");
                    System.out.println("2- Atender");
                    System.out.println("3- Correio de Voz");
                    System.out.print("Digite sua escolha: ");
                    int opcaoTelefone = sc.nextInt();
                    switch (opcaoTelefone) {
                        case 1:
                            myIPhone.ligar();
                            break;
                        case 2:
                            myIPhone.atender();
                            break;
                        case 3:
                            myIPhone.correioVoz();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                
                // funcionalidades do navegador
                case 3:
                    System.out.println("\n --Navegador de Internet--");
                    System.out.println("Escolha a funcionalidade:");
                    System.out.println("1- Exibir Página");
                    System.out.println("2- Adicionar Nova Aba");
                    System.out.println("3- Atualizar Página");
                    System.out.print("Digite sua escolha: ");
                    int opcaoNavegador = sc.nextInt();
                    switch (opcaoNavegador) {
                        case 1:
                            myIPhone.exibirPagina();
                            break;
                        case 2:
                            myIPhone.adicionarNovaAba();
                            break;
                        case 3:
                            myIPhone.atualizarPagina();
                            break;
                        default:
                            System.out.println("Opção inválida para o Navegador de Internet.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    sc.close();
                    return; 

                default:
                    System.out.println("Escolha inválida! Tente novamente.");
                
            }
        }
    }
}