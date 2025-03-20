public class VideoLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Video Logger: " + message);
    }
}
