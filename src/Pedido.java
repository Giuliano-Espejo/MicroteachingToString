import java.math.BigDecimal;

public class Pedido {

    private Long id;
    private BigDecimal total;
    private Cliente cliente;

    public Pedido(Long id, BigDecimal total, Cliente cliente) {
        this.id = id;
        this.total = total;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", total=" + total +
                ", cliente=" + cliente +
                '}';
    }
}
