package cl.falabella.insurance.demoapicore.domain.model;

import javax.persistence.Entity;

import lombok.Data;

/**
 * @author lvergara
 * LifeInsurance class
 */
@Data
@Entity
public class LifeInsurance extends Policy {
	private Double capital;
}
