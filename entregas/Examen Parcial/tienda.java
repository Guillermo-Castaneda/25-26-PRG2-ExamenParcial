class tienda {
    private String productos;
    private String clientes;
    private String pedidos;

    public tienda(String productos, String clientes, String pedidos) {
        this.productos = productos;
        this.clientes = clientes;
        this.pedidos = pedidos;
    }

    public String[] productos() {
        return new String[]{this.productos};
    }

    public String[] clientes() {
        return new String[]{this.clientes};
    }

    public String[] pedidos() {
        return new String[]{this.pedidos};
    }

    public void mostrar() {
        System.out.println(this.productos);
        System.out.println(this.clientes);
        System.out.println(this.pedidos);
    }
}