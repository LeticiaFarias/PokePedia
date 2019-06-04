package view.screens;

import view.Menu;

public class Listar extends Menu {

    public static void home(String quem) {

        {
            // Conectar com o BD e pegar a lista de Pokémons;
        }

        do {
            titulo();

            {
                // Mostrar a lista.
            }

            voltar();

            if (quem.equals("usuario")) {
                homeUsuario();
            } else if (quem.equals("admin")) {
                homeAdmin();
            }
            return;
        } while (true);
    }
}