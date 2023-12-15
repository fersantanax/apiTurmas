package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.AlunosRequestDto;
import br.com.cotiinformatica.dtos.AlunosResponseDto;
import br.com.cotiinformatica.dtos.MatriculasRequestDto;
import br.com.cotiinformatica.dtos.ProfessoresRequestDto;
import br.com.cotiinformatica.dtos.ProfessoresResponseDto;
import br.com.cotiinformatica.dtos.TurmasRequestDto;
import br.com.cotiinformatica.dtos.TurmasResponseDto;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/turmas")
public class TurmasController {

	@PostMapping("turmas")
	public TurmasResponseDto criar(@RequestBody @Valid TurmasRequestDto request) {

		return null;
	}

	@PostMapping("alunos")
	public AlunosResponseDto alunos(@RequestBody @Valid AlunosRequestDto request) {

		return null;
	}

	@PostMapping("professores")
	public ProfessoresResponseDto professores(@RequestBody @Valid ProfessoresRequestDto request) {

		return null;
	}

	@PostMapping("matriculas")
	public MatriculasRequestDto matriculas(@RequestBody @Valid MatriculasRequestDto request) {

		return null;
	}
}