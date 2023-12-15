package br.com.cotiinformatica.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class MatriculasRequestDto {
	private UUID idTurma;
	private UUID idProfessor;
	private String dataDematricula;

}
