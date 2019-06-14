package view.screens;

import dao.PokemonsDAO;
import model.Pokemon;
import view.Menu;

public class Atualizar extends Menu {

	static String novoNome;
	static String novoTipo;

	public static void home() {
		do {

			titulo();
			println("Atualizar pokÃ©mon por: ");
			println("1. Id   ||   2. Nome   ||   3. Tipo   ||   4. Categoria   ||   5. Altura   ||   6. Peso   ||   7. GeraÃ§Ã£o   ||   0. Voltar");

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

			print("\nDeseja continua?\n[ 1 ] Sim [ 2 ] Não\n-- ");
			int opcao = nextInt();

			if (opcao == 1) {
				println("Informe o novo nome: ");
				novoNome = nextLine();

				PokemonsDAO.updateNome(novoNome, idAtual);
			} else {
				voltar();
			}

			if (PokemonsDAO.updateNome(novoNome, idAtual)) {
				println("Nome alterado com sucesso!\n");
			} else {
				println("Ocorreu um erro ao atualizar informações!\n");
			}
			home();
			return;
		} while (true);
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
					PokemonsDAO.updateNome(novoNome, idAtual);
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

			println("Atualizar Tipo");
			print("Digite o ID: ");
			int idAtual = nextInt();

			PokemonsDAO.select(idAtual);
			for (Pokemon var : PokemonsDAO.select(idAtual)) {
				println(var);
			}

			print("\nDeseja continua?\n[ 1 ] Sim [ 2 ] Não\n-- ");
			int opcao = nextInt();

			if (opcao == 1) {
				println("Informe o novo tipo: ");
				novoTipo = nextLine();

				PokemonsDAO.updateTipo(novoTipo, idAtual);
			} else {
				voltar();
			}

			if (PokemonsDAO.updateTipo(novoTipo, idAtual)) {
				println("Tipo alterado com sucesso!\n");
			} else {
				println("Ocorreu um erro ao atualizar informações!\n");
			}
			home();
			return;
		} while (true);
	}

	public static void categoria() {
		String novaCategoria = null;
		do {
			titulo();

			println("Atualizar Categoria");
			print("Digite o ID: ");
			int idAtual = nextInt();

			PokemonsDAO.select(idAtual);
			for (Pokemon var : PokemonsDAO.select(idAtual)) {
				println(var);
			}

			print("\nDeseja continua?\n[ 1 ] Sim [ 2 ] Não\n-- ");
			int opcao = nextInt();

			if (opcao == 1) {
				println("Informe a nova Categoria: ");
				novaCategoria = nextLine();

				PokemonsDAO.updateCategoria(novaCategoria, idAtual);
			} else {
				voltar();
			}

			if (PokemonsDAO.updateCategoria(novaCategoria, idAtual)) {
				println("Categoria alterada com sucesso!\n");
			} else {
				println("Ocorreu um erro ao atualizar informações!\n");
			}
			home();
			return;
		} while (true);
	}

	public static void altura() {
		double novaAltura = 0;
		
		do {
			titulo();

			println("Atualizar Altura");
			print("Digite o ID: ");
			int idAtual = nextInt();

			PokemonsDAO.select(idAtual);
			for (Pokemon var : PokemonsDAO.select(idAtual)) {
				println(var);
			}

			print("\nDeseja continua?\n[ 1 ] Sim [ 2 ] Não\n-- ");
			int opcao = nextInt();

			if (opcao == 1) {
				println("Informe a nova Altura: ");
				novaAltura = nextDouble();

				PokemonsDAO.updateAltura(novaAltura, idAtual);
			} else {
				voltar();
			}

			if (PokemonsDAO.updateAltura(novaAltura, idAtual)) {
				println("Altura alterada com sucesso!\n");
			} else {
				println("Ocorreu um erro ao atualizar informações!\n");
			}
			home();
			return;
		} while (true);
	}

	public static void peso() {
		double novoPeso = 0;
		
		do {
			titulo();

			println("Atualizar Peso");
			print("Digite o ID: ");
			int idAtual = nextInt();

			PokemonsDAO.select(idAtual);
			for (Pokemon var : PokemonsDAO.select(idAtual)) {
				println(var);
			}

			print("\nDeseja continua?\n[ 1 ] Sim [ 2 ] Não\n-- ");
			int opcao = nextInt();

			if (opcao == 1) {
				println("Informe a novo Peso: ");
				novoPeso = nextDouble();

				PokemonsDAO.updatePeso(novoPeso, idAtual);
			} else {
				voltar();
			}

			if (PokemonsDAO.updatePeso(novoPeso, idAtual)) {
				println("Peso alterado com sucesso!\n");
			} else {
				println("Ocorreu um erro ao atualizar informações!\n");
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

				print("Digite a nova geraÃ§Ã£o: ");
				int geracaoNova = nextInt();

				{
					// Verifica se jÃ¡ nÃ£o existe um igual;
					// Atualiza e mostra;
				}

				voltar();
			}
			home();
			return;
		} while (true);
	}
}