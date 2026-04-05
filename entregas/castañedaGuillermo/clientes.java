class clientes {
    private String nombre;
    private String email;
    private String dirección;

    public clientes(String nombre, String email, String dirección) {
        this.nombre = nombre;
        this.email = email;
        this.dirección = dirección;
    }

    public String[] nombre() {
        return new String[]{this.nombre};
    }

    public String[] email() {
        return new String[]{this.email};
    }

    public String[] dirección() {
        return new String[]{this.dirección};
    }
}