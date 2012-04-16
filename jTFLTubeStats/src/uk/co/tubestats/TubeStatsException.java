package uk.co.tubestats;

@SuppressWarnings("serial")
public class TubeStatsException extends Exception {
    public TubeStatsException(String message) {
        super(message);
    }

    public TubeStatsException(String message, Throwable cause) {
        super(message, cause);
    }
}
