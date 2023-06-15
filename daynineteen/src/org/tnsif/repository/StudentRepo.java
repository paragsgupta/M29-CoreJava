//program to demonstrate CRUD operation
package org.tnsif.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.tnsif.entities.Student;

public interface StudentRepo {
	/*Statement Class because it responcible for executing sql*/
	
	Statement makeStatement();
	PreparedStatement createPrepareStatement(String query);
	//CRUD Operations
	public int addQuery(String query, Student student);
	public int updateQuery(String query, Student student);
	public int deleteQuery(String query);
	public ResultSet retriveQuery(String query);

	
}
