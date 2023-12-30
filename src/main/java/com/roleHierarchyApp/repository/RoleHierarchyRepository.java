package com.roleHierarchyApp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.roleHierarchyApp.dto.Staff;

public class RoleHierarchyRepository {

	private static RoleHierarchyRepository hierarchyRepository;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	private EntityManager em = emf.createEntityManager();
	private RoleHierarchyRepository() {
		
	}
	
	public static RoleHierarchyRepository getInstance(){
		if(hierarchyRepository==null) {
			hierarchyRepository = new RoleHierarchyRepository();
		}
		return hierarchyRepository;
	}

	public void addStaff(Staff s) {
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(s);
		et.commit();
	}
	public List getStaff() {
		Query q = em.createQuery("select s from Staff s");
		return q.getResultList();
	}
}
