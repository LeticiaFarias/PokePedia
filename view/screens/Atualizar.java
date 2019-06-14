package view.screens;

import dao.PokemonsDAO;
import model.Pokemon;
import view.Menu;

public class Atualizar extends Menu {
	
	public static void home() {
		do {

			titulo();
			println("Atualizar pokÃ©mon por: ");
			println("1. Nome   ||   2. Tipo   ||   3. Categoria   ||   4. Altura   ||   5. Peso   ||   6. GeraÃ§Ã£o   ||   0. Voltar");

			switch (lerOpcao()) {
			case 1:
				nome();
				return;
			case 2:
				tipo();
				return;
			case 3:
				categoria();
				return;
			case 4:
				altura();
				return;
			case 5:
				peso();
				return;
			case 6:
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
		String novoNome = null;
		
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


	public static void tipo() {
		String novoTipo = null;
		
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
				println("Informe o novo Peso: ");
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
		int novaGeracao = 0;
		
		do {
			titulo();

			println("Atualizar Geracao");
			print("Digite o ID: ");
			int idAtual = nextInt();

			PokemonsDAO.select(idAtual);
			for (Pokemon var : PokemonsDAO.select(idAtual)) {
				println(var);
			}

			print("\nDeseja continua?\n[ 1 ] Sim [ 2 ] Não\n-- ");
			int opcao = nextInt();

			if (opcao == 1) {
				println("Informe a nova Geracao: ");
				novaGeracao = nextInt();

				PokemonsDAO.updateGeracao(novaGeracao, idAtual);
			} else {
				voltar();
			}

			if (PokemonsDAO.updateGeracao(novaGeracao, idAtual)) {
				println("Geração alterada com sucesso!\n");
			} else {
				println("Ocorreu um erro ao atualizar informações!\n");
			}
			home();
			return;
		} while (true);
	}
}