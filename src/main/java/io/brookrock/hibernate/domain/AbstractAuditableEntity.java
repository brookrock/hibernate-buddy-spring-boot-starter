package io.brookrock.hibernate.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonView;

import io.brookrock.hibernate.audit.Auditable;
import io.brookrock.hibernate.audit.CreationUser;
import io.brookrock.hibernate.audit.UpdateUser;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class AbstractAuditableEntity extends AbstractEntity implements Auditable {

	private static final long serialVersionUID = 5475643360223852432L;

	@CreationTimestamp
	@JsonView(Auditable.class)
	@Column(updatable = false)
	private LocalDateTime createdDate;

	@UpdateTimestamp
	@JsonView(Auditable.class)
	@Column(insertable = false)
	private LocalDateTime lastModifiedDate;

	@CreationUser
	@JsonView(Auditable.class)
	@Column(updatable = false)
	private String createdBy;

	@UpdateUser
	@JsonView(Auditable.class)
	@Column(insertable = false)
	private String lastModifiedBy;

}