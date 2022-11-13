package br.com.alura;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.service.CrudCargoService;
import br.com.alura.service.CrudFuncionarioService;
import br.com.alura.service.CrudUnidadeTrabalhoService;
import br.com.alura.service.RelatorioFuncionarioDinamico;
import br.com.alura.service.RelatoriosService;

@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner {

	@Autowired
	private CrudCargoService crudCargoService;

	@Autowired
	private RelatoriosService relatoriosService;
	
	@Autowired
	private CrudFuncionarioService crudFuncionarioService;
	
	@Autowired
	private CrudUnidadeTrabalhoService crudUnidadeTrabalhoService;
	
	@Autowired
	private RelatorioFuncionarioDinamico relatorioFuncionarioDinamico;

	private Boolean system = true;

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		while (system) {
			System.out.println("Qual ação voce quer executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Cargo");
			System.out.println("2 - Funcionario");
			System.out.println("3 - Unidade");
			System.out.println("4 - Relatorios");
			System.out.println("5 - Relatorio dinamico");

			int action = scanner.nextInt();

			switch (action) {
			case 1:
				crudCargoService.inicial(scanner);
				break;
			
			case 2: 
				crudFuncionarioService.inicial(scanner);
				break;
			case 3: 
				crudUnidadeTrabalhoService.inicial(scanner);
				break;
			case 4:
				relatoriosService.inicial(scanner);
				break;
			case 5:
				relatorioFuncionarioDinamico.inicial(scanner);
				break;
			default:
				System.out.println("Finalizando");
				system = false;
				break;
			}
			
		}
	}
}
