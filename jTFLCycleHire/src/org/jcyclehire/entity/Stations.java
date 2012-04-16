package org.jcyclehire.entity;

import java.util.List;

public class Stations {

	/**
	 * A field to denote the date at which the feed was last updated.
	 */
	private String lastUpdate;

	/**
	 * A list of docking stations
	 */
	private List<Station> stationList;

	/**
	 * A field to denote the field which denotes the xml version.
	 */
	private String version;

	/**
	 * @return the lastUpdate
	 */
	public String getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return the stationList
	 */
	public List<Station> getStationList() {
		return stationList;
	}

	/**
	 * @param stationList the stationList to set
	 */
	public void setStationList(List<Station> stationList) {
		this.stationList = stationList;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
	
}
