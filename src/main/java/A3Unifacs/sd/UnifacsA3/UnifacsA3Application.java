package A3Unifacs.sd.UnifacsA3;

import A3Unifacs.sd.UnifacsA3.dtos.EstoqueDto;
import A3Unifacs.sd.UnifacsA3.model.Cliente;
import A3Unifacs.sd.UnifacsA3.model.Estoque;
import A3Unifacs.sd.UnifacsA3.model.Produto;
import A3Unifacs.sd.UnifacsA3.repositories.ClienteRepository;
import A3Unifacs.sd.UnifacsA3.repositories.EstoqueRepository;
import A3Unifacs.sd.UnifacsA3.repositories.ProdutoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;




@SpringBootApplication
public class UnifacsA3Application {

	public static void main(String[] args) {
		SpringApplication.run(UnifacsA3Application.class, args);
	}


	@Bean
	public CommandLineRunner inicializarestoque(EstoqueRepository repositorioEstoque) {
		return args -> {

			Estoque estoque= new Estoque();
			estoque.setEstoque_id(1L);
			estoque.setNome_estoque("estoque de pao");
			estoque.setQuantidade(33L);
			repositorioEstoque.save(estoque);


		};
	}







	@Bean
	public CommandLineRunner inicializarCliente1(ClienteRepository repositorioCliente) {
		return args -> {

			Cliente cliente = new Cliente();
			cliente.setNome_cliente("Nicholas Torres");
			cliente.setCpf("355.663.300-02");
			repositorioCliente.save(cliente);


		};
	}

	@Bean
	public CommandLineRunner inicializarCliente2(ClienteRepository repositorioCliente) {
		return args -> {

			Cliente cliente = new Cliente();
			cliente.setNome_cliente("Breno pimentel");
			cliente.setCpf("677.613.590-83");
			repositorioCliente.save(cliente);


		};

	}
	@Bean
	public CommandLineRunner inicializarCliente3(ClienteRepository repositorioCliente) {
		return args -> {

			Cliente cliente = new Cliente();
			cliente.setNome_cliente("Priscila Simas ");
			cliente.setCpf("907.781.020-09");
			repositorioCliente.save(cliente);


		};

	}

	@Bean
	public CommandLineRunner inicializarCliente4(ClienteRepository repositorioCliente) {
		return args -> {

			Cliente cliente = new Cliente();
			cliente.setNome_cliente(" Pablo Santana");
			cliente.setCpf("570.746.450-60");
			repositorioCliente.save(cliente);


		};

	}

	@Bean
	public CommandLineRunner inicializarCliente5(ClienteRepository repositorioCliente) {
		return args -> {

			Cliente cliente = new Cliente();
			cliente.setNome_cliente(" Roque Leto");
			cliente.setCpf("271.035.560-40");
			repositorioCliente.save(cliente);


		};

	}
//---------------------------------------------------------------------------------------------------------------------------------------------------*/


	@Bean
	public CommandLineRunner inicializarProduto1(ProdutoRepository repositorioproduto) {
		return args -> {

			Produto produto = new Produto();
			produto.setNome_produto(" Pão de sal");
			produto.setDescricao("pão feito com farinha parcial ou totalmente moída de grãos de trigo inteiros ou quase inteiros");
			produto.setPreco("R$ 0,20");
			repositorioproduto.save(produto);

		};

	}

	@Bean
	public CommandLineRunner inicializarProduto2(ProdutoRepository repositorioproduto) {
		return args -> {
			Produto produto = new Produto();
			produto.setNome_produto(" Pão de Mel");
			produto.setDescricao("Pão de forma é um produto obtido a partir da massa, doce ou salgada, da farinha de trigo, assada. A massa é moldada em uma forma ou molde");
			produto.setPreco("R$ 0,50");
			repositorioproduto.save(produto);

		};

	}





	@Bean
	public CommandLineRunner inicializarProduto3(ProdutoRepository repositorioproduto) {
		return args -> {

			Produto produto = new Produto();
			produto.setNome_produto(" Suco Del valle uva");
			produto.setDescricao("Suco sabor uva da marca Del valle (1,5 Litros)");
			produto.setPreco("R$ 5,99");
			repositorioproduto.save(produto);

		};

	}

	@Bean
	public CommandLineRunner inicializarProduto4(ProdutoRepository repositorioproduto) {
		return args -> {

			Produto produto = new Produto();
			produto.setNome_produto(" Queijo mussarelas sadia");
			produto.setDescricao("Queijo Sadia Vacuo 150G Fatiado ");
			produto.setPreco("R$ 30,00");
			repositorioproduto.save(produto);

		};

	}

	@Bean
	public CommandLineRunner inicializarProduto5(ProdutoRepository repositorioproduto) {
		return args -> {

			Produto produto = new Produto();
			produto.setNome_produto(" Presunto cozido sadia");
			produto.setDescricao("Presunto Sadia Vacuo 180G Fatiado");
			produto.setPreco("R$ 11,00");
			repositorioproduto.save(produto);

		};

	}
	@Bean
	public CommandLineRunner inicializarProduto6(ProdutoRepository repositorioproduto) {
		return args -> {

			Produto produto = new Produto();
			produto.setNome_produto(" Coxinha de Frango ");
			produto.setDescricao("coxinha com recheio elaborado com carne temperada de frango, queijo e calabresa ");
			produto.setPreco("R$ 4,00");
			repositorioproduto.save(produto);

		};

	}

	@Bean
	public CommandLineRunner inicializarProduto7(ProdutoRepository repositorioproduto) {
		return args -> {

			Produto produto = new Produto();
			produto.setNome_produto(" Halls Uva Verde ");
			produto.setDescricao("tambem conhecido como o melhor halls do mundo ");
			produto.setPreco("R$ 2,00");
			repositorioproduto.save(produto);

		};

	}

	@Bean
	public CommandLineRunner inicializarProduto8(ProdutoRepository repositorioproduto) {
		return args -> {

			Produto produto = new Produto();
			produto.setNome_produto(" Guaraná Antarctica ");
			produto.setDescricao("Refrigerante sabor Guaraná (2,0 Litros )");
			produto.setPreco("R$ 5,00");
			repositorioproduto.save(produto);

		};

	}


	@Bean
	public CommandLineRunner inicializarProduto9(ProdutoRepository repositorioproduto) {
		return args -> {

			Produto produto = new Produto();
			produto.setNome_produto("Bolo de chocolate Suflai");
			produto.setDescricao("Bolo com massa de pão de ló de chocolate, molhado com nossa calda especial, recheado com mousse de chocolate areado");
			produto.setPreco("R$ 100,00");
			repositorioproduto.save(produto);

		};

	}


	@Bean
	public CommandLineRunner inicializarProduto10(ProdutoRepository repositorioproduto) {
		return args -> {

			Estoque estoque = new Estoque();
			Produto produto = new Produto();
			produto.setNome_produto(" Guardanapo Prática ");
			produto.setDescricao("Guardanapo Prática da marca Prática 22 x 22,5 cm");
			produto.setPreco("R$ 5,00");
			repositorioproduto.save(produto);

		};

	}


}
