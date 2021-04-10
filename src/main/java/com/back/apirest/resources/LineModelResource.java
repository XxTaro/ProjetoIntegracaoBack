package com.back.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.back.apirest.models.LineModelEntity;
import com.back.apirest.repository.LineModelRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST - Projeto 4")
@CrossOrigin(origins="*")
public class LineModelResource {

	@Autowired
	LineModelRepository lineModelRepository;
	
	@GetMapping("/linemodel")
	@ApiOperation(value="Retorna a lista de Linhas e Modelos")
	public List<LineModelEntity> listaLineModel(){
		return lineModelRepository.findAll();
	}
	
	@GetMapping("/linemodel/{id}")
	@ApiOperation(value="Retorna um Modelo de linha")
	public LineModelEntity idLineModel(@PathVariable(value="id") int id){
		return lineModelRepository.findById(id);
	}
	
	@PostMapping("/linemodel")
	@ApiOperation(value="Salva um Modelo de linha a lista")
	public LineModelEntity postLineModel(@RequestBody LineModelEntity lineModel) {
		return lineModelRepository.save(lineModel);
	}
	
	@DeleteMapping("/linemodel")
	@ApiOperation(value="Deleta um Modelo de linha da lista")
	public void deleteLineModel(@RequestBody LineModelEntity lineModel) {
		lineModelRepository.delete(lineModel);
	}
	
	@PutMapping("/linemodel")
	@ApiOperation(value="Atualiza um Modelo de linha da lista")
	public LineModelEntity updateLineModel(@RequestBody LineModelEntity lineModel) {
		return lineModelRepository.save(lineModel);
	}
}
