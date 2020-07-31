package cl.falabella.insurance.demoapicore.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.falabella.insurance.demoapicore.domain.model.Policy;
import cl.falabella.insurance.demoapicore.domain.service.InsuranceService;
import lombok.extern.slf4j.Slf4j;


@CrossOrigin(origins = "*")
@RestController
@Slf4j
public class InsuranceController {

	@Autowired
	private InsuranceService insuranceService;
	

	@RequestMapping(path = "/apicore/v1/policy", method = GET)
	public ResponseEntity<List<Policy>> getPolicies(
			@RequestParam Date birthDate) {
		try {
			log.info("API Core Peticion  [Rut {}] [BirthDate {}] [Email {}] [Phone {}] ",birthDate);
			 
			List<Policy> listaPolizas = insuranceService.getPoliciesByDate(birthDate);
			
			listaPolizas.stream().forEach(s -> System.out.println(s));
			
			return new ResponseEntity<List<Policy>>(listaPolizas,HttpStatus.OK);	
		}catch(Exception e) {
			log.error("Error consultando las polizas [{}] [{}]", e.getLocalizedMessage());
			return new ResponseEntity<List<Policy>>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	

}