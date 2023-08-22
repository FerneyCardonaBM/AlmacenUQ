package models;


class Perecedero extends Producto {
    private String fechaVencimiento;

    public Perecedero(String codigo, String nombre, String descripcion, double valorUnitario, int cantidadExist, String fechaVencimiento) {
        super(codigo, nombre, descripcion, valorUnitario, cantidadExist);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

 // Setter
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    @Override
    public String toString() {
        return "Perecedero{" +
                "fechaVencimiento='" + fechaVencimiento + '\'' +
                super.toString() +
                '}';
    }
}

