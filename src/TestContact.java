import java.util.Arrays;

public class TestContact {
    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.addContact("Do","Trang Hoang", "1");
        contact.addContact("Nguyen","Van Toan", "2");
        contact.addContact("Do","Trung Thanh", "3");
        contact.addContact("Do","Van A", "4");
        contact.addContact("Do","Thi Hoa", "5");
        contact.addContact("Bui","Trung Thanh", "6");
        contact.addContact("Truong","Trung Thanh", "7");
        contact.addContact("Do","Trung La", "8");
        contact.addContact("Do","Tuan Thanh", "9");
        contact.addContact("Duong","Trung Thanh", "10");
        contact.addContact("Truong","Trung Thanh", "11");
        contact.addContact("Do","Trung Quan", "12");
        contact.addContact("Do","Van Thanh", "13");

        contact.remove("6");
//        contact.setFirstName(1, "Do");
//        contact.setLastName(1,"ASDAS");
//        contact.setNumberPhone(1,"0123456789");
//        contact.searchPhoneNumber("0964785596");
        contact.getContactList();

    }
}
