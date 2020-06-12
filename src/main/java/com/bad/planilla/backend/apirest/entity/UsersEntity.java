package com.bad.planilla.backend.apirest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users",schema = "public", catalog = "dfckhqghp2ho34")
@Getter
@Setter
public class UsersEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_user",nullable=false)
	@SequenceGenerator(name="user_id_seq",sequenceName="users_id_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="user_id_seq")
	private int idUser;
	
	@Column(name="username", unique=true, length=50,nullable=false)
	private String username;
	
	@Column(name="email", unique=true, length=60, nullable=false)
	private String email;
	
	@Column(name="password",length=256,nullable=false)
	private String password;
	
	@Column(name="estado")
	private boolean estado = true;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="users_roles")
	private Set<RolesEntity> roles = new HashSet<RolesEntity>();
	
}
