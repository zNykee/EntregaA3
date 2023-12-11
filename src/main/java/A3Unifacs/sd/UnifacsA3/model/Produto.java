package A3Unifacs.sd.UnifacsA3.model;

import A3Unifacs.sd.UnifacsA3.dtos.AtualizarProdutoDto;
import A3Unifacs.sd.UnifacsA3.dtos.ProdutoDto;
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
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produto_id;
    private String nome_produto;
    private String descricao;
    private String preco;

    @ManyToOne
    @JoinColumn(name = "estoque_id")
    private Estoque estoque_id;


    public Produto(ProdutoDto dados) {
        this.nome_produto = dados.nome_produto();
        this.descricao = dados.descricao();
        this.preco = dados.preco();
        this.estoque_id = dados.estoque_id();


    }

    public void atualizarProduto(AtualizarProdutoDto dados) {


        if (dados.nome_produto() != null) {
            this.nome_produto = dados.nome_produto();
        }
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if (dados.preco() != null) {
            this.preco = dados.preco();
        }

    }


}


