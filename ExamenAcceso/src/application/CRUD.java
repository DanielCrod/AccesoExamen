package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUD {
	public static void altaPiso (Connection con, Piso piso) {
		PreparedStatement ps;
		String sql;
		String sqlComprobar;
		
		
		try {
		
			sql = ("insert into Pisos(Id_piso,Id_zona,Tipo_Operacion,Metros,Nombre_propietario,Telefono_contacto,Precio,Reservado)");
			ps = con.prepareStatement(sql);
			
			
			ps.setInt(1, piso.getId_piso());
			ps.setInt(2, piso.getId_Zona());
			ps.setString(3, piso.getTipo_Operacion());
			ps.setInt(4, piso.getMetros());
			ps.setString(5, piso.getNombre_Propietario());
			ps.setInt(6, piso.getTelefono_contacto());
			ps.setInt(7, piso.getPrecio());
			ps.setBoolean(8, piso.isReservado());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error de inserción");
		}
		
	}
	
	public static void borrarPiso (Connection con, int id_piso) {
		PreparedStatement ps;
		String sql;
		
		try {
			sql = ("DELETE FROM Pisos WHERE Id_piso = ?");
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, id_piso);
		} catch (SQLException e) {
			System.out.println("Error al borrar");
		}
	}
}
