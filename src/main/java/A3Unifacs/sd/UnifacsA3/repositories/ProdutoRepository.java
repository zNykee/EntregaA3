package A3Unifacs.sd.UnifacsA3.repositories;

import A3Unifacs.sd.UnifacsA3.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto , Long> {
}
