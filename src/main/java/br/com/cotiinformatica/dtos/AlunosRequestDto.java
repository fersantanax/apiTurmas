package br.com.cotiinformatica.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AlunosRequestDto {

	@Size(min = 8, max = 100, message = "Informe o nome com 8 a 100 caracteres.")
	@NotBlank(message = "O preenchimento do nome é obrigatório.")

	private String nome;

	@Pattern(regexp = "!^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")
	@NotBlank(message = "O preenchimento da matrícula é obrigatório.")

	private String Matricula;

	@Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")
	
			@NotBlank(message = "O preenchimento do cpf é obrigatório."
					+ "Informe um CPF no formato '999.999.999-99'.")
	
	private String Cpf;

}
