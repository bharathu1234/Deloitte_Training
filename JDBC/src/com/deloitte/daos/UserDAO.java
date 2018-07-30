package com.deloitte.daos;

import com.deloitte.pattern.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.deloitte.entities.User;

public class UserDAO implements Dao<User> {

	@Override
	public User get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			//Load or register a jdbc driver
			//Establish a connection
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			connection = DriverManager.getConnection("jdbc:oracle:thin:@desktop-m03s522:1522:teamdb", "bharath", "bart123");
			
			ps = connection.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?)");
			ps.setInt(1, user.getId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getPasswd());
			ps.setString(6, user.getStatus());
			
			ps.executeUpdate();
			
			//ps.close();
			//connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(ps != null && !ps.isClosed()) {
					ps.close();
				}
				if(connection!=null && !connection.isClosed()) {
				connection.close();
				}
			}
				catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void update(User t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User t) {
		// TODO Auto-generated method stub
		
	}

}
