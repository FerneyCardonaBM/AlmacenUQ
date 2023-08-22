package models;

class ClienteJuridico extends Persona {
    private String nit;

    public ClienteJuridico(String nombre, String apellido, String identificacion, String direccion, String telefono, String tipoPersona, String nit) {
        super(nombre, apellido, identificacion, direccion, telefono);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
