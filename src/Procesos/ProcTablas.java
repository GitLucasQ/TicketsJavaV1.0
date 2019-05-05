
package Procesos;

import Entidades.Evento;
import Entidades.FechaEvento;
import Entidades.TicketEvento;
import javax.swing.table.DefaultTableModel;


public class ProcTablas {
    
    public void listaEvento(String ide, String idc, String nom, String t, String fec, String hora, 
            String dura, float pre, int cant, DefaultTableModel modelo){
        //eventos establecidos
        Evento e1 = new Evento();
        e1.setIdevento(ide);
        e1.setIdcategoria(idc);
        e1.setNomevento(nom);        
        e1.setTipo(t);
        e1.setFechaevento(fec);
        e1.setHoraevento(hora);
        e1.setDuracion(dura);
        e1.setPrecio(pre);
        e1.setCant_tickets(cant);
        
        String idev = e1.getIdevento();
        String idcat = e1.getIdcategoria();
        String nombre = e1.getNomevento();
        String tipo = e1.getTipo();
        String fecha = e1.getFechaevento();
        String horaev = e1.getHoraevento();
        String duracion = e1.getDuracion();
        float precio = e1.getPrecio();
        e1.getCant_tickets();
        
        Object datos[] = {idev, idcat, nombre, tipo, fecha, hora, duracion, precio, cant};
        modelo.addRow(datos);
    }
        
    public void agregaTickets(String cat, String ide, String nom, int cant, DefaultTableModel modelo) {
        TicketEvento te = new TicketEvento();
        te.setCategoria(cat);
        te.setIde(ide);
        te.setNombre(nom);
        te.setCantidad(cant);
        
        String categoria = te.getCategoria();
        String id = te.getIde();
        String nombre = te.getNombre();
        int cantidad = te.getCantidad();
        
        Object datos[] = {categoria, id, nombre, cantidad};
        modelo.addRow(datos);
    }
    
    public void fechasEvento(String cat, String ide, String nom, String fec, DefaultTableModel modelo){
        FechaEvento fe = new FechaEvento();
        fe.setCategoria(cat);        
        fe.setIde(ide);                
        fe.setNombre(nom);               
        fe.setFecha(fec);
        
        String categoria = fe.getCategoria();
        String id = fe.getIde();
        String nombre = fe.getNombre();
        String fecha = fe.getFecha();
        
        Object datos[] = {categoria, id, nombre, fecha};
        modelo.addRow(datos);
    }
}
