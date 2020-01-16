package mmtr.springAnnotation.dictionary;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Action implements IAction {
    Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private int ActionNumber;

    private static String actionWithDic = "\nВозможные действия:\n"+
            "1. Чтение списка пар из файла.\n"+
            "2. Удаление записи по ключу.\n"+
            "3. Поиск записи по ключу.\n"+
            "4. Добавление записей.\n"+
            "5. Выход из приложения.\n"+
            "6. Просмотр доступных действий.\n"+
            "7. Выбрать другой словарь.\n";

    public void action() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SearchDictionary searchDictionary = context.getBean("searchDictionary", SearchDictionary.class);
        searchDictionary.searchFiles();
        context.close();
    }
}
