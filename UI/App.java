package UI;

import java.util.Scanner;

import CoreData.Constant.ExternalContactsCSV;
import CoreData.Constant.ExternalData;
import CoreData.MVP.Model;
import CoreData.MVP.Presenter;
import CoreData.MVP.View;
import CoreData.Models.PhoneBook;
import CoreData.Models.PhoneBookMap;

public class App {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBookMap();
        ExternalData db = new ExternalContactsCSV(phoneBook, "db.csv");
        Model model = new Model(phoneBook, db);
        View view = new ConsoleUI(scan);
        Presenter presenter = new Presenter(model, view);

        presenter.load();
        presenter.mainMenu();
        presenter.save();

        scan.close();
    }
}