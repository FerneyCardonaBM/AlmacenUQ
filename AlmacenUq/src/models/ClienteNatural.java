package models;

class ClienteNatural extends Persona {
    private String correo;
    private String fechaNacimiento;

    public ClienteNatural(String nombre, String apellido, String identificacion, String direccion, String telefono, String tipoPersona, String correo, String fechaNacimiento) {
        super(nombre, apellido, identificacion, direccion, telefono);
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}



