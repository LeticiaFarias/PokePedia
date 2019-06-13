package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public static void insert() {

    }

    public static void delete() {

    }
}