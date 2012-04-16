#jTubeStats

A Java wrapper for the [TFL Tube Updates](http://tfl.gov.uk)

##How to use ?
 
* Declare an instance of TubeStats

```java
TubeStatus tubeStatus = new TubeStatus();
```

* Get the list of LineStatus    

```java
List<LineStatus> list = tubeStatus.getLineStatus();    	 

for (LineStatus status : list) {
   System.out.println("Name   : " + status.getLineName());
   System.out.println("Status : " + status.getStatusLineDescription());
   System.out.println();
}
```

* Get the list of StationStatus    

```java
List<StationStatus> listN = tubeStatus.getStationStatus();

for (StationStatus station : listN) {
   System.out.println("Name   : " + station.getStationName());
   System.out.println("Status : " + station.getStatusDescription());
   System.out.println();
}
```      
 
##Dependencies

* jDOM (http://www.jdom.org/)

##About me

* [LinkedIn](http://uk.linkedin.com/in/sachinhandiekar)
* Email   : sachin.handiekar at gmail.com / sach21 at gmail.com
* Twitter : [@sachinhandiekar](http://twitter.com/sachinhandiekar)
