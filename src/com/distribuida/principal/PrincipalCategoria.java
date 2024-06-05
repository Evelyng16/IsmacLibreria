package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;



public class PrincipalCategoria {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CategoriaDAO categoriaDAO= context.getBean("categoriaDAOImpl", CategoriaDAO.class);

	}

}
