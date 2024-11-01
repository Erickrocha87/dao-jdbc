package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(); //serve como fabrica do DAO, ele vai utilizar a interface para instanciar um SellerDaoJDBC.
    }
}
