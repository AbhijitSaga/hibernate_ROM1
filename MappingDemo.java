package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		// Emp
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		e1.seteId(1001);
		e1.seteName("raghupati");
		e2.seteId(1002);
		e2.seteName("raja ram");

		// Project
		Project p1 = new Project();
		Project p2 = new Project();
		p1.setpId(105);
		p1.setpName("Library management System");
		p2.setpId(106);
		p2.setpName("school management System");

		// List
		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();
		list1.add(e1);
		list1.add(e2);
		list2.add(p1);
		list2.add(p2);

		//
		e1.setProjects(list2);
		p1.setEmps(list1);
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
        s.save(e1);
        s.save(e2);
        s.save(p1);
        s.save(p2);
		tx.commit();
		s.close();
		factory.close();
	}

}
