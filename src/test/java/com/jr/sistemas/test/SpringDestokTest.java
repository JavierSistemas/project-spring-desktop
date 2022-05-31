/**
 * 
 */
package com.jr.sistemas.test;

import static org.junit.Assert.assertNotNull;
import java.util.Properties;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jr.sistemas.dao.DisqueraDAO;

/**
 * @author Jreye
 * Clase de prueba unitaria que permite realizar pruebas con el framework Spring.
 *
 */
public class SpringDestokTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disqueraDAO = (DisqueraDAO)context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		
		System.out.println("Contexto cargado con éxito.");
		System.out.println(disqueraDAO);
		
		// :::::::::::::: PROPERTIES ::::::::::::::::::::.
		Properties properties =  (Properties)context.getBean("properties");
		System.out.println(properties.get("spring-username"));
	}

}
















