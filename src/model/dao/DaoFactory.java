package model.dao;

import db.DB;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection()); //serve como fabrica do DAO, ele vai utilizar a interface para instanciar um SellerDaoJDBC.
    }


}
