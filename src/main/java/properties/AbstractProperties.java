package properties;

import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;

import java.util.ResourceBundle;

/**
 * Абстрактный класс для работы с параметрами
 *
 * @author Andrey Savelev
 */
@Slf4j
public abstract class AbstractProperties {
    private final ResourceBundle properties;

    public AbstractProperties(String properties) {
        this.properties = ResourceBundle.getBundle(properties);
    }

    /**
     * Получить настройку
     *
     * @param key ключ настройки
     * @return значение настройки
     */
    public String getProperty(String key) {
        String property = System.getenv(key.replace(',', '_'));

        if (Strings.isNullOrEmpty(property)) {
            try {
                return properties.getString(key);
            } catch (Exception e) {
                log.warn("В файле {}.properties отсутствует пропертя {}", properties.getBaseBundleName(), key);
                return null;
            }
        }
        return property;
    }
}
