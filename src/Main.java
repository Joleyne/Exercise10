// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact("Yulie", "yullie@gmail.com");

        Collect contacts = new Collect();
        contacts.addContact(contact1);

        for(Contact a: contacts){
            System.out.println(a);
        }
    }
}