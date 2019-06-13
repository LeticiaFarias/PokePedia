package view.screens;

import view.Menu;

public class Remover extends Menu {

    public static void home() {

        do {
            titulo();

            println("Remover Pokémon");
            print("Digite o id: ");
            int id = nextInt();

            {
                // Remover o pokémon do DB e verificar;
            }
            
            voltar();
            homeAdmin();

            return;

        } while (true);
    }
}