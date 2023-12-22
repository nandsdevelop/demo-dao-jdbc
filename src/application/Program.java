package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.dao.impl.SellerDAOjdbc;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        SellerDAO SellerDAO = DAOFactory.createSellerDAO();

        Seller seller = SellerDAO.findById(3);

        System.out.println(seller);
    }
}
