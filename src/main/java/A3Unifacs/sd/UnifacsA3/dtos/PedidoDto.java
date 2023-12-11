package A3Unifacs.sd.UnifacsA3.dtos;

import A3Unifacs.sd.UnifacsA3.model.Cliente;
import A3Unifacs.sd.UnifacsA3.model.Produto;
import jakarta.validation.constraints.NotBlank;

public record PedidoDto ( Cliente cliente_id, Produto produto_id){

}
