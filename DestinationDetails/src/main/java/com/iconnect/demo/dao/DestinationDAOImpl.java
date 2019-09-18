package com.iconnect.demo.dao;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import  com.iconnect.demo.domain.Destination;

@XmlRootElement(name = "destination")
@Repository
public class DestinationDAOImpl implements DestinationDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Destination> listDestinations() {
		Session session = sessionFactory.getCurrentSession();
		List<Destination> destinationsList = session.createQuery("from Destination").list();
		return destinationsList;
	}


}
