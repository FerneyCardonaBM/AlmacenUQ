package models;

class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private double valorUnitario;
    private int cantidadExist;

    public Producto(String codigo, String nombre, String descripcion, double valorUnitario, int cantidadExist) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
        this.cantidadExist = cantidadExist;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getCantidadExist() {
        return cantidadExist;
    }

    public void setCantidadExist(int cantidadExist) {
        this.cantidadExist = cantidadExist;
    }
 // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

   
}