package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import model.Pokemon;

public class PokemonsDAO {

    public static List<Pokemon> list = new ArrayList<>();

    public static List<Pokemon> selectAll() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        list.clear();

        try {
            ps = DB.getConnection().prepareStatement("select * from pokemons;");
            rs = ps.executeQuery();

            if (rs.next()) {
                do {
                    Pokemon pokemon = new Pokemon(rs.getInt("id"), rs.getString("nome"), rs.getString("tipo"),
                            rs.getString("categoria"), rs.getDouble("altura"), rs.getDouble("peso"),
                            rs.getInt("geracao"));

                    list.add(pokemon);
                } while (rs.next());

                return list;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Pokemon> select(int id) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        list.clear();

        try {
            ps = DB.getConnection().prepareStatement("select * from pokemons where id = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                do {
                    Pokemon pokemon = new Pokemon(rs.getInt("id"), rs.getString("nome"), rs.getString("tipo"),
                            rs.getString("categoria"), rs.getDouble("altura"), rs.getDouble("peso"),
                            rs.getInt("geracao"));

                    list.add(pokemon);
                } while (rs.next());

                return list;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Pokemon> select(String nome) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        list.clear();

        try {
            ps = DB.getConnection().prepareStatement("select * from pokemons where nome like ?;");
            ps.setString(1, nome + "%");
            rs = ps.executeQuery();

            if (rs.next()) {
                do {
                    Pokemon pokemon = new Pokemon(rs.getInt("id"), rs.getString("nome"), rs.getString("tipo"),
                            rs.getString("categoria"), rs.getDouble("altura"), rs.getDouble("peso"),
                            rs.getInt("geracao"));

                    list.add(pokemon);
                } while (rs.next());

                return list;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void update() {

    }

    public static boolean insert(Pokemon pokemon) throws SQLException {
        PreparedStatement ps = null;

        ps = DB.getConnection().prepareStatement("insert into pokemons values(?, ?, ?, ?, ?, ?, ?);");
        ps.setInt(1, pokemon.getId());
        ps.setString(2, pokemon.getNome());
        ps.setString(3, pokemon.getTipo());
        ps.setString(4, pokemon.getCategoria());
        ps.setDouble(5, pokemon.getAltura());
        ps.setDouble(6, pokemon.getPeso());
        ps.setInt(7, pokemon.getGeracao());

        int rows = ps.executeUpdate();

        if (rows == 1) {
            return true;
        }

        return false;

    }

    public static boolean delete(int id) {
        PreparedStatement ps = null;
        try {
            ps = DB.getConnection().prepareStatement("delete from pokemons where id = ?;");
            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows == 1) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}