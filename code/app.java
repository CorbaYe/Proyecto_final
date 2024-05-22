package code;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app {

    static LinkedList<cls_pacientes> pacientes = new LinkedList<>();
    public static void main(String[] args) {
        fnt_menu_principal(true);
    }
    private static void fnt_pacientes(){
        String op_pacientes = JOptionPane.showInputDialog(null, "MENU PACIENTES \n\n1.Registrar \n2. Consultar \n3. Atrás");
        if (op_pacientes.equals("1")) {
            String nombre = JOptionPane.showInputDialog(null, "NOMBRE");
            String id = JOptionPane.showInputDialog(null, "ID");
            String edad = JOptionPane.showInputDialog(null, "EDAD");
            String contacto = JOptionPane.showInputDialog(null, "CONTACTO");
            String historia = JOptionPane.showInputDialog(null, "HISTORIA");
            pacientes.add(new cls_pacientes(nombre, id, edad, contacto, historia));
            JOptionPane.showMessageDialog(null, "Paciente registrado con éxito");
        }
    }
    private static void fnt_menu_principal(boolean m){
        do{ 
            String opciones = JOptionPane.showInputDialog(null, "MENU PRINCIPAL \n\n1. Nuevo paciente \n2. Nueva cita \n3. Reporte \n4. Salir");
            switch (opciones) {
                case "1":
                    fnt_pacientes();
                    break;
            
                default:
                    break;
            }
        }while(m);
    }
}
