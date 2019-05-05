
package Entidades;

import java.util.Date;


public class Facturas {
    int numal = (int) ((Math.random()*(1-50)+50));
    private String codigo="1000"+numal;
    private Date fecha_fac = new Date();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {        
        this.codigo = codigo;
    }

    public Date getFecha_fac() {
        return fecha_fac;
    }

    public void setFecha_fac(Date fecha_fac) {        
        this.fecha_fac = fecha_fac;
    }
}
