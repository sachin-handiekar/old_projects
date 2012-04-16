package uk.co.tubestats.entity;

/**
 * This service will return the status of all stations on the network indicating
 * station closures, faulty lifts etc. The service can optionally be run to only
 * return stations where the status is not normal. The service will return the
 * station names and the current status of the station indicating what the
 * problem is in the form of a code and a description.
 */
public class StationStatus {

	private int stationStatusId;

	private String statusDetails;

	private int stationId;

	private String stationName;

	private String statusId;

	private String cssClass;

	private String statusDescription;

	private boolean active;

	private int statusTypeId;

	private String statusTypeDescription;

	/**
	 * @return the stationStatusId
	 */
	public int getStationStatusId() {
		return stationStatusId;
	}

	/**
	 * @param stationStatusId
	 *            the stationStatusId to set
	 */
	public void setStationStatusId(int stationStatusId) {
		this.stationStatusId = stationStatusId;
	}

	/**
	 * @return the statusDetails
	 */
	public String getStatusDetails() {
		return statusDetails;
	}

	/**
	 * @param statusDetails
	 *            the statusDetails to set
	 */
	public void setStatusDetails(String statusDetails) {
		this.statusDetails = statusDetails;
	}

	/**
	 * @return the stationId
	 */
	public int getStationId() {
		return stationId;
	}

	/**
	 * @param stationId
	 *            the stationId to set
	 */
	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	/**
	 * @return the stationName
	 */
	public String getStationName() {
		return stationName;
	}

	/**
	 * @param stationName
	 *            the stationName to set
	 */
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	 

	/**
	 * @return the cssClass
	 */
	public String getCssClass() {
		return cssClass;
	}

	/**
	 * @param cssClass
	 *            the cssClass to set
	 */
	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

	/**
	 * @return the statusDescription
	 */
	public String getStatusDescription() {
		return statusDescription;
	}

	/**
	 * @param statusDescription
	 *            the statusDescription to set
	 */
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the statusTypeId
	 */
	public int getStatusTypeId() {
		return statusTypeId;
	}

	/**
	 * @param statusTypeId
	 *            the statusTypeId to set
	 */
	public void setStatusTypeId(int statusTypeId) {
		this.statusTypeId = statusTypeId;
	}

	/**
	 * @return the statusTypeDescription
	 */
	public String getStatusTypeDescription() {
		return statusTypeDescription;
	}

	/**
	 * @param statusTypeDescription
	 *            the statusTypeDescription to set
	 */
	public void setStatusTypeDescription(String statusTypeDescription) {
		this.statusTypeDescription = statusTypeDescription;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getStatusId() {
		return statusId;
	}

}
