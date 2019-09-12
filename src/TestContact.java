import java.util.Arrays;

public class TestContact {
    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.addContact("Do","Trang Hoang", "0964785596");
        contact.addContact("Nguyen","Van Toan", "0955766596");
        contact.addContact("Do","Trung Thanh", "0954125596");

//        contact.remove("0954125596");
//        contact.setFirstName(1, "Do");
//        contact.setLastName(1,"ASDAS");
        contact.setNumberPhone(1,"0123456789");
        contact.searchPhoneNumber("0964785596");

    }
}
