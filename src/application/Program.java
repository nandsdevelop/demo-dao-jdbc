package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.dao.impl.SellerDAOjdbc;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

import static model.dao.DAOFactory.createSellerDAO;

public class Program {
    public static void main(String[] args) {

        SellerDAO SellerDAO = DAOFactory.createSellerDAO();

        System.out.println("--- TEST 1: Seller findById ---");

        Seller seller = SellerDAO.findById(5);

        System.out.println(seller);
    }
}
