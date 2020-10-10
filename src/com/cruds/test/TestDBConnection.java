package com.cruds.test;

import static org.junit.Assert.*;

import java.net.ConnectException;
import java.sql.Connection;

import org.junit.Test;

import com.cruds.db.DBConnectionManager;

public class TestDBConnection {

	@Test
	public void test() {
		Connection con=DBConnectionManager.getConnection();
		assertNotNull(con);
	}

}
