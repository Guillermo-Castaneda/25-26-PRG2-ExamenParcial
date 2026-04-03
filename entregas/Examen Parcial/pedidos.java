class pedidos {
    private String cliente;
    private String producto;
    private String fecha;
    private Boolean estado;
    private int precio;

    public pedidos(String cliente, String producto, String fecha, Boolean estado, int precio) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.estado = estado;
        this.precio = precio;
    }

    public String[] cliente() {
        return new String[]{this.cliente};
    }

    public String[] producto() {
        return new String[]{this.producto};
    }

    public String[] fecha() {
        return new String[]{this.fecha};
    }

    public Boolean[] estado() {
        return new Boolean[]{this.estado};
    }

    public int[] precio() {
        return new int[]{this.precio};
    }
}