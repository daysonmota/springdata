package br.com.alura.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import br.com.alura.model.Funcionario;
import br.com.alura.repository.FuncionarioRepository;
import br.com.alura.specification.SpecificationFuncionario;

@Service
public class RelatorioFuncionarioDinamico {

	@Autowired
	private  FuncionarioRepository funcionarioRepository;
	
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


	
	public void inicial(Scanner scanner) {
		System.out.println("Digite o nome");
		String nome = scanner.next();
		
	
		System.out.println("Digite o cpf");
		String cpf = scanner.next();
		
	
		
		System.out.println("Digite o Salario");
		Double salario = scanner.nextDouble();
		
		
		
		System.out.println("Digite o data de contratacao");
		String data = scanner.next();
	
		if(nome.equalsIgnoreCase("NULL")) {
			nome = null;
		}
	
		if(cpf.equalsIgnoreCase("NULL")) {
			cpf = null;
		}
		
		if(salario == 0) {
			salario = null;
		}
		
		LocalDate dataContratacao;
		if(data.equalsIgnoreCase("NULL")) {
			dataContratacao = null;
		} else {
			dataContratacao = LocalDate.parse(data, formatter);
		}
		
		/*Monta consulta*/
		List<Funcionario> funcionarios = funcionarioRepository.findAll(Specification
				.where(
						SpecificationFuncionario.nome(nome))
						.or(SpecificationFuncionario.cpf(cpf))
						.or(SpecificationFuncionario.salario(salario))
						.or(SpecificationFuncionario.dataContratacao(dataContratacao))
				);
		funcionarios.forEach(System.out::println);
	}
	
}