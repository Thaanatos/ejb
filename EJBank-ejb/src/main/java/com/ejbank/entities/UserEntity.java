package com.ejbank.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ejbank_user")
@NamedQueries({
	@NamedQuery(name="UserEntity.findByLastname", query="SELECT c FROM UserEntity c where c.lastname = :lastname"),
})
public class UserEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	@Column(name="id") 
	@Id
	private int id ;
	@Column(name="firstname") private String firstname ;
	@Column(name="lastname") private String lastname ;
	@Column(name="login") private String login ;
	@Column(name="type") private String type ;
	
    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }
	
	public String getLogin() {
		return login;
	}

	public String getLastname() {
		return lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getType() {
		return type;
	}	
	
}
