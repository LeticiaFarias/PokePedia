package view;
import controller.PokemonsDAO;
import model.Pokemon;
import util.*;

public class Main extends Helper {
    public static void main(String[] args) {

        for (Pokemon p : PokemonsDAO.select(1)) {
            print(p);
        }
    }
}
