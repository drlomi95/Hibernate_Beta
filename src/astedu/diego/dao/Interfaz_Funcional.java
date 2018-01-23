/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astedu.diego.dao;

import astedu.diego.generico.Interfaz_Generica;
import astedu.diego.modelo.entidad.Paciente;
import java.util.List;

/**
 *
 * @author drlomi95
 */
public interface Interfaz_Funcional extends Interfaz_Generica<Paciente, Integer>{
    public List<Paciente> ListarPacientes();
}
