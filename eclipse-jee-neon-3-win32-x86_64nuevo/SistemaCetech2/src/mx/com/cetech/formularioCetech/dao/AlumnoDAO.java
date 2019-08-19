package mx.com.cetech.formularioCetech.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import mx.com.cetech.formularioCetech.bean.Alumno;
import mx.com.cetech.formularioCetech.util.BaseDatos;

import com.mysql.jdbc.PreparedStatement;

public class AlumnoDAO {
	BaseDatos db = new BaseDatos(); // CLASE QUE HARA LA CONEXION HACIA LA BASE
									// DE DATOS
	Alumno alumno = new Alumno();
	Connection dbConteccion = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String sqlQuery = null;

	public Map<String, String> insertar(Alumno alumno) throws SQLException {
		Map<String, String> returnMap = new HashMap<String, String>();
		// BaseDatos db = new BaseDatos(); //CLASE QUE HARA LA CONEXION HACIA LA
		// BASE DE DATOS
		// alumno alumno = new alumno();
		// Connection dbConteccion = null;

		// Prepare statement: lleva signos de interrogacion porque se usan
		// signos de interrogacion
		// Statement

		// String sqlQuery = "SELECT * FROM talumno WHERE nombre = ? AND
		// contrasenia = ?";
		sqlQuery = "insert into estudiantes"
				+ "(nombre, apellidoPaterno, apellidoMaterno, correoElectronico, curso, formaDePago, sexo, fechaNacimiento, telefono, calle, codigoPostal, colonia, estado, delegacion, ocupacion, nivelAcademico, escuela, medio, expectativas)"
				+ " values " + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		// INSERT INTO `cetech`.`estudiantes` (`nombre`, `apellidoPaterno`,
		// `apellidoMaterno`, `correoElectronico`, `curso`, `sexo`, `edad`,
		// `fechaNacimiento`, `telefono`, `direccion`, `ocupacion`,
		// `nivelAcademico`, `escuela`, `medio`, `expectativas`)
		// VALUES ('Nuevo', 'ap', 'apm', ' correo', '1', 'm', '25',
		// '1990-09-29', '5511223344', 'calle no se', 'estudiante',
		// 'licenciatura', 'Politecnico', 'Facebook', 'basico','otroscursos creado por marioRamon')

		// PreparedStatement ps = null;
		// ResultSet rs = null; //Objeto regresado cuando se realiza la consulta

		dbConteccion = db.getDBConnection();
		try {
			ps = (PreparedStatement) dbConteccion.prepareStatement(sqlQuery); // SE
																				// CARGA
																				// EL
																				// QUERY
			// ps.setString(1, usr);
			// ps.setString(2, contrasenia);
			System.out.println("Prueba de recibir Variable en el DAO 1: " + alumno.getNombre());
			System.out.println("Prueba de recibir Variable en el DAO 2: " + alumno.getApellidoPaterno());
			System.out.println("Prueba de recibir Variable en el DAO 3: " + alumno.getApellidoMaterno());
			System.out.println("Prueba de recibir Variable en el DAO 4: " + alumno.getCorreoElectronico());
			System.out.println("Prueba de recibir Variable en el DAO 5: " + alumno.getCurso());
			System.out.println("Prueba de recibir Variable en el DAO 6: " + alumno.getFormaDePago());
			System.out.println("Prueba de recibir Variable en el DAO 7: " + alumno.getSexo());
			//System.out.println("Prueba de recibir Variable en el DAO 7: " + alumno.getEdad());
			System.out.println("Prueba de recibir Variable en el DAO 8: " + alumno.getFechaNacimiento());
			System.out.println("Prueba de recibir Variable en el DAO 9: " + alumno.getTelefono());
			System.out.println("Prueba de recibir Variable en el DAO 10: " + alumno.getCalle());
			System.out.println("Prueba de recibir Variable en el DAO 11: " + alumno.getCodigoPostal());
			System.out.println("Prueba de recibir Variable en el DAO 12: " + alumno.getColonia());
			System.out.println("Prueba de recibir Variable en el DAO 13: " + alumno.getEstado());
			System.out.println("Prueba de recibir variable en el DAO 14: " + alumno.getDelegacion());
			System.out.println("Prueba de recibir Variable en el DAO 15: " + alumno.getOcupacion());
			System.out.println("Prueba de recibir Variable en el DAO 16: " + alumno.getNivelAcademico());
			System.out.println("Prueba de recibir Variable en el DAO 17: " + alumno.getEscuela());
			System.out.println("Prueba de recibir Variable en el DAO 18: " + alumno.getMedio());
			System.out.println("Prueba de recibir Variable en el DAO 19: " + alumno.getExpectativas());
			//System.out.println("Prueba de recibir Variable en el DAO 20: " + alumno.getRecomendacion());

			ps.setString(1, alumno.getNombre());
			ps.setString(2, alumno.getApellidoPaterno());
			ps.setString(3, alumno.getApellidoMaterno());
			ps.setString(4, alumno.getCorreoElectronico());
			ps.setString(5, alumno.getCurso());
			ps.setString(6, alumno.getFormaDePago());
			ps.setString(7, alumno.getSexo());
			//ps.setInt(7, Integer.parseInt(alumno.getEdad()));
			ps.setString(8, alumno.getFechaNacimiento());
			ps.setString(9, alumno.getTelefono());
			ps.setString(10, alumno.getCalle());
			ps.setString(11, alumno.getCodigoPostal());
			ps.setString(12, alumno.getColonia());
			ps.setString(13, alumno.getEstado());	
			ps.setString(14, alumno.getDelegacion());
			ps.setString(15, alumno.getOcupacion());
			ps.setString(16, alumno.getNivelAcademico());
			ps.setString(17, alumno.getEscuela());
			ps.setString(18, alumno.getMedio());
			ps.setString(19, alumno.getExpectativas());
			//ps.setString(20, alumno.getRecomendacion());

			/*
			 * prepareStatemente.setString(1,
			 * request.getParameter("txtNombre"));
			 * prepareStatemente.setString(2,
			 * request.getParameter("txtApellido"));
			 * prepareStatemente.setString(3, request.getParameter("txtCurp"));
			 * prepareStatemente.setString(4,
			 * request.getParameter("txtCorreoElectronico"));
			 * prepareStatemente.setString(5,
			 * request.getParameter("txtContrasenia"));
			 * prepareStatemente.setString(6,
			 * request.getParameter("dateFechaNacimiento"));
			 * prepareStatemente.setString(7, fechaRegistro);
			 * prepareStatemente.setString(8, fechaActualizacion);
			 */

			System.out.println(sqlQuery);
			ps.execute();

			returnMap.put("correcto", "Si");
			returnMap.put("mensajeGeneral", "Registro realizado correctamente<br>");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error en el Query");
			returnMap.put("correcto", "No");
			returnMap.put("mensajeGeneral", "Registro NO se realizo !!!<br>");
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (dbConteccion != null) {
				dbConteccion.close();
			}
		}
		return returnMap;
	}
}
