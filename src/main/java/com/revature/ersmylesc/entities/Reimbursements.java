package com.revature.ersmylesc.entities;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="REIMBURSEMENT")
public class Reimbursements implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "AMOUNT")
	private Double amount;
	
	@Column(name = "SUBMITTED")
	private String submitted;
	
	@Column(name = "APPROVED")
	private String approved;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", referencedColumnName="ID",nullable=true)
	private Users users;
}
