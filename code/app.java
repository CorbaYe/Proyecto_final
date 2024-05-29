package code;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app {

    static LinkedList<cls_pacientes> pacientes = new LinkedList<>();
    static LinkedList<cls_citas> citas = new LinkedList<>();
    public static void main(String[] args) {
        fnt_menu_principal(true);
    }
    private static void fnt_pacientes(boolean is_activo){
        do{
            String op_pacientes = JOptionPane.showInputDialog(null, "MENU PACIENTES \n\n1. Registrar \n2. Consultar \n3. Atrás");
            if (op_pacientes.equals("1")) {
                boolean sw = false;
                String id = JOptionPane.showInputDialog(null, "ID");
                for (int i = 0; i < pacientes.size(); i++) {
                    if (pacientes.get(i).getId_str().equals(id)) {
                        sw = true;
                        break;
                    }
                }
                if (!sw) {
                    String nombre = JOptionPane.showInputDialog(null, "NOMBRE");
                    String edad = JOptionPane.showInputDialog(null, "EDAD");
                    String contacto = JOptionPane.showInputDialog(null, "CONTACTO");
                    String historia = JOptionPane.showInputDialog(null, "HISTORIA");
                    pacientes.add(new cls_pacientes(nombre, id, edad, contacto, historia));
                    JOptionPane.showMessageDialog(null, "Paciente registrado con éxito");   
                }else{
                    JOptionPane.showMessageDialog(null, "Este paciente ya se encuentra registrado");
                }
            }
            else if (op_pacientes.equals("2")) {
                boolean sw = false;
                int pos = 0;
                String id = JOptionPane.showInputDialog(null, "ID");
                for (int i = 0; i < pacientes.size(); i++) {
                    if (pacientes.get(i).getId_str().equals(id)) {
                        sw = true;
                        pos = i;
                        break;
                    }
                }
                if (sw) {
                    JOptionPane.showMessageDialog(null, "NOMBRE: " + pacientes.get(pos).getNombre_str() +
                                                                        "\nEDAD " + pacientes.get(pos).getEdad_str() +
                                                                        "\nCONTACTO " + pacientes.get(pos).getContacto_str() +
                                                                        "\nHISTORIA " + pacientes.get(pos).getHistoria_str());
                }else{
                    JOptionPane.showMessageDialog(null, "Este paciente no se encuentra registrado");
                }
            }else if (op_pacientes.equals("3")) {
                is_activo = false;
            }
        }while(is_activo);
    }

    private static void fnt_citas_registrar(){
        boolean sw = false;
        String id = JOptionPane.showInputDialog(null, "ID");
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getId_str().equals(id)) {
                sw = true;
                break;
            }
        }
        if (sw) {
            String fecha = JOptionPane.showInputDialog(null, "FECHA");
            String hora = JOptionPane.showInputDialog(null, "HORA");
            String detalle = JOptionPane.showInputDialog(null, "DETALLE");
            citas.add(new cls_citas(id, fecha, hora, detalle));
            JOptionPane.showMessageDialog(null, "Cita registrada con éxito");
        }else{
            JOptionPane.showMessageDialog(null, "Este paciente no se encuentra registrado");
        }
    }

    

    private static void fnt_menu_principal(boolean m){
        do{ 
            String opciones = JOptionPane.showInputDialog(null, "MENU PRINCIPAL \n\n1. Nuevo paciente \n2. Nueva cita \n3. Reporte \n4. Salir");
            switch (opciones) {
                case "1":
                    fnt_pacientes(true);
                    break;
                case "2":
                    fnt_citas_registrar();
                case "4":
                    m = false;
                default:
                    break;
            }
        }while(m);
    }
}
