package br.com.cotiinformatica.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class TurmasRequestDto {
	private UUID idTurma;
	private String dataDeinicio;
	private String dataDeTermino;
	private UUID idProfessor;

}
