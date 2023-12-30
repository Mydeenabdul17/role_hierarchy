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
	public List getStaff(String role) {
		Query q = em.createQuery("select s from Staff s where reportingRole = :reportingRole");
		q.setParameter("reportingRole", role);
		return q.getResultList();
	}

	public Staff getRepoRole(String aRole) {
		Query q = em.createQuery("select s from Staff s where role = :role");
		q.setParameter("role", aRole);
		return ((Staff) q.getResultList().get(0));
	}

	public void changeRepoRole(Staff tRole, String string) {
		EntityTransaction et = em.getTransaction();
		tRole.setReportingRole(string);
		
		et.begin();
		em.persist(tRole);
		et.commit();
	}

	public List<Staff> getAllStaff() {
		Query q = em.createQuery("select s from Staff s");
		return q.getResultList();
	}

	public void changeStaff(Staff staff2) {
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(staff2);
		et.commit();
		
	}

	public int getCount(String name) {
		int count=0;
		Query q = em.createQuery("select s from Staff s where name = :name");
		q.setParameter("name", name);
		Staff s = ((Staff) q.getResultList().get(0));
		while(s.getReportingRole()!=null) {
			count++;
			s=getRepoRole(s.getReportingRole());
		}
		return count;
	}
}
