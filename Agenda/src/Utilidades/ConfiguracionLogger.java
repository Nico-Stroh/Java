
package Utilidades;


import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



public class ConfiguracionLogger {
    private final static Logger LOGGER=Logger.getLogger("Agenda");
    public static void configurar() {
       try{
            FileHandler fileHandled = new FileHandler("Agenda.log", true);
            fileHandled.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandled);
        }catch(Exception exception){
                System.out.println(exception.getStackTrace());
            }
    }
    
    public static Logger getLogger(){
        return LOGGER;
    }
}
