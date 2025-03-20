// 数据库日志记录器
public class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Database Logger: " + message);
    }
}