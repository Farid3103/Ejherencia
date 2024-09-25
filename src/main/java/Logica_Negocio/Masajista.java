/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059237155
 */
public class Masajista extends SeleccionFutbol {
    public String Titulacion;
         public int  Años_Experencia;

    public Masajista() {
        super();
        
        
        
    }

    public Masajista( String id, String Nombres, String Apellidos, int Edad,String Titulacion, int Años_Experencia) {
        super(id, Nombres, Apellidos, Edad);
        this.Titulacion = Titulacion;
        this.Años_Experencia = Años_Experencia;
        
        
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public int getAños_Experencia() {
        return Años_Experencia;
    }

    public void setAños_Experencia(int Años_Experencia) {
        this.Años_Experencia = Años_Experencia;
    }
    public void DarMasaje()
    {
        System.out.println("Aplicando masaje");
    }
}
