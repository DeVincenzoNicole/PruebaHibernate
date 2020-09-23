
package Controlador;

import Modelo.Tablahb;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

// Operaciones de altas y bajas del formulario Usuarios

public class operaciones {

    public void altaUsuarios(Tablahb user){
        
        // Instancia del archivo del Controlador
        SessionFactory Misesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = Misesion.openSession();
        Transaction tx = session.beginTransaction();
        // Guardar todos los objetos que vengan de la tabla
        session.save(user);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El dato fue guardado con éxito");
    }
    
    public void bajaUsuarios(Tablahb user){
        
        // Instancia del archivo del Controlador
        SessionFactory Misesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = Misesion.openSession();
        Transaction tx = session.beginTransaction();
        // Elimina todos los objetos que vengan de la tabla
        session.delete(user);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "El usuario fue eliminado correctamente");
    }
}
