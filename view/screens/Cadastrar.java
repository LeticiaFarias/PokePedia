package view.screens;

import controller.UsuariosDAO;
import view.Menu;

public class Cadastrar extends Menu {

    public static void home() {
        do {
            titulo();
            println("1. Usuário   ||   2. Administrador   ||   0. Voltar");

            switch (lerOpcao()) {
            case 1:
                usuario("admin");
                return;
            case 2:
                admin();
                return;
            case 3:
                homeAdmin();
                return;
            default:
                break;
            }

        } while (true);
    }

    public static void usuario(String quem) {

        titulo();

        print("Nome de usuário: ");
        String nome = nextLine();

        print("Senha: ");
        String senha = nextLine();

        if (!UsuariosDAO.check(nome)) {
            
            if (UsuariosDAO.insert(nome, senha)) {
                println("OK");
            } else
                println("Não adicionado.");
        }

        if (quem.equals("admin")) {
            homeAdmin();
        } else if (quem.equals("usuario")) {
            homeUsuario();
        }
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