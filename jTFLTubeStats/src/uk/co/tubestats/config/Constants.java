package uk.co.tubestats.config;

/**
 * Class description
 *
 *
 * @version        Enter version here..., 11/05/20
 * @author         Enter your name here...    
 */
public class Constants {

    /**
     * A constant field to denote the base API url.
     */
    public static final String BASE_API_URL =
        "http://cloud.tfl.gov.uk/TrackerNet";

    /**
     * A constant field to denote the base API url for the line status.
     */
    public static final String LINE_STATUS = "/LineStatus";

    /**
     * A constant field to denote the base API url for the line status with
     * incidents only.
     */
    public static final String LINE_STATUS_INCIDENT =
        "/LineStatus/IncidentsOnly";

    /**
     * A constant field to denote the base API url for the station status.
     */
    public static final String STATION_STATUS = "/StationStatus";

    /**
     * A constant field to denote the base API url for the station status with
     * incidents only.
     */
    public static final String STATION_STATUS_INCIDENT =
        "/StationStatus/IncidentsOnly";

    /**
     * A constant field to denote the value of '/' .
     */
    public static final String URL_DELIM = "/";
}
