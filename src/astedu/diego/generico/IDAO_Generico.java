/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astedu.diego.generico;

/**
 *
 * @author drlomi95
 */
import java.io.Serializable;

public interface IDAO_Generico<objeto, clave_primaria extends Serializable> {

    void Guardar(objeto t);

    void Actualizar(objeto t);

    objeto Buscar(clave_primaria id);

    void Eliminar(objeto t);
}
