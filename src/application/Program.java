package application;

import java.sql.SQLException;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		try {
			SellerDao sellerDao = DaoFactory.createSellerDao();
			//Seller seller = sellerDao.findById(3);
			Department department = new Department(2, null);
			List<Seller> list = sellerDao.findByDepartment(department);
			for(Seller obj : list) {
				System.out.println(obj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
