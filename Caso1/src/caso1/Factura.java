/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

import javax.swing.JOptionPane;
/**
 *
 * @author Aulas Heredia
 */
public class Factura {
    public String nombreCliente;
    public int cedulaCliente;
    public int codigo;
    public double monto;
    public int numeroMes;
    public String productosElec;
    public String productosAuto;
    public String productosConst;

    public Factura(String nombreCliente, int cedulaCliente, int codigo, double monto, int numeroMes, String productosElec, String productosAuto, String productosConst) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigo = codigo;
        this.monto = monto;
        this.numeroMes = numeroMes;
        this.productosElec = productosElec;
        this.productosAuto = productosAuto;
        this.productosConst = productosConst;
    }
    
    

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNumeroMes() {
        return numeroMes;
    }

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }

    public String getProductosElec() {
        return productosElec;
    }

    public void setProductosElec(String productosElec) {
        this.productosElec = productosElec;
    }

    public String getProductosAuto() {
        return productosAuto;
    }

    public void setProductosAuto(String productosAuto) {
        this.productosAuto = productosAuto;
    }

    public String getProductosConst() {
        return productosConst;
    }

    public void setProductosConst(String productosConst) {
        this.productosConst = productosConst;
    }
    
    
    
    
    
    
}
