package com.map1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pId;
	@Column(name = "project_name")
	private String pName;
	@ManyToMany(mappedBy = "projects")
	private List<Emp> emps;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public Project(int pId, String pName, List<Emp> emps) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.emps = emps;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

}
