package controller;

import java.sql.Statement;

import db.DB;

public class Pokemons extends DB {

    public static boolean create(Pokemon pokemon) {

        connect();

        String sql = "insert into pokemon values(?,?,?,?,?,?);"

        Statement statement = conn

        close();
    }
}