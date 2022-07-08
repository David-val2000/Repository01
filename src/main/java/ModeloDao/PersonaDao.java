/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDao;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Homa
 */
public class PersonaDao implements CRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p = new Persona();

    @Override

    public List lista() {
        ArrayList<Persona> list = new ArrayList<>();
        String sql = "Select * from persona";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona per = new Persona();
                per.setId(rs.getInt("id"));
                per.setDni(rs.getString("dni"));
                per.setNom(rs.getString("nombres"));
                list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Persona list(int id) {

        String sql = "Select * from persona where id=" + id;
       
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
             
            while (rs.next()) {

                p.setId(rs.getInt("id"));
                p.setDni(rs.getString("dni"));
                p.setNom(rs.getString("nombres"));

            }
        } catch (Exception e) {
        }
        return p;

    }

    @Override
    public boolean add(Persona per) {
        //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "insert into persona(dni,nombres)values('" + per.getDni() + "','" + per.getNom() + "')";
       // System.out.println("//++++++++++sql " + sql);
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public boolean edit(Persona per) {
        String sql = "update persona set dni='" + per.getDni() + "',nombres='" + per.getNom() + "'where id='" + per.getId() + "' ";
        System.out.println(sql);
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from persona where id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return false;
    }

}
