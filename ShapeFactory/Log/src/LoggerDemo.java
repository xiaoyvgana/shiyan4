import java.util.Scanner;

public class LoggerDemo {
    public static void main(String[] args) {
        // 获取用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择日志记录方式（输入 'file' 或 'database' 或 ‘video’）：");
        String type = scanner.nextLine();

        // 根据用户选择获取工厂
        LoggerFactory loggerFactory = getLoggerFactory(type);

        // 创建日志记录器
        Logger logger = loggerFactory.createLogger();

        // 记录日志
        logger.log("This is a log.");
    }

    // 根据用户选择返回具体的工厂
    public static LoggerFactory getLoggerFactory(String type) {
        if (type.equalsIgnoreCase("file")) {
            return new FileLoggerFactory();
        } else if (type.equalsIgnoreCase("database")) {
            return new DatabaseLoggerFactory();
        } else if (type.equalsIgnoreCase("video")) {
            return new VideoLoggerFactory();
        } else {
            throw new IllegalArgumentException("Unsupported logger type: " + type);
        }
    }
}
