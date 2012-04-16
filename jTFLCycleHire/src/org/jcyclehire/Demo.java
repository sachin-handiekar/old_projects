package org.jcyclehire;

import org.jcyclehire.entity.Station;
import org.jcyclehire.entity.Stations;

import java.util.List;

public class Demo {
    public static void main(String[] args) throws CycleHireException {
        CycleHire cycleHire = new CycleHire();
        Stations stations = cycleHire.getStations();
        List<Station> stationsList = stations.getStationList();

        System.out.println("lastUpdate : " + stations.getLastUpdate());
        System.out.println("version : " + stations.getVersion());

        for (Station station : stationsList) {
            System.out.println("id            : " + station.getId());
            System.out.println("name          : " + station.getName());
            System.out.println("terminal-name : " + station.getTerminalName());
            System.out.println("latitude      : " + station.getLatitude());
            System.out.println("iongitude     : " + station.getLongitude());
            System.out.println("installed     : " + station.getInstallDate());
            System.out.println("locked        : " + station.isLocked());
            System.out.println("installDate   : " + station.getInstallDate());
            System.out.println("removalDate   : " + station.getRemovalDate());
            System.out.println("temporary     : " + station.isTemporary());
            System.out.println("nbBikes       : " + station.getNbBikes());
            System.out.println("nbEmptyDocks  : " + station.getNbEmptyDocks());
            System.out.println("nbDocks       : " + station.getNbDocks());
            System.out.println();
        }
    }
}
