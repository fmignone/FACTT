package dominio;

import java.util.Date;
import java.util.List;

public class Dueno {

    private String nombre;
    private String apellido;
    private Date fechaNac;
    private TipoDNI tipoDni;
    private String dni;
    private List<Contacto> contactos;

    public Dueno(String nombre, String apellido, Date fechaNac, TipoDNI tipoDni, String dni, List<Contacto> contactos){

        // TODO : Validar que los datos principales sean no nulos;

        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.tipoDni = tipoDni;
        this.dni = dni;
        this.contactos = contactos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public TipoDNI getTipoDni() {
        return tipoDni;
    }

    public void setTipoDni(TipoDNI tipoDni) {
        this.tipoDni = tipoDni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }
}
