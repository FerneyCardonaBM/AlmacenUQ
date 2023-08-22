package models;

class Refrigerado extends Producto {
    private String codigoControl;
    private double temperatura;

    public Refrigerado(String codigo, String nombre, String descripcion, double valorUnitario, int cantidadExist, String codigoControl, double temperatura) {
        super(codigo, nombre, descripcion, valorUnitario, cantidadExist);
        this.codigoControl = codigoControl;
        this.temperatura = temperatura;
    }
    public String getCodigoControl() {
        return codigoControl;
    }

    public double getTemperatura() {
        return temperatura;
    }

 // Setters
    public void setCodigoControl(String codigoControl) {
        this.codigoControl = codigoControl;
    }
    
    public void setTemperatura (double temperatura) {
    	this.temperatura=temperatura;
    }
    @Override
    public String toString() {
        return "Refrigerado{" +
                "codigoControl='" + codigoControl + '\'' +
                ", temperatura=" + temperatura +
                super.toString() +
                '}';
    }
}