package A3Unifacs.sd.UnifacsA3.model;

import A3Unifacs.sd.UnifacsA3.dtos.AtualizarClienteDto;
import A3Unifacs.sd.UnifacsA3.dtos.ClienteDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cliente_id;
    private String nome_cliente;
    private String cpf;


    public Cliente(ClienteDto dados) {
        this.nome_cliente = dados.nome_cliente();
        this.cpf = dados.cpf();

    }

    public void atualizarCliente(AtualizarClienteDto dados) {
        if (dados.nome_cliente() != null) {
            this.nome_cliente = dados.nome_cliente();
        }
        if (dados.cpf() != null) {
            this.cpf = dados.cpf();
        }

    }




}
