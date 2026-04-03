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

public class tienda_online {
    private String productos;
    private String clientes;
    private String pedidos;

    public tienda_online(String productos, String clientes, String pedidos) {
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
        System.out.println("Tienda: " + this.productos);
        System.out.println("Clientes: " + this.clientes);
        System.out.println("Pedidos: " + this.pedidos);
    }

    public static void main(String[] args) {
        clientes c1 = new clientes("Carlos Ruiz", "carlos@email.com", "Madrid");
        productos p1 = new productos(1001, "Laptop HP", 800, 10);
        pedidos ped1 = new pedidos(c1.nombre()[0], p1.nombre()[0], "03/04/2026", true, 800);

        tienda_online miTienda = new tienda_online(p1.nombre()[0], c1.nombre()[0], "Pedido en proceso");
        
        miTienda.mostrar();
        
        System.out.println("Venta confirmada para: " + ped1.cliente()[0]);
        System.out.println("Articulo: " + ped1.producto()[0]);
    }
}