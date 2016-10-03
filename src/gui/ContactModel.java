package gui;

import entity.Contact;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * Created by Lidchanin on 03.10.2016.
 */
public class ContactModel extends AbstractTableModel
{
    private static final String[] headers = {"ID", "Имя", "Фамилия", "Email", "Телефон"};
    private final List<Contact> contacts;

    public ContactModel(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public int getRowCount() {
        return contacts.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int col) {
        return headers[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        Contact contact = contacts.get(row);
        switch (col) {
            case 0:
                return contact.getContactId().toString();
            case 1:
                return contact.getFirstName();
            case 2:
                return contact.getLastName();
            case 3:
                return contact.getEmail();
            default:
                return contact.getPhone();
        }
    }
}