package code;
public class cls_pacientes{
    private String nombre_str;
    private String id_str;
    private String edad_str;
    private String contacto_str;
    private String historia_str;
    
    public cls_pacientes(String nombre_str, String id_str, String edad_str, String contacto_str, String historia_str) {
        this.nombre_str = nombre_str;
        this.id_str = id_str;
        this.edad_str = edad_str;
        this.contacto_str = contacto_str;
        this.historia_str = historia_str;
    }

    public String getNombre_str() {
        return nombre_str;
    }

    public void setNombre_str(String nombre_str) {
        this.nombre_str = nombre_str;
    }

    public String getId_str() {
        return id_str;
    }

    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    public String getEdad_str() {
        return edad_str;
    }

    public void setEdad_str(String edad_str) {
        this.edad_str = edad_str;
    }

    public String getContacto_str() {
        return contacto_str;
    }

    public void setContacto_str(String contacto_str) {
        this.contacto_str = contacto_str;
    }

    public String getHistoria_str() {
        return historia_str;
    }

    public void setHistoria_str(String historia_str) {
        this.historia_str = historia_str;
    }

    
}