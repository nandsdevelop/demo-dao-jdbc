package model.dao;

import db.DB;
import model.dao.impl.SellerDAOjdbc;

public class DAOFactory {
    public static SellerDAO SellerDAO() {
       return new SellerDAOjdbc(DB.getConnection());
    }
}
