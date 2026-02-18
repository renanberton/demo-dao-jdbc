package model.dao;

import java.sql.SQLException;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	public static SellerDao createSellerDao() throws SQLException {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
