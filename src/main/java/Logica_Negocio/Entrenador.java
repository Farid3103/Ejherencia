/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059237155
 */
public class Entrenador extends SeleccionFutbol{
    public String id_Federacion;

    public Entrenador() {
        super();
    }

    public Entrenador( String id, String Nombres, String Apellidos, int Edad,String id_Federacion) {
        super(id, Nombres, Apellidos, Edad);
        this.id_Federacion = id_Federacion;
    }

    public String getId_Federacion() {
        return id_Federacion;
    }

    public void setId_Federacion(String id_Federacion) {
        this.id_Federacion = id_Federacion;
    }
    public void Dirigirpartido()
    {
        System.out.println("Dirigiendo partido");
    }
    public void DirigirEntrenamiento()
    {
        System.out.println("Dirigiendo Entrenamiento");
    }
}
