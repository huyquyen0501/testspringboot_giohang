package com.huy.demo.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.huy.demo.entity.Account;

@Transactional
@Repository
public class AccountDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public Account findAccount(String userName) {
		Session session= this.sessionFactory.getCurrentSession();
		return session.find(Account.class,userName);
	}
}
