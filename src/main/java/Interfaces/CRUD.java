/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Persona;
import java.util.List;

/**
 *
 * @author Homa
 */
public interface CRUD {
    public List lista ();
    public Persona list(int id);
    public boolean add(Persona per);
    public boolean edit(Persona per);
    public boolean eliminar(int id);
}
