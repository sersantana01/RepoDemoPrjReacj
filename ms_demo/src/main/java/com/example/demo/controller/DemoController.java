package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.DemoException;
import com.example.demo.form.EmpleadosForm;
import com.example.demo.form.ParametrosDataDto;
import com.example.demo.service.DemoService;
import com.example.demo.service.DemoServiceImpl;
import com.example.demo.service.MapValidarFormService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


//Controllador de prueba 

@CrossOrigin(origins = { "http://localhost:4200" })
@Api(value="Eventos", description="Obtiene eventos del operador.")
@RestController(value="Eventos")
public class DemoController {

    @Autowired
	DemoService demoService;

    @Autowired
    MapValidarFormService validarFormService;
    
    
    /*
    @ApiOperation(value = "Obtiene lista de eventos", response =  String.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved list"),
        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
	@RequestMapping(value="/getEvento", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	*/
    @ApiOperation(value = "Obtener informacion de eventos")
	@PostMapping("/obtenerEvento")
	public ResponseEntity<?> obtenerEvento(@ApiParam(value = "Json de parametros para obtener informacion de Eventos", required = true)
	                                       @Valid @RequestBody ParametrosDataDto parametrosDataDto,
			                               BindingResult result  ) {
		
			ResponseEntity<?> errorMap = validarFormService.valdarFormService(result);
			if(errorMap!=null) return errorMap;

			String resultado = demoService.obtenerEeventos(parametrosDataDto);
			return new ResponseEntity<String>(resultado, HttpStatus.OK);





	}

}
