package com.ejbank.entities.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="ejbank_advisor")
@DiscriminatorValue("advisor")
public class AdvisorEntity extends UserEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}