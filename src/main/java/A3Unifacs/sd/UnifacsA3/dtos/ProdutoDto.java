package A3Unifacs.sd.UnifacsA3.dtos;

import A3Unifacs.sd.UnifacsA3.model.Estoque;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record ProdutoDto(@NotBlank String nome_produto, String descricao, @NotBlank String preco, @NotNull Estoque estoque_id) {
}
