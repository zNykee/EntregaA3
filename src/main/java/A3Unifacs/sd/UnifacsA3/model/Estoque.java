package A3Unifacs.sd.UnifacsA3.model;

import A3Unifacs.sd.UnifacsA3.dtos.AtualizarEstoqueDto;
import A3Unifacs.sd.UnifacsA3.dtos.EstoqueDto;
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
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estoque_id;
    private String nome_estoque;
    private Long quantidade;


    public Estoque(EstoqueDto dados) {
        this.nome_estoque = dados.nome_estoque();
        this.quantidade = dados.quantidade();
    }

    public void atualizarEstoque(AtualizarEstoqueDto dados) {
        if (dados.nome_estoque() != null) {
            this.nome_estoque = dados.nome_estoque();
        }
        if (dados.quantidade() != null) {
            this.quantidade = dados.quantidade();
        }

    }


}
