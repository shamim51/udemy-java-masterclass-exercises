package section_10.mobile_phone_44;

public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("01317377525");

        myPhone.addNewContact(new Contact("Akash", "1001"));
        myPhone.addNewContact(new Contact("Arif", "1002"));
        myPhone.addNewContact(new Contact("Rony", "1003"));
        myPhone.addNewContact(new Contact("Ashfaq", "1004"));
        myPhone.addNewContact(new Contact("Tahsin", "1005"));
        Contact.createContact("bob", "0133iui43iu34");

        myPhone.printContacts();

        //updating ashfaq with hridoy
        myPhone.updateContact(myPhone.queryContact("Ashfaq"), new Contact("Hridoy", "1006"));

        myPhone.printContacts();

        //trying to add duplicate contact
        System.out.println(myPhone.addNewContact(myPhone.queryContact("Rony")));

        myPhone.printContacts();

    }
}
