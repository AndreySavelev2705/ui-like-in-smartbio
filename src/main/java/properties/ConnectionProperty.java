package properties;

import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

/**
 * Константы из файла настройки подключений connections.properties
 *
 * @author Andrey Savelev
 */
@UtilityClass
@FieldDefaults(makeFinal = true)
public class ConnectionProperty {
    public ConnectionsProperties properties = ConnectionsProperties.getInstance();

    /**
     * Путь к основному исполняемому файлу браузера.
     */
    public String BROWSER_PATH = properties.getProperty("browser.path");

    /**
     * Путь до веб-драйвера для автоматизации браузера
     */
    public String WEBDRIVER_PATH = properties.getProperty("webdriver.path");

    /**
     * Ссылка на сайт
     */
    public String SITE_URL = properties.getProperty("site.url");

    /**
     * Размер окна браузера
     */
    public String BROWSER_WINDOW_SIZE = properties.getProperty("browser.window.size");
}
