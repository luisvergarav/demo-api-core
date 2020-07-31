package cl.falabella.insurance.demoapicore.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.falabella.insurance.demoapicore.domain.model.Policy;

@Repository
public interface InsuranceRepository extends CrudRepository<Policy, Integer> {

	List<Policy> findByLimitDate(@Param("limitDate") Date limitDate);

	@Query("select a from Policy a where a.limitDate > :birthDate")
	List<Policy> findAllWithLimitDateBefore(@Param("birthDate") Date limitDate);
}
