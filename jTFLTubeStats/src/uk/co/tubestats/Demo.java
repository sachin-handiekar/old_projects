package uk.co.tubestats;

import org.xml.sax.SAXException;

import uk.co.tubestats.entity.LineStatus;
import uk.co.tubestats.entity.StationStatus;

import java.io.IOException;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

public class Demo {
    public static void main(String[] args)
            throws TubeStatsException, ParserConfigurationException,
                   SAXException, IOException {

        // List of LineStatus
        List<LineStatus> list = new TubeStatus().getLineStatus();

        for (LineStatus status : list) {
            System.out.println("Line Name : " + status.getLineName());
            System.out.println("Description : "
                               + status.getStatusLineDescription());
            System.out.println();
        }

        // List of StationStatus
        List<StationStatus> listN = new TubeStatus().getStationStatus();

        for (StationStatus station : listN) {
            System.out.println("Station Name : " + station.getStationName());
            System.out.println("Station Description : "
                               + station.getStatusDescription());
            System.out.println();
        }
    }
}
