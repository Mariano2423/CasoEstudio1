/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author Aulas Heredia
 */
public class Trabajador {
    public String nombre;
    public int cedula;
    public int codigo;
    public String sucursal;
    public String carroPropio;

    public Trabajador(String nombre, int cedula, int codigo, String sucursal, String carroPropio) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.carroPropio = carroPropio;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getCarroPropio() {
        return carroPropio;
    }

    public void setCarroPropio(String carroPropio) {
        this.carroPropio = carroPropio;
    }

    
    
}
