package code;

public class cls_citas {
    private String id_str;
    private String fecha_str;
    private String hora_str;
    private String det_informacion_str;
    
    public cls_citas(String id_str, String fecha_str, String hora_str, String det_informacion_str) {
        this.id_str = id_str;
        this.fecha_str = fecha_str;
        this.hora_str = hora_str;
        this.det_informacion_str = det_informacion_str;
    }
    public String getId_str() {
        return id_str;
    }
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }
    public String getFecha_str() {
        return fecha_str;
    }
    public void setFecha_str(String fecha_str) {
        this.fecha_str = fecha_str;
    }
    public String getHora_str() {
        return hora_str;
    }
    public void setHora_str(String hora_str) {
        this.hora_str = hora_str;
    }
    public String getDet_informacion_str() {
        return det_informacion_str;
    }
    public void setDet_informacion_str(String det_informacion_str) {
        this.det_informacion_str = det_informacion_str;
    }

    
}
