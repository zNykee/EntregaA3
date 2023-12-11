package A3Unifacs.sd.UnifacsA3.dtos;

import A3Unifacs.sd.UnifacsA3.model.Estoque;
import jakarta.validation.constraints.NotNull;

import java.security.cert.Extension;


public record AtualizarProdutoDto(@NotNull Long produto_id,  String nome_produto , String preco, String descricao  ) {
}