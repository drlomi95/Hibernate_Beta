/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astedu.diego.especifico;

import astedu.diego.modelo.entidad.Paciente;
import java.util.List;
import astedu.diego.generico.IDAO_Generico;

/**
 *
 * @author drlomi95
 */
public interface IDAO_Paciente extends IDAO_Generico<Paciente, Integer>{
    public List<Paciente> ListarPacientes();
}
