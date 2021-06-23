package io.brookrock.hibernate.audit;

import javax.persistence.Entity;

import io.brookrock.hibernate.domain.AbstractAuditableEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AuditableEntity extends AbstractAuditableEntity {

	private static final long serialVersionUID = -4902047633960048660L;
	
	private String name;

}