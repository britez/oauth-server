package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Application extends Model {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long id;
	public String name;
	public String description;

}
