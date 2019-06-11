package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DB;

public class AdminsDAO {

    public static boolean hasNome(String nome) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = DB.getConnection().prepareStatement("select * from admin where nome = ?;");
            ps.setString(1, nome);
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public static boolean checkPassword(String nome, String senha) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = DB.getConnection().prepareStatement("select * from admins where nome = ? and senha = ?;");
            ps.setString(1, nome);
            ps.setString(2, senha);
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}