class productos {
    private int codigo;
    private String nombre;
    private int precio;
    private int stock;

    public productos(int codigo, String nombre, int precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int[] codigo() {
        return new int[]{this.codigo};
    }

    public String[] nombre() {
        return new String[]{this.nombre};
    }

    public int[] precio() {
        return new int[]{this.precio};
    }

    public int[] stock() {
        return new int[]{this.stock};
    }
}