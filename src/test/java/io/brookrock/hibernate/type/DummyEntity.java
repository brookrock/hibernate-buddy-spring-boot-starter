package io.brookrock.hibernate.type;

import java.util.List;

import javax.persistence.Entity;

import org.hibernate.annotations.Type;

import io.brookrock.hibernate.domain.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DummyEntity extends AbstractEntity {

	private static final long serialVersionUID = 6471017006033411659L;

	@Type(type = "json")
	private List<DummyComponent> dummyComponentList;

}