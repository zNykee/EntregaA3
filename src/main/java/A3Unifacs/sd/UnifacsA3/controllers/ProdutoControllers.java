package A3Unifacs.sd.UnifacsA3.controllers;


import A3Unifacs.sd.UnifacsA3.dtos.AtualizarProdutoDto;
import A3Unifacs.sd.UnifacsA3.dtos.ProdutoDto;
import A3Unifacs.sd.UnifacsA3.model.Produto;
import A3Unifacs.sd.UnifacsA3.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoControllers {

    @Autowired
    private ProdutoRepository repository;


    @PostMapping("/cadastrarproduto")
    @Transactional
    public void cadastrar(@RequestBody @Valid ProdutoDto dados) {
        repository.save(new Produto(dados));


    }

    @GetMapping("/listarproduto")
    public List<Produto> listar() {
        return repository.findAll();
    }


    @PutMapping("atualizarproduto")
    @Transactional
    public void atualizar(@RequestBody @Valid AtualizarProdutoDto dados){
        var produto = repository.getReferenceById(dados.produto_id());
            produto.atualizarProduto(dados);

    }

    @DeleteMapping("/excluirproduto/{id}")
    @Transactional
    public void excluir(@RequestBody @PathVariable Long id) {
        repository.deleteById(id);
    }



}
