/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import astedu.diego.modelo.entidad.Paciente;
import org.hibernate.Session;
/**
 *
 * @author drlomi95
 */
public class CRUD {
    
    public void guardaPaciente(Session session, int id, String nombre){
    
            Paciente paciente = new Paciente(id,nombre);
            
            session.beginTransaction();
        
            session.save(paciente);
        
            session.getTransaction().commit();
    
    }
    
    public void borraPaciente(Session session, int id){
        
            Paciente paciente  = (Paciente)session.get(Paciente.class,id);
            
            session.beginTransaction();
        
            session.save(paciente);
        
            session.getTransaction().commit();
            
    }
}
