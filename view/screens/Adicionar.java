package view.screens;

import java.util.Locale;

import model.Pokemon;
import view.Menu;

public class Adicionar extends Menu {

    public static void home() {
        do {
            titulo();

            print("Digite o id: ");
            int id = nextInt();

            print("Digite o nome: ");
            String nome = nextLine();

            print("Digite o tipo: ");
            String tipo = nextLine();

            print("Digite a categoria: ");
            String categoria = nextLine();

            print("Digite a altura: ");
            double altura = nextDouble();

            print("Digite o peso: ");
            double peso = nextDouble();

            print("Digite a geração: ");
            int geracao = nextInt();

            Pokemon pokemon = new Pokemon(id, nome, tipo, categoria, altura, peso, geracao);

            {
                // Adiciona no banco de dados;
                // Verifica e mostra se deu certo;
            }

            println();
            println(pokemon);
            println();

            voltar();

            homeAdmin();
            return;

        } while (true);
    }
}