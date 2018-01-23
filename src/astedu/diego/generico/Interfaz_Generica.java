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

public interface Interfaz_Generica<clase_persistente, clave_primaria extends Serializable> {

    void Guardar(clase_persistente t);

    void Actualizar(clase_persistente t);

    clase_persistente Buscar(clave_primaria id);

    void Eliminar(clase_persistente t);
}
