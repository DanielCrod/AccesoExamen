package com.daniel.HiberanteExamenDanielCuarental;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.daniel.HiberanteExamenDanielCuarental.Piso;
import com.daniel.HiberanteExamenDanielCuarental.Zona;
import com.daniel.HiberanteExamenDanielCuarental.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = HibernateUtil.getSessionFactory();
    	Session session = HibernateUtil.getSession();
    	
        Scanner entrada = new Scanner(System.in);
        System.out.println(" 1.Alta Piso \n 2.Reservar un piso \n 3.Borrar piso \n 4.Listar pisos");
        int opcion = entrada.nextInt();
        
        switch (opcion) {
        case 1:
        	System.out.println("Id_piso:"); 
        	int id_piso = entrada.nextInt();
        	System.out.println("Id_zona:");
        	int id_zona = entrada.nextInt();
        	System.out.println("Tipo de operación: \n 1.Alquiler \n 2.Venta");
        	String tipo_operacion = entrada.nextLine();
        	System.out.println("Metros:");
        	int metros = entrada.nextInt();
        	System.out.println("Nombre propietario:");
        	String nombre_propietario = entrada.nextLine();
        	System.out.println("Telefono:");
        	int telefono = entrada.nextInt();
        	System.out.println("Precio");
        	int precio = entrada.nextInt();
        	
        	/*if (id_zona > 0 & id_zona < 7) {
        		Piso piso = new Piso(id_piso, , tipo_operacion, metros, nombre_propietario, telefono, precio);
        		session.beginTransaction();
        		session.save(piso);
        		session.getTransaction().commit();
        	}*/
        	break;
        	
        case 2:
        	
        		PreparedStatement ps;  
        		System.out.println("Id del piso que quiere reservar:");
        		int idPisoReserva = entrada.nextInt();
        		String sql = "DELETE FROM Pisos WHERE Id_piso = ?";
        		ps = (PreparedStatement).prepareStatement(sql);
        		Piso pisoRes = (Piso) session.createQuery("FROM Pisos WHERE Id_piso = ?").uniqueResult();
        		ps.setInt(1, idPisoReserva);
        		if (pisoRes != null) {
        			System.out.println(pisoRes.toString());
        			// modifico el campo nombre por poner un ejemplo
        			pisoRes.setReservado(true);
        			session.beginTransaction();
        			session.update(pisoRes);
        			session.getTransaction().commit();
        		}
        	break;
        	
        case 3: 
        	//Probando con un WHERE "a mano" tampoco funciona, revisando el proyecto de Departamento y empleado, se declaraba
        	//igual, pero en este caso me da error.
        	Query borrar_piso = session.createQuery("FROM Piso  WHERE Id_piso = 1");
        	
        	session.beginTransaction();
    		session.delete(borrar_piso);
    		session.getTransaction().commit();
        	break;
        	
        case 4:
        	List<Piso> lista = session.createQuery("from Piso").getResultList();

    		for (Piso p : lista) {
    			
    			System.out.println(p.toString());

    		}
        }
        
        session.close();
    }
}
