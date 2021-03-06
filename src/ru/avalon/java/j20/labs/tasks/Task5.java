package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Задание №5
 *
 * <p>
 * Тема: "Потоковый ввод-вывод. Чтение локализованных ресурсов".
 */
public class Task5 implements Task {
// dencode.com -> Unnicode Escape - получение кода строки, слова
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
       String path = "resources.strings.titles";
       Locale locale = Locale.ENGLISH;

       ResourceBundle rB1 = read(path);
       ResourceBundle rB2 = read(path, locale);
       
      String s1 = rB1.getString("menu.edit");
      String s2 = rB2.getString("menu.edit");
      
      System.out.println(s1.toString());
      System.out.println(s2.toString());
            
      
        if ( s1 == null ? s2 == null : s1.equals(s2)) {
            System.out.println("Country true");
        } else {
            System.out.println("Country false");
        }
        /*
         * TODO(Студент): Выполнить задание №5
         *
         * 1. Реализовать метод read.
         *
         * 2. Прочитать ресурсы с использованием локализации по умолчанию.
         *
         * 3. Прочитать ресурсы с использованием локализации, отличной от той,
         *    которая задана по умолчанию.
         *
         * 4. С использованием отладчика сравнить полученные ресурсы и
         *    проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение локализованных ресурсов с использованием локализации по
     * умолчанию.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path) {
        ResourceBundle mybundle = ResourceBundle.getBundle(path);

        return mybundle;
    }

    /**
     * Выполняет чтение локализованных ресурсов.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path, Locale locale) {
        /**
         * ResourceBundle.ControlКласс предоставляет информацию , необходимую
         * для выполнения пучка процесса загрузки с помощью getBundle фабричных
         * методов , которые принимают ResourceBundle.Control экземпляр. Вы
         * можете реализовать свой собственный подкласс, чтобы включить
         * нестандартные форматы пакетов ресурсов, изменить стратегию поиска или
         * определить параметры кэширования. Обратитесь к описанию класса и
         * getBundle фабричного метода для деталей.
         */
        ResourceBundle mybundle1 = ResourceBundle.getBundle(path, locale);

        return mybundle1;
    }
}
