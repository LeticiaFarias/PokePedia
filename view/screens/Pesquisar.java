package view.screens;

import view.Menu;

public class Pesquisar extends Menu {

    public static void home(String quem) {
        do {
            titulo();

            println("Pesquisar por:");
            println("1. Id   ||   2. Nome   ||   3. Tipo   ||   4. Categoria   ||   5. Geração   ||   0. Voltar");
            int opcao = lerOpcao();

            switch (opcao) {
            case 1:
                byId(quem);
                break;
            case 2:
                byNome(quem);
                break;
            case 3:
                byTipo(quem);
                break;
            case 4:
                byCategoria(quem);
                break;
            case 5:
                byGeracao(quem);
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
                // Busca no DB e mostra;
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
                // Busca no DB e mostra;
            }

            voltar();
            home(quem);
            return;
        } while (true);
    }

    private static void byTipo(String quem) {
        do {
            print("Digite o tipo: ");
            String tipo = nextLine();
            println();

            {
                // Busca no DB e mostra;
            }

            voltar();
            home(quem);
            return;
        } while (true);
    }

    private static void byCategoria(String quem) {
        do {
            print("Digite a categoria: ");
            String categoria = nextLine();
            println();

            {
                // Busca no DB e mostra;
            }

            voltar();
            home(quem);
            return;
        } while (true);

    }

    private static void byGeracao(String quem) {
        do {
            print("Digite a geração: ");
            int geracao = nextInt();
            println();

            {
                // Busca no DB e mostra;
            }

            voltar();
            home(quem);
            return;
        } while (true);
    }
}