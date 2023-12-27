package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        SellerDAO SellerDAO = DAOFactory.SellerDAO();

        System.out.println("--- TEST 1: Seller findById ---");
        System.out.println();


        Seller seller = SellerDAO.findById(3);

        System.out.println(seller);

        System.out.println();
        System.out.println("--- SKIPPING 1 LINE... ---");
        System.out.println();


        System.out.println("--- TEST 2: Seller findByDepartment ---");
        System.out.println();


        Department department = new Department(2, null);

        List<Seller> list = SellerDAO.findByDepartment(department);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("--- SKIPPING 1 LINE... ---");
        System.out.println();

        System.out.println("--- TEST 3: Seller findAll ---");
        System.out.println();


        list = SellerDAO.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println();
        System.out.println("--- SKIPPING 1 LINE... ---");
        System.out.println();

        System.out.println("--- TEST 4: Seller insert ---");
        System.out.println();

        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        SellerDAO.insert(newSeller);
        System.out.println("Inserted! ID = " + newSeller.getId());

    }
}
