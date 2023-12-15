package br.com.cotiinformatica.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class AlunosResponseDto {
	private UUID idAluno;
	private String nome;
	private String matricula;
	private String Cpf;

}
