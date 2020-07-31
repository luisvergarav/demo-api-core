/**
 * 
 */
package cl.falabella.insurance.demoapicore.domain.service;

import java.util.Date;
import java.util.List;

import cl.falabella.insurance.demoapicore.domain.model.Policy;

/**
 * @author lvergara
 * Insurance Service Interface
 */
public interface InsuranceService {
	List<Policy> getPoliciesByDate(Date birthDate);
}
