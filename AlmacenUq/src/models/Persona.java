package models;

	class Persona {
	    private String nombre;
	    private String apellido;
	    private String identificacion;
	    private String direccion;
	    private String telefono;

	    public Persona(String nombre, String apellido, String identificacion, String direccion, String telefono) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.identificacion = identificacion;
	        this.direccion = direccion;
	        this.telefono = telefono;
	        
	    }

	    // Getters
	    public String getNombre() {
	        return nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public String getIdentificacion() {
	        return identificacion;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public String getTelefono() {
	        return telefono;
	    }


	    // Setters
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public void setIdentificacion(String identificacion) {
	        this.identificacion = identificacion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }

	    public void setTelefono(String telefono) {
	        this.telefono = telefono;
	    }

}
