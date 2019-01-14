/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p111mil.agenda.dao;

import Utilidades.ConfiguracionLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import p111mil.agenda.modelo.Contacto;


/**
 *
 * @author Invitado
 */
public class ContactoDao {
   
    
    public void guardar(Contacto contacto) {  
        Session session = ConfiguracionHibernate.getSessionFactory().openSession();        
        try{
        session.beginTransaction();        
        session.saveOrUpdate(contacto);        
        session.getTransaction().commit();
        }catch(Exception exception){
            session.getTransaction().rollback();
            ConfiguracionLogger.getLogger().log(Level.SEVERE, exception.getLocalizedMessage());
            ConfiguracionLogger.getLogger().log(Level.SEVERE, exception.getStackTrace().toString());
            ConfiguracionLogger.getLogger().log(Level.INFO, "Se Guardo");
        }
        session.close();        
    }   
    
    public List<Contacto> buscarTodos() {
        ConfiguracionLogger.getLogger().log(Level.INFO, "Comenzando Buscar Todos");
        Session session = ConfiguracionHibernate.getSessionFactory().openSession();                
        ArrayList<Contacto> contactos = new ArrayList<Contacto>();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Contacto> query = builder.createQuery(Contacto.class);
        Root<Contacto> root = query.from(Contacto.class);
        query.select(root);
        // Para que ordene por dos campos
        List<Order> orders = new ArrayList<Order>();
        orders.add(builder.asc(root.get("apellido")));
        orders.add(builder.asc(root.get("nombre")));        
        query.orderBy(orders);
        // Ejecuto la consulta y guardo el resultado en una lista de Pais
        contactos = (ArrayList<Contacto>) session.createQuery(query).list();
            
        session.close();
        ConfiguracionLogger.getLogger().log(Level.INFO, "Finalizando Buscar Todos");
        return contactos;
    }    
    
    public List<Contacto> buscarPor(String criterio) {
        //ConfiguracionLogger.getLogger().log(Level.INFO, "Se Busco el Nombre: "+criterio);
        Session session = ConfiguracionHibernate.getSessionFactory().openSession();                
        ArrayList<Contacto> contactos = new ArrayList<Contacto>();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Contacto> query = builder.createQuery(Contacto.class);
        Root<Contacto> root = query.from(Contacto.class);
        query.select(root);
        // Para que ordene por dos campos
        List<Order> orders = new ArrayList<Order>();
        orders.add(builder.asc(root.get("apellido")));
        orders.add(builder.asc(root.get("nombre")));        
        query.orderBy(orders);
        
        // Filtro segun el criterio
        criterio = "%" + criterio + "%";
        Predicate predicate = builder.or(builder.like(root.get("nombre"), criterio), builder.like(root.get("apellido"), criterio));
        query.where(predicate);  
        
        // Ejecuto la consulta y guardo el resultado en una lista de Pais
        contactos = (ArrayList<Contacto>) session.createQuery(query).list();
            
        session.close();
        
        return contactos;        
    }
    
    public void eliminar(int id) {
        ConfiguracionLogger.getLogger().log(Level.INFO, "Se Elimino");
        Session session = ConfiguracionHibernate.getSessionFactory().openSession();        
        
        session.beginTransaction();        
        Contacto actor = session.get(Contacto.class, id);

        session.saveOrUpdate(actor);                                
        session.delete(actor);                                        
        session.getTransaction().commit();

        session.close();
    }
    
    public Contacto buscarPorId(int id) {                
        Session session = ConfiguracionHibernate.getSessionFactory().openSession();        
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Contacto> query = builder.createQuery(Contacto.class);
        Root<Contacto> root = query.from(Contacto.class);
        query.select(root);
        query.where(builder.equal(root.get("id"), id));
        Contacto contacto = (Contacto) session.createQuery(query).uniqueResult();
        
        session.close();
        
        return contacto;
    }
}
