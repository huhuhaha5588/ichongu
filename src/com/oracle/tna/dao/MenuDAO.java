package com.oracle.tna.dao;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;


@Repository
@Scope("singleton")
public class MenuDAO {
	
	@Resource
	private HibernateTemplate hibernateTemplate;
	public MenuDAO(){}
	

}
