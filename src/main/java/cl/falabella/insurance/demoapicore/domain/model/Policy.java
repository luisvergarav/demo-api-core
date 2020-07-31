package cl.falabella.insurance.demoapicore.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * @author lvergara Abstract policy
 */
@Entity
@Data
public abstract class Policy {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer id;
	protected String plan;
	protected String company;
	protected Double amountPesos;
	protected Double amountUF;
	protected Integer durationMonths;
	@OneToMany(
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	protected List<Promotion> promotions = new ArrayList<Promotion>();
	protected Date limitDate;

}
