package A3Unifacs.sd.UnifacsA3.model;


import A3Unifacs.sd.UnifacsA3.dtos.PedidoDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedido_id;

    @JoinColumn(name = "cliente_id")
    @ManyToOne
    private Cliente cliente_id;

    @JoinColumn(name = "produto_id")
    @ManyToOne
    private Produto produto_id;


    public Pedido(PedidoDto dados) {
        this.cliente_id = dados.cliente_id();
        this.produto_id = dados.produto_id();

    }




}
