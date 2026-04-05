public class comprador {
    public static void main(String[] args) {
        String entrega[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        
        clientes c1 = new clientes("Carlos Ruiz", "carlos@email.com", "Madrid");
        clientes c2 = new clientes("Ana Martínez", "ana@email.com", "Barcelona");

        productos p1 = new productos(1001, "Laptop HP", 800, 10);
        productos p2 = new productos(2001, "Monitor Samsung", 200, 15);

        pedidos ped1 = new pedidos(c1.nombre()[0], p1.nombre()[0], "01/04/2026", true, 800);

        tienda techStore = new tienda("TechStore Online", "Carlos, Ana", "Pedido1");
        techStore.mostrar();
    }
}