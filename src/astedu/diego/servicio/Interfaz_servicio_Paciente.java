/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astedu.diego.servicio;

import astedu.diego.modelo.entidad.Paciente;
import java.util.List;

/**
 *
 * @author drlomi95
 */
public interface Interfaz_servicio_Paciente {

    public void GuardarPaciente(Paciente paciente);

    public void ActualizarPaciente(Paciente paciente);

    public void EliminarPaciente(Paciente paciente);

    public List<Paciente> ListarPacientes();
}
