package application;

import java.sql.SQLException;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws SQLException {
	SellerDao sellerDao = DaoFactory.createSellerDao();;

	Seller newSelleer = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, new Department(2, null));
	sellerDao.insert(newSelleer);
	}

}
