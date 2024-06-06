package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;




public class PrincipalCategoria {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//Categoria
		CategoriaDAO categoriaDAO= context.getBean("categoriaDAOImpl", CategoriaDAO.class);
		 List<Categoria> categoria = categoriaDAO.findAll();
		 
		    categoria.forEach(item -> {
		    	
		    	System.out.println(item.toString());
		    });
			context.close();

	}

}
