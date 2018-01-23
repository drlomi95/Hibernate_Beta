/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astedu.diego.servicio;

import astedu.diego.dao.Interfaz_Funcional;
import astedu.diego.dao.Paciente_DAO;
import astedu.diego.modelo.entidad.Paciente;
import java.util.List;

/**
 *
 * @author drlomi95
 */
public class Servicio_Paciente implements Interfaz_servicio_Paciente {
    private Interfaz_Funcional pacientes;
    
    public Servicio_Paciente(){
        pacientes = new Paciente_DAO();
    }
    
    public void GuardarPaciente(Paciente paciente){
        pacientes.Guardar(paciente);
    }

    public void ActualizarPaciente(Paciente paciente){
        pacientes.Actualizar(paciente);
    }

    public void EliminarPaciente(Paciente paciente){
        pacientes.Eliminar(paciente);
    }

    public List<Paciente> ListarPacientes(){
        return pacientes.ListarPacientes();
    }

    public Paciente Buscar(int id) {
        Paciente p = pacientes.Buscar(id);
        return p;
    }
}
