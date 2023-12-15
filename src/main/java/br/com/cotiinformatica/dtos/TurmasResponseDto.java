package br.com.cotiinformatica.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class TurmasResponseDto {
	private UUID idTurma;
	private String nomeDaTurma;
	private String dataDeInicio;
	private String dataDeTermino;
	private UUID idProfessor;

}
