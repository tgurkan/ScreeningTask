package com.example.MyTask;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.generator.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Xi = 0;
		List<Double> rnd = new ArrayList<>();//#1
		rnd = RandomGenerator.generate();
		//#2
		String url = "jdbc:h2:mem:";//Memory mode
		try (Connection con = DriverManager.getConnection(url)) {

            
        } catch (SQLException ex) {

            
        }
		
		System.out.println(Xi);//#4
		return;
	}

}
