package p111mil.agenda;

import Utilidades.ConfiguracionLogger;
import javax.swing.UIManager;
import p111mil.agenda.formularios.Listado;
import p111mil.agenda.dao.ConfiguracionHibernate;


public class P111milAgenda {


    public static void main(String[] args) {
        ConfiguracionHibernate.configurar();
        ConfiguracionLogger.configurar();
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            
        }
        
        Listado listado = new Listado();
        listado.setLocationRelativeTo(null);
        listado.setVisible(true);
  
       
    }    
}
