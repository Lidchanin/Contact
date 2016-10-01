package dao;

/**
 * Created by Lidchanin on 01.10.2016.
 */
public class ContactDAOFactory
{
    public static ContactDAO getContactDAO() {
        return new ContactSimpleDAO();
    }
}