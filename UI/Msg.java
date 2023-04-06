package UI;
import java.util.Map;
import static java.util.Map.entry;

public class Msg {
    static final String welcomeMsg = "Приветствуем в программе 'Телефонный справочник'!\n";
    static final String byeMsg = "\nПока!";

    static final String chooseActionsMsg = "Выберите действие: ";
    static final String invalidCmdMsg = "Неверная команда, попробуйте еще раз";

    static final String getCommandMsg = "Введите команду: ";
    static final String getNameMsg = "Введите имя: ";
    static final String getEmailMsg = "Введите email: ";
    static final String getPhoneNumberMsg = "Введите номер телефона: ";
    static final String invalidEmailMsg = "Неверный email ";
    static final String invalidPhoneNumberMsg = "Неверный номер телефона ";
    static final String successAddMsg = "Контакт  добавлен в телефонную книгу";
    static final String successEditMsg = "Контакт изменен в телефонной книге";
    static final String successRemovedMsg = "Контакт успешно удален из телефонной книги";
    static final String ContactFoundMsg = "Контакт найден";
    static final String noContactFoundMsg = "Контакт не найден";

    static final String showAllContactsMsg = "Следующие контакты были найдены в телефонной книге:";
    static final String editContactMsg = "Для редактирования контакта заполните следующие поля:";
    static final String askAddContactMsg = "Контакты с таким именем не найдены. Добавить новый (y/n): ";

    static final String getSearchStrMsg = "Введите имя для поиска контакта: ";
    static final String notDigitMsg = "Это не цифра, введите еще раз!";
    static final String removeContacMsg = "Следующий контакт будет удален:";
    static final String askRemoveContactMsg = "Вы уверены? (y/n): ";

    static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
            entry(1, "Добавить новый контакт"),
            entry(2, "Изменить существующий контакт в коллекции"),
            entry(3, "Удалить контакт из коллекции"),
            entry(4, "Показать все контакты"),
            entry(5, "Показать информацию о контакте"),
            entry(0, "Выйти из программы"));

    static final Map<Integer, String> mainMenuEntriesMsg = Map.ofEntries(
            entry(1, "Вы решили добавить контакт."),
            entry(2, "Вы решили изменить контакт."),
            entry(3, "Вы решили удалить контакт."),
            entry(4, "Вы выбрали печать всей контактной информации:"),
            entry(5, "Вы выбрали печать подробной контактной информации."),
            entry(0, "Пока!"));
}