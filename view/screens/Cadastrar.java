package view.screens;

import view.Menu;

public class Cadastrar extends Menu {

    public static void home() {
        do {
            titulo();
            println("1. Usuário   ||   2. Administrador");

            switch (lerOpcao()) {
            case 1:
                usuario();
                return;
            case 2:
                admin();
                return;
            default:
                break;
            }

        } while (true);
    }

    public static void usuario() {

        titulo();

        print("Nome de usuário: ");
        String nome = nextLine();

        {
            // Verifica se o nome já existe no BD;
        }

        print("Senha: ");
        String senha = nextLine();

        {
            // Adiciona o usuário no banco, tabela usuarios;
        }

        homeAdmin();
    }

    public static void admin() {

        titulo();

        print("Nome de usuário: ");
        String nome = nextLine();

        {
            // Verifica se o nome já existe no BD;
        }

        print("Senha: ");
        String senha = nextLine();

        {
            // Adiciona o usuário no banco, tabela admins;
        }

        homeAdmin();
    }
}