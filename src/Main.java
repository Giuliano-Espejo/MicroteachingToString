import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Cliente c = new Cliente(10L, "Juan Perez", "juan@mail.com");
        Pedido p = new Pedido(501L, new BigDecimal("24999.90"), c);

        System.out.println(p);
    }
}
