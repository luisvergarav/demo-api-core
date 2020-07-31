package cl.falabella.insurance.demoapicore.domain.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.falabella.insurance.demoapicore.domain.model.Policy;
import cl.falabella.insurance.demoapicore.repository.InsuranceRepository;

/**
 * @author lvergara Insurance Service Concrete implementation
 * Service implementing cache manager Pattern
 */ 
@Service
public class InsuranceServiceImpl implements InsuranceService {

	private final InsuranceRepository insuranceRepository;
	

	@Autowired
	public InsuranceServiceImpl(final InsuranceRepository insuranceRepository) {
		this.insuranceRepository = insuranceRepository;
		}

	public List<Policy> getPoliciesByDate(Date birthDate) {

		
		List <Policy> policies = this.insuranceRepository.findAllWithLimitDateBefore(birthDate);
				
		return policies;
	}

}
