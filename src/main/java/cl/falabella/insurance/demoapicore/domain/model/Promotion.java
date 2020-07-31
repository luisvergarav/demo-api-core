package cl.falabella.insurance.demoapicore.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author lvergara
 * Promotion Class
 */
@Data
@Entity
class Promotion {
	@Id
    @GeneratedValue
	private Integer id;
	private String code;
	private String valor;
	
	
}
