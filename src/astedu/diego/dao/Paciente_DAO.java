/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astedu.diego.dao;

import astedu.diego.generico.CRUD_Generico;
import astedu.diego.modelo.entidad.Paciente;
import astedu.diego.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author drlomi95
 */
public class Paciente_DAO extends CRUD_Generico<Paciente, Integer> implements Interfaz_Funcional {

    public List<Paciente> ListarPacientes() {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            pacientes = session.createQuery("from Paciente").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return pacientes;
    }
}
