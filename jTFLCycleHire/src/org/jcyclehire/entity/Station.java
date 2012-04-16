package org.jcyclehire.entity;

public class Station {

	/**
	 * A field to denote the unique identified for each bike station record.
	 */
	private int id;

	/**
	 * A field to denote the text description of the bike stations as displayed
	 * on the map to the bike user.
	 */
	private String name;

	/**
	 * A field to denote the name associated with the physical terminal which
	 * corresponds to the logical terminal name.
	 */
	private String terminalName;

	/**
	 * A field to denote the latitude of the location of the bike station.
	 */
	private double latitude;

	/**
	 * A field to denote the longitude of the location of the bike station.
	 */
	private double longitude;

	/**
	 * A field to denote the text description specifying whether the bike
	 * station is available for usage.
	 */
	private boolean installed;

	/**
	 * A field to denote the text description specifying whether the bike
	 * station is currently locked or not.
	 */
	private boolean locked;

	private String installDate;

	private String removalDate;

	private boolean temporary;

	private int nbBikes;

	private int nbEmptyDocks;

	private int nbDocks;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the terminalName
	 */
	public String getTerminalName() {
		return terminalName;
	}

	/**
	 * @param terminalName
	 *            the terminalName to set
	 */
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the installed
	 */
	public boolean isInstalled() {
		return installed;
	}

	/**
	 * @param installed
	 *            the installed to set
	 */
	public void setInstalled(boolean installed) {
		this.installed = installed;
	}

	/**
	 * @return the locked
	 */
	public boolean isLocked() {
		return locked;
	}

	/**
	 * @param locked
	 *            the locked to set
	 */
	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	/**
	 * @return the installDate
	 */
	public String getInstallDate() {
		return installDate;
	}

	/**
	 * @param installDate
	 *            the installDate to set
	 */
	public void setInstallDate(String installDate) {
		this.installDate = installDate;
	}

	/**
	 * @return the removalDate
	 */
	public String getRemovalDate() {
		return removalDate;
	}

	/**
	 * @param removalDate
	 *            the removalDate to set
	 */
	public void setRemovalDate(String removalDate) {
		this.removalDate = removalDate;
	}

	/**
	 * @return the temporary
	 */
	public boolean isTemporary() {
		return temporary;
	}

	/**
	 * @param temporary
	 *            the temporary to set
	 */
	public void setTemporary(boolean temporary) {
		this.temporary = temporary;
	}

	/**
	 * @return the nbBikes
	 */
	public int getNbBikes() {
		return nbBikes;
	}

	/**
	 * @param nbBikes
	 *            the nbBikes to set
	 */
	public void setNbBikes(int nbBikes) {
		this.nbBikes = nbBikes;
	}

	/**
	 * @return the nbEmptyDocks
	 */
	public int getNbEmptyDocks() {
		return nbEmptyDocks;
	}

	/**
	 * @param nbEmptyDocks
	 *            the nbEmptyDocks to set
	 */
	public void setNbEmptyDocks(int nbEmptyDocks) {
		this.nbEmptyDocks = nbEmptyDocks;
	}

	/**
	 * @return the nbDocks
	 */
	public int getNbDocks() {
		return nbDocks;
	}

	/**
	 * @param nbDocks
	 *            the nbDocks to set
	 */
	public void setNbDocks(int nbDocks) {
		this.nbDocks = nbDocks;
	}

}
