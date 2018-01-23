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
public class CRUD_Generico<clase_persistente, clave_primaria extends Serializable> implements Interfaz_Generica<clase_persistente, clave_primaria> {

    private Session session;
    public Class<clase_persistente> domainClass = getDomainClass();

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

    public void Guardar(clase_persistente t) {
        try {
            getSession().save(t);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public clase_persistente Buscar(clave_primaria id) {
        clase_persistente objeto = (clase_persistente) getSession().load(domainClass, id);
        session.getTransaction().commit();
        return objeto;
    }

    public void Actualizar(clase_persistente t) {
        try {
            getSession().update(t);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public void Eliminar(clase_persistente t) {

        try {
            getSession().delete(t);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);

        }

    }

}
