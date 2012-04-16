package org.jcyclehire;

import org.jcyclehire.entity.Station;
import org.jcyclehire.entity.Stations;
import org.jcyclehire.http.CycleHireHttpRequest;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CycleHire {
    public Stations getStations() throws CycleHireException {
        Stations stations = null;
      
        String xml = CycleHireHttpRequest.sendRequest();

        // Remove the junk content from the xml feed.
        xml = xml.trim().replaceFirst("^([\\W]+)<", "<");

        SAXBuilder builder = new SAXBuilder();
        Document doc = null;

        try {
            doc = builder.build(
                new ByteArrayInputStream(xml.getBytes("UTF-8")));
            stations = new Stations();
            String lastUpdate = this.getEpochDate(Long.parseLong(doc.getRootElement().getAttributeValue("lastUpdate")));
            stations.setLastUpdate(lastUpdate);
            stations.setVersion(doc.getRootElement().getAttributeValue("version"));
            
            StringBuffer output = new StringBuffer();
            Iterator itr = doc.getRootElement().getChildren().iterator();
            Station station = null;
            List<Station> stationList = new ArrayList<Station>();

            while (itr.hasNext()) {
                

                Element elem = (Element) itr.next();

                station = new Station();
                

                List<Element> childs = elem.getChildren();

                for (Element child : childs) {
                    if (child.getName().equals("id")) {
                        station.setId(Integer.parseInt(child.getValue()));
                    } else if (child.getName().equals("name")) {
                        station.setName(child.getValue());
                    } else if (child.getName().equals("terminalName")) {
                        station.setTerminalName(child.getValue());
                    } else if (child.getName().equals("lat")) {
                        station.setLatitude(
                            Double.parseDouble(child.getValue()));
                    } else if (child.getName().equals("long")) {
                        station.setLongitude(
                            Double.parseDouble(child.getValue()));
                    } else if (child.getName().equals("installed")) {
                        station.setInstalled(Boolean.valueOf(child.getValue()));
                    } else if (child.getName().equals("Locked")) {
                        station.setLocked(Boolean.valueOf(child.getValue()));
                    } else if (child.getName().equals("installDate")) {
                        station.setInstallDate(child.getValue());
                    } else if (child.getName().equals("removalDate")) {
                        station.setRemovalDate(child.getValue());
                    } else if (child.getName().equals("installDate")) {
                        station.setInstallDate(child.getValue());
                    } else if (child.getName().equals("temporary")) {
                        station.setTemporary(Boolean.valueOf(child.getValue()));
                    } else if (child.getName().equals("nbBikes")) {
                        station.setNbBikes(Integer.parseInt(child.getValue()));
                    } else if (child.getName().equals("nbEmptyDocks")) {
                        station.setNbEmptyDocks(
                            Integer.parseInt(child.getValue()));
                    } else if (child.getName().equals("nbDocks")) {
                        station.setNbDocks(Integer.parseInt(child.getValue()));
                    }
                }

                stationList.add(station);
            }

            stations.setStationList(stationList);
        } catch (UnsupportedEncodingException e) {
            throw new CycleHireException(e.getMessage());
        } catch (JDOMException e) {
            throw new CycleHireException(e.getMessage());
        } catch (IOException e) {
            throw new CycleHireException(e.getMessage());
        }

        return stations;
    }

    private String getEpochDate(Long epoch) {
        String date = new java.text.SimpleDateFormat(
                          "MM/dd/yyyy HH:mm:ss").format(
                          new java.util.Date(epoch));

        return date;
    }
}
