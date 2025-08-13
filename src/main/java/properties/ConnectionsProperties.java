package properties;

/**
 * Утилитарный класс для работы с настройками подключений
 *
 * @author Andrey Savelev
 */
public final class ConnectionsProperties extends AbstractProperties {
    private static ConnectionsProperties instance;

    private ConnectionsProperties() {
        super("connections");
    }

    public static ConnectionsProperties getInstance() {
        if (instance == null) {
            instance = new ConnectionsProperties();
        }
        return instance;
    }
}
