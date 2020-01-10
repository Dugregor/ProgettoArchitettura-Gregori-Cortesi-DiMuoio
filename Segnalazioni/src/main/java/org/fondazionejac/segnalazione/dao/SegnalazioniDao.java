package org.fondazionejac.segnalazione.dao;

import java.util.List;

import org.fondazionejac.segnalazione.build.Segnalazione;
import org.fondazionejac.segnalazione.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

public class SegnalazioniDao {
	public List<Segnalazione> selTutti(){
		try(Session session =HibernateUtil.getSessionFactory().openSession()){
			Query<Segnalazione> query= session.createQuery("from Segnalazione",Segnalazione.class);
			return query.list();
		}
	}
	public Segnalazione selById(int id){
		try(Session session =HibernateUtil.getSessionFactory().openSession()){
			return session.find(Segnalazione.class, id);
		}
	}
	public void insSegn(Segnalazione segn) {
		try(Session session =HibernateUtil.getSessionFactory().openSession()){
			Transaction trans=session.beginTransaction();
			session.persist(segn);
			trans.commit();
		}
	}
}
