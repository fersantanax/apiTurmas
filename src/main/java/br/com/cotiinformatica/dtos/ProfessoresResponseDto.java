package br.com.cotiinformatica.dtos;

import java.util.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class ProfessoresResponseDto {
	private UUID idProfessor;
	private String nome;
	private String Telefone;
	private Date dataHoraCadastro;
}