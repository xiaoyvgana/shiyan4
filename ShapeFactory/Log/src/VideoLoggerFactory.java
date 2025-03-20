public class VideoLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new VideoLogger();
    }
}
