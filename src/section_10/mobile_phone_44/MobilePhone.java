package section_10.mobile_phone_44;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){

        if(queryContact(contact.getName()) == null){
            myContacts.add(contact);
            return true;
        }
        /*
        if(myContacts.indexOf(contact) == -1){
            myContacts.add(contact);
            return true;
        }*/

        //if(myContacts.contains(contact)) return false;
        //myContacts.add(contact);
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        //int oldIndex = myContacts.indexOf(oldContact);
        int oldIndex = findContact(oldContact);
        if(oldIndex != -1){
            myContacts.set(oldIndex, newContact);
            return true;
        }else{
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact){
        int position = myContacts.indexOf(contact);
        return position;
    }

    private int findContact(String name){
        int position = 0;
        for(Contact contact: myContacts){
            if((contact.getName()).equals(name)){
                return position;
            }
            position++;
        }
        return -1;
    }

    public Contact queryContact(String name){
        int index = findContact(name);
        if(index != -1){
            return  myContacts.get(index);
        }
        /*
        for(Contact contact: myContacts){
            if((contact.getName()).equals(name)){
                return contact;
            }
        }*/
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");

        int count = 1;
        for(Contact contact: myContacts){
            System.out.println(count + ". "+contact.getName()+" -> "+contact.getPhoneNumber());
            count++;
        }
    }



}
