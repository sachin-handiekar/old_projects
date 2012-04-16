package uk.co.tubestats;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import uk.co.tubestats.config.Constants;
import uk.co.tubestats.entity.LineStatus;
import uk.co.tubestats.entity.StationStatus;
import uk.co.tubestats.http.TubeStatsRequest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TubeStatus {
    public List<LineStatus> getLineStatus() throws TubeStatsException {
        List<LineStatus> list = new ArrayList<LineStatus>();
        String apiCall = Constants.LINE_STATUS;
        String xml = TubeStatsRequest.sendRequest(apiCall);

        // Remove the junk content from the xml feed.
        xml = xml.trim().replaceFirst("^([\\W]+)<", "<");

        SAXBuilder builder = new SAXBuilder();
        Document doc = null;

        try {
            doc = builder.build(
                new ByteArrayInputStream(xml.getBytes("utf-8")));

            StringBuffer output = new StringBuffer();
            Iterator itr = doc.getRootElement().getChildren().iterator();
            LineStatus lineStatus;

            while (itr.hasNext()) {
                lineStatus = new LineStatus();

                Element elem = (Element) itr.next();
                List<Element> childs = elem.getChildren();

                for (Element child : childs) {
                    if (child.getName().equals("BranchDisruptions")) {}
                    else if (child.getName().equals("Line")) {
                        lineStatus.setLineID(
                            Integer.parseInt(child.getAttributeValue("ID")));
                        lineStatus.setLineName(child.getAttributeValue("Name"));
                    } else if (child.getName().equals("Status")) {
                        lineStatus.setStatusID(child.getAttributeValue("ID"));
                        lineStatus.setCssClass(
                            child.getAttributeValue("CssClass"));
                        lineStatus.setStatusLineDescription(
                            child.getAttributeValue("Description"));
                        lineStatus.setLineStatusActive(
                            Boolean.valueOf(
                                child.getAttributeValue("IsActive")));
                    }
                }

                list.add(lineStatus);
            }
        } catch (UnsupportedEncodingException e) {
            throw new TubeStatsException(e.getMessage());
        } catch (JDOMException e) {
            throw new TubeStatsException(e.getMessage());
        } catch (IOException e) {
            throw new TubeStatsException(e.getMessage());
        }

        return list;
    }

    public List<StationStatus> getStationStatus() throws TubeStatsException {
        List<StationStatus> list = new ArrayList<StationStatus>();
        String apiCall = Constants.STATION_STATUS;
        String xml = TubeStatsRequest.sendRequest(apiCall);

        // Remove the junk content from the xml feed.
        xml = xml.trim().replaceFirst("^([\\W]+)<", "<");

        SAXBuilder builder = new SAXBuilder();
        Document doc = null;

        try {
            doc = builder.build(
                new ByteArrayInputStream(xml.getBytes("utf-8")));

            StringBuffer output = new StringBuffer();
            Iterator itr = doc.getRootElement().getChildren().iterator();
            StationStatus stationStatus;

            while (itr.hasNext()) {
                stationStatus = new StationStatus();

                Element elem = (Element) itr.next();

                stationStatus.setStatusDetails(
                    elem.getAttributeValue("StatusDetails"));
                
                List<Element> childs = elem.getChildren();

                for (Element child : childs) {
                    if (child.getName().equals("Station")) {
                        stationStatus.setStationStatusId(
                            Integer.parseInt(child.getAttributeValue("ID")));
                        stationStatus.setStationName(
                            child.getAttributeValue("Name"));
                    } else if (child.getName().equals("Status")) {
                        stationStatus.setStatusId(
                            child.getAttributeValue("ID"));
                        stationStatus.setCssClass(
                            child.getAttributeValue("CssClass"));
                        stationStatus.setStatusDescription(
                            child.getAttributeValue("Description"));

                        List<Element> subChilds = child.getChildren();

                        for (Element subChild : subChilds) {
                            if (child.getName().equals("StatusType")) {
                                stationStatus.setStatusTypeId(
                                    Integer.parseInt(
                                        subChild.getAttributeValue("ID")));
                                stationStatus.setStatusTypeDescription(
                                    subChild.getAttributeValue("Description"));
                            }
                        }
                    }
                }

                list.add(stationStatus);
            }
        } catch (UnsupportedEncodingException e) {
            throw new TubeStatsException(e.getMessage());
        } catch (JDOMException e) {
            throw new TubeStatsException(e.getMessage());
        } catch (IOException e) {
            throw new TubeStatsException(e.getMessage());
        }

        return list;
    }
}
