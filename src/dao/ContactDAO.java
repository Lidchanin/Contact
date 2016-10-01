package dao;

import entity.Contact;
import java.util.List;

/**
 * Created by Lidchanin on 01.10.2016.
 */
public interface ContactDAO {
    public Long addContact(Contact contact);
    public void updateContact(Contact contact);
    public void deleteContact(Long contactId);
    public Contact getContact(Long contactId);
    public List<Contact> findContacts();
}
