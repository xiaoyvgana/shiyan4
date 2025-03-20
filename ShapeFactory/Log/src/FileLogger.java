// 文件日志记录器
public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("File Logger: " + message);
    }
}



