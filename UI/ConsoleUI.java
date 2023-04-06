package UI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import CoreData.MVP.View;
import CoreData.Models.Contact;


public class ConsoleUI implements View {
    private Scanner input;

    public ConsoleUI(Scanner input) {
        this.input = input;
    }

    @Override
    public void welcome() {
        System.out.print(Msg.welcomeMsg);
    }

    @Override
    public void bye() {
        System.out.println(Msg.byeMsg);
    }

    @Override
    public void showMainMenu() {
        System.out.println(Msg.chooseActionsMsg);
        for (int i = 1; i < Msg.mainMenuEntries.size(); i++) {
            System.out.printf("%d - %s\n", i, Msg.mainMenuEntries.get(i));
        }
        System.out.printf("%d - %s\n", 0, Msg.mainMenuEntries.get(0));
    }

    @Override
    public int getCmd() {
        return this.getInt(Msg.getCommandMsg);
    }

    @Override
    public void invalidCmd() {
        System.out.println(Msg.invalidCmdMsg);
    }

    @Override
    public void showChosenCmd(int cmd) {
        System.out.printf("\n%s\n", Msg.mainMenuEntriesMsg.get(cmd));
    }

    @Override
    public String[] addContactMenu() {
        String name = getString(Msg.getNameMsg);
        String emailStr = getString(Msg.getEmailMsg);
        String phoneNumberStr = getString(Msg.getPhoneNumberMsg);
        return new String[] { name, emailStr, phoneNumberStr };
    }

    @Override
    public String[] editContactMenu(Collection<Contact> contacts) {
        showAllContacts(contacts);
        System.out.println(Msg.editContactMsg);
        String name = getString(Msg.getNameMsg);
        String emailStr = getString(Msg.getEmailMsg);
        String phoneNumberStr = getString(Msg.getPhoneNumberMsg);
        return new String[] { name, emailStr, phoneNumberStr };
    }

    @Override
    public String removeContactMenu(Collection<Contact> contacts) {
        showAllContacts(contacts);
        String name = getString(Msg.getNameMsg);
        return name;
    }

    @Override
    public void showContact(Contact contact) {
        System.out.printf("%s - %s\n", Msg.ContactFoundMsg, contact);
    }

    @Override
    public void showAllContacts(Collection<Contact> contacts) {
        System.out.println(Msg.showAllContactsMsg);
        List<Contact> listContacts = new ArrayList<>(contacts);
        Collections.sort(listContacts);
        for (Contact contact : listContacts) {
            System.out.println(contact);
        }
    }

    @Override
    public void invalidEmail() {
        System.out.println(Msg.invalidEmailMsg);
    }

    @Override
    public void invalidPhoneNumber() {
        System.out.println(Msg.invalidPhoneNumberMsg);
    }

    @Override
    public void noContactFound() {
        System.out.println(Msg.noContactFoundMsg);
    }

    @Override
    public void sucessAddContact() {
        System.out.println(Msg.successAddMsg);
    }

    @Override
    public void sucessEditContact() {
        System.out.println(Msg.successAddMsg);
    }

    @Override
    public void sucessRemovedContact() {
        System.out.println(Msg.successRemovedMsg);
    }

    @Override
    public boolean askAddNewContact() {
        return this.getBoolean(Msg.askAddContactMsg);
    }    

    @Override
    public String getSearchString() {
        return this.getString(Msg.getSearchStrMsg);
    }

    @Override
    public boolean removeContactAccept(Contact contact) {
        System.out.printf("%s %s", Msg.removeContacMsg, contact);
        return getBoolean(Msg.askRemoveContactMsg);
    }

    private String getString(String msg) {
        System.out.print(msg);
        return this.input.next();
    }

    private int getInt(String msg) {
        while (true) {
            System.out.print(msg);
            if (this.input.hasNextInt()) {
                return this.input.nextInt();
            }
            System.out.println(Msg.notDigitMsg);
            this.input.next();
        }
    }

    private boolean getBoolean(String msg) {
        System.out.print(msg);
        if (this.input.next().toLowerCase().equals("y")) {
            return true;
        }
        return false;
    }
}
