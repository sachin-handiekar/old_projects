#jCycleHire

A Java wrapper for the [Barclays Cycle Hire / TFL Cycle Hire](http://www.tfl.gov.uk/roadusers/cycling/14808.aspx)

##How to use ?
 
* Declare an instance of CycleHire

```java
CycleHire cycleHire = new CycleHire();
Stations stations = cycleHire.getStations();
```

* Get last update time	     

```java
System.out.println("lastUpdate : " + stations.getLastUpdate());
System.out.println("version : "    + stations.getVersion());
```

* Get all the docking station

```java	 
List<Station> stationsList = stations.getStationList();        

for (Station station : stationsList) {
   System.out.println("id            : " + station.getId());
   System.out.println("name          : " + station.getName());
   System.out.println("terminal-name : " + station.getTerminalName());
   System.out.println("latitude      : " + station.getLatitude());
   System.out.println("longitude     : " + station.getLongitude());
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
```		
 
##Dependencies

* jDOM (http://www.jdom.org/)


##About me

* [LinkedIn](http://uk.linkedin.com/in/sachinhandiekar)
* Email   : sachin.handiekar at gmail.com / sach21 at gmail.com
* Twitter : [@sachinhandiekar](http://twitter.com/sachinhandiekar)
