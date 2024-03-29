public class Contact<E> {
    private Node head;
    private Node tail;
    private int index = 0;
    ;

    public Contact() {
    }

    private class Node {
        private Node next;
        private Node previous;
        private String firstName;
        private String lastName;
        private String numberPhone;

        public Node(String firstName, String lastName, String numberPhone) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.numberPhone = numberPhone;
        }

        public String getNumberPhone() {
            return this.numberPhone;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setNumberPhone(String numberPhone) {
            this.numberPhone = numberPhone;
        }
    }

    public boolean addContact(String firstName, String lastName, String numberPhone) {
        Node temp = head;
        if (head == null) {
            this.head = new Node(firstName, lastName, numberPhone);
            this.tail = this.head;
            index++;
        } else {
            for (int i = 0; temp.next != null; i++) {
                temp = temp.next;
            }
            temp.next = new Node(firstName, lastName, numberPhone);
            this.tail = temp.next;
            this.tail.previous = temp;
            index++;
        }
        return true;
    }

    public void remove(String numberPhone) {
        Node temp = head;
        Node temp2 = head;
        Node holder = tail;
        int position = 0;
        for (int i = 0; temp != null; i++) {
            if (temp.getNumberPhone() == numberPhone) {
                break;
            }
            temp = temp.next;
            position++;
        }
        if (position == 0) {
            head = temp.next;
            index--;
            return;
        }

        if (position == (index - 1)) {
            holder.previous.next = null;
            holder.previous = tail;

        } else {
            for (int i = 0; i < position - 1 && temp != null; i++) {
                temp2 = temp2.next;
            }
            if (temp == null || temp.next == null) {
                return;
            }
            Node next = temp2.next.next;
            temp2.next = next;
            temp2.next.previous = temp;
            index--;
        }
    }

    public void setFirstName(int position , String firstName) {
        Node temp = head;
        if(position < 0 || position > index  ) {
            return;
        }

        for(int i = 0 ; i < position ; i++) {
            temp = temp.next;
        }

        temp.setFirstName(firstName);

    }

    public void setLastName(int position , String lasttName) {
        Node temp = head;
        if(position < 0 || position > index  ) {
            return;
        }

        for(int i = 0 ; i < position ; i++) {
            temp = temp.next;
        }

        temp.setLastName(lasttName);

    }

    public void setNumberPhone(int position , String numberPhone) {
        Node temp = head;
        if(position < 0 || position > index  ) {
            return;
        }

        for(int i = 0 ; i < position ; i++) {
            temp = temp.next;
        }

        temp.setNumberPhone(numberPhone);

    }

    public String searchFirstName(String firstName ) {
        Node temp = head;
        String check = "";
        for(int i = 0 ; temp != null; i++ ) {
            if(temp.getFirstName() == firstName) {
                check += "Index: " + i + "\n" + "First name: " + temp.getFirstName() + "\n"
                        + "Last Name : " + temp.lastName + "\n"
                        + "Phone Number: " + temp.getNumberPhone() + "\n";
            }
            temp = temp.next;
        }
        return check;
    }

    public String searchLastName(String lastName ) {
        Node temp = head;
        String check = "";
        for(int i = 0 ; temp != null; i++ ) {
            if(temp.getLastName() == lastName) {
                check += "Index: " + i + "\n" + "First name: " + temp.getFirstName() + "\n"
                        + "Last Name : " + temp.lastName + "\n"
                        + "Phone Number: " + temp.getNumberPhone() + "\n";
            }
            temp = temp.next;
        }
        return check;
    }

    public String searchPhoneNumber(String numberPhone ) {
        Node temp = head;
        String check = "";
        for(int i = 0 ; temp != null; i++ ) {
            if(temp.getNumberPhone() == numberPhone) {
                check += "Index: " + i + "\n" + "First name: " + temp.getFirstName() + "\n"
                        + "Last Name : " + temp.lastName + "\n"
                        + "Phone Number: " + temp.getNumberPhone() + "\n";
            }
            temp = temp.next;
        }
       return check;
    }

    public String getContactList() {
            Node temp = head;
            String list = "";
            while (temp != null) {
                for (int i = 0; i < index; i++) {
                    list += "Index: " + i + "\n" + "First name: " + temp.getFirstName() + "\n"
                            + "Last Name : " + temp.lastName + "\n"
                            + "Phone Number: " + temp.getNumberPhone() + "\n";
                    temp = temp.next;
                }
        }
        return list;
    }
}