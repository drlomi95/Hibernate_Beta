/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astedu.diego.generico;

import astedu.diego.util.HibernateUtil;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;

/**
 *
 * @author drlomi95
 */
public class DAO_Generico<objeto, clave_primaria extends Serializable> implements IDAO_Generico<objeto, clave_primaria> {

    private Session session;
    public Class<objeto> domainClass = getDomainClass();

    protected Class getDomainClass() {
        if (domainClass == null) {
            ParameterizedType thisType = (ParameterizedType) getClass()
                    .getGenericSuperclass();
            domainClass = (Class) thisType.getActualTypeArguments()[0];
        }
        return domainClass;
    }

    private Session getSession() {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        return session;
    }

    public void Guardar(objeto t) {
        try {
            getSession().save(t);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    //Antes usaba getSession().load que creaba una sesion adicional y provocaba conflictos.
    public objeto Buscar(clave_primaria id) {
        objeto objeto = (objeto) getSession().get(domainClass, id);
        session.getTransaction().commit();
        return objeto;
    }

    public void Actualizar(objeto t) {
        try {
            getSession().update(t);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public void Eliminar(objeto t) {
            getSession().delete(t);
            session.getTransaction().commit();
        

    }

}
