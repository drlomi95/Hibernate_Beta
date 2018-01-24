/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astedu.diego.servicios;

import astedu.diego.especifico.DAO_Paciente;
import astedu.diego.modelo.entidad.Paciente;
import java.util.List;
import astedu.diego.especifico.IDAO_Paciente;

/**
 *
 * @author drlomi95
 */
public class SERV_Paciente implements ISERV_Paciente {
    private IDAO_Paciente pacientes;
    
    public SERV_Paciente(){
        pacientes = new DAO_Paciente();
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

    public Paciente BuscarPaciente(int id){
        return pacientes.Buscar(id);
    }
}
