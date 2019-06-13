package view.screens;

import dao.PokemonsDAO;
import view.Menu;

public class Pesquisar extends Menu {

    public static void home(String quem) {
        do {
            titulo();

            println("Pesquisar por:");
            println("1. Id   ||   2. Nome  || 0. Voltar");
            int opcao = lerOpcao();

            switch (opcao) {
            case 1:
                byId(quem);
                break;
            case 2:
                byNome(quem);
                break;
            case 0:
                if (quem.equals("usuario")) {
                    homeUsuario();
                } else if (quem.equals("admin")) {
                    homeAdmin();
                }
                return;
            default:
                break;
            }
        } while (true);
    }

    private static void byId(String quem) {

        do {
            titulo();
            print("Digite o id: ");
            int id = nextInt();
            println();

            {
                System.out.println(PokemonsDAO.select(id));
            }

            voltar();
            home(quem);
            return;

        } while (true);
    }

    private static void byNome(String quem) {
        do {
            titulo();
            print("Digite o nome: ");
            String nome = nextLine();
            println();

            {
               System.out.println(PokemonsDAO.select(nome));
            }

            voltar();
            home(quem);
            return;
        } while (true);
    }
}