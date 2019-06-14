package view.screens;

import dao.PokemonsDAO;
import model.Pokemon;
import view.Menu;

public class Atualizar extends Menu {

	static String novoNome;
	
    public static void home() {
        do {

            titulo();
            println("Atualizar pokémon por: ");
            println("1. Id   ||   2. Nome   ||   3. Tipo   ||   4. Categoria   ||   5. Altura   ||   6. Peso   ||   7. Geração   ||   0. Voltar");

            switch (lerOpcao()) {
            case 1:
                id();
                return;
            case 2:
                nome();
                return;
            case 3:
                tipo();
                return;
            case 4:
                categoria();
                return;
            case 5:
                altura();
                return;
            case 6:
                peso();
                return;
            case 7:
                geracao();
                return;
            case 0:
                homeAdmin();
                return;

            default:
                break;
            }

        } while (true);
    }

    private static void nome() {
       do {
    	   titulo();
    	   
    	   println("Atualizar ID");
    	   print("Digite o ID: ");
    	   int idAtual = nextInt();
    	   
    	   PokemonsDAO.select(idAtual);
    	   for (Pokemon var : PokemonsDAO.select(idAtual)) {
               println(var);
           }

    	   print("\nDeseja continua?\n[ 1 ] Sim [ 2 ] N�o\n-- ");
    	   int opcao = nextInt();
    	   
    	   if(opcao == 1) {
    		   println("Informe o novo nome: ");
    		   novoNome = nextLine();

    		   PokemonsDAO.update(novoNome, idAtual);
    	   }else {
    		   voltar();
    	   }
    	   
    	   if(PokemonsDAO.update(novoNome, idAtual)) {
    		   println("Nome alterado com sucesso!\n");
    	   }else {
    		   println("Ocorreu um erro ao atualizar informa��es!\n");
    	   }
    	   home();
    	   return;
       }while(true);
    }

    private static void id() {
        do {
            titulo();
            print("Digite o id: ");
            int idAtual = nextInt();

            {
                PokemonsDAO.select(idAtual);
            }

            println("1. Continuar   ||   0. Voltar");
            if (lerOpcao() == 1) {

                print("Digite o novo nome: ");
                novoNome = nextLine();

                {
                    PokemonsDAO.update(novoNome, idAtual);
                }

                voltar();
            }
            home();
            return;
        } while (true);
    }

    public static void tipo() {
        do {
            titulo();
            print("Digite o id: ");
            int idAtual = nextInt();

            {
                // Procurar no DB e mostrar;
            }

            println("1. Continuar   ||   0. Voltar");
            if (lerOpcao() == 1) {

                print("Digite o novo tipo: ");
                String tipoNovo = nextLine();

                {
                    // Verifica se já não existe um igual;
                    // Atualiza e mostra;
                }

                voltar();
            }
            home();
            return;
        } while (true);
    }

    public static void categoria() {
        do {
            titulo();
            print("Digite o id: ");
            int idAtual = nextInt();

            {
                // Procurar no DB e mostrar;
            }

            println("1. Continuar   ||   0. Voltar");
            if (lerOpcao() == 1) {

                print("Digite a nova categoria: ");
                String categoriaNova = nextLine();

                {
                    // Verifica se já não existe um igual;
                    // Atualiza e mostra;
                }

                voltar();
            }
            home();
            return;
        } while (true);

    }

    public static void altura() {
        do {
            titulo();
            print("Digite o id: ");
            int idAtual = nextInt();

            {
                // Procurar no DB e mostrar;
            }

            println("1. Continuar   ||   0. Voltar");
            if (lerOpcao() == 1) {

                print("Digite a nova altura: ");
                double alturaNova = nextDouble();

                {
                    // Verifica se já não existe um igual;
                    // Atualiza e mostra;
                }

                voltar();
            }
            home();
            return;
        } while (true);
    }

    public static void peso() {
        do {
            titulo();
            print("Digite o id: ");
            int idAtual = nextInt();

            {
                // Procurar no DB e mostrar;
            }

            println("1. Continuar   ||   0. Voltar");
            if (lerOpcao() == 1) {

                print("Digite o novo peso: ");
                double pesoNovo = nextDouble();

                {
                    // Verifica se já não existe um igual;
                    // Atualiza e mostra;
                }

                voltar();
            }
            home();
            return;
        } while (true);
    }

    public static void geracao() {
        do {
            titulo();
            print("Digite o id: ");
            int idAtual = nextInt();

            {
                // Procurar no DB e mostrar;
            }

            println("1. Continuar   ||   0. Voltar");
            if (lerOpcao() == 1) {

                print("Digite a nova geração: ");
                int geracaoNova = nextInt();

                {
                    // Verifica se já não existe um igual;
                    // Atualiza e mostra;
                }

                voltar();
            }
            home();
            return;
        } while (true);
    }
}