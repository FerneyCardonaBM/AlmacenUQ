package models;

import Enums.Pais;
  
class Envasado extends Producto {
    private String fechaEnvasado;
    private double peso;
    private Pais pais;


    public Envasado(String codigo, String nombre, String descripcion, double valorUnitario, int cantidadExist, String fechaEnvasado, double peso, Pais pais) {
        super(codigo, nombre, descripcion, valorUnitario, cantidadExist);
        this.fechaEnvasado = fechaEnvasado;
        this.peso = peso;
        this.pais = pais;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public double getPeso() {
        return peso;
    }

    public Pais getPais() {
        return pais;
    }

 // Setter
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setPais(Pais pais) {
    	this.pais=pais;
    }
    @Override
    public String toString() {
        return "Envasado{" +
                "fechaEnvasado='" + fechaEnvasado + '\'' +
                ", peso=" + peso +
                ", pais=" + pais +
                super.toString() +
                '}';
    }
}