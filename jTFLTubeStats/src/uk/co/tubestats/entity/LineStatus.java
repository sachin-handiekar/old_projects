package uk.co.tubestats.entity;

/**
 * This service will return the status of all lines on the network indicating
 * any delays, disruptions or suspensions on the lines. The service can
 * optionally be run to return only lines where there are abnormal operations.
 * The service will return the line names and the current status of the line
 * indicating what the problem is in the form of a code and a description
 */
public class LineStatus {

	/**
	 * A field to denote the BranchDisruption.
	 * 
	 * Note: Not Applicable for this API release.
	 */
	private String branchDisruptions;

	/**
	 * A text code representing the general status of the line, e.g.
	 * GoodService, DisruptedService
	 */
	private String cssClass;

	/**
	 * A code representing the line.
	 */
	private int lineID;

	/**
	 * The line name.
	 */
	private String lineName;

	/**
	 * A Boolean indicating if the status shown is active
	 */
	private Boolean lineStatusActive;

	/**
	 * An identifier for the line.
	 */
	private int lineStatusID;

	/**
	 * A description of the status of the line if the status is not normal
	 * otherwise this will be blank
	 */
	private String statusDetail;

	/**
	 * A numeric code representing the status of the line
	 */
	private String statusID;

	/**
	 * A description of the status of the line e.g. Part Suspended, Severe
	 * Delays
	 */
	private String statusLineDescription;

	/**
	 * A description of the status type the service is checking. For this call
	 * it will always return the value “Line”
	 */
	private String statusTypeDescription;

	/**
	 * A code representing the status type the service is checking. For this
	 * call it will always return the value “1”
	 */
	private int statusTypeID;

	/**
	 * Method description
	 * 
	 * 
	 * @return
	 */
	public int getLineStatusID() {
		return lineStatusID;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @param lineStatusID
	 */
	public void setLineStatusID(int lineStatusID) {
		this.lineStatusID = lineStatusID;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @return
	 */
	public String getStatusDetail() {
		return statusDetail;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @param statusDetail
	 */
	public void setStatusDetail(String statusDetail) {
		this.statusDetail = statusDetail;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @return
	 */
	public String getBranchDisruptions() {
		return branchDisruptions;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @param branchDisruptions
	 */
	public void setBranchDisruptions(String branchDisruptions) {
		this.branchDisruptions = branchDisruptions;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @return
	 */
	public int getLineID() {
		return lineID;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @param lineID
	 */
	public void setLineID(int lineID) {
		this.lineID = lineID;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @return
	 */
	public String getLineName() {
		return lineName;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @param lineName
	 */
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @return
	 */
	public String getStatusID() {
		return statusID;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @param statusID
	 */
	public void setStatusID(String statusID) {
		this.statusID = statusID;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @return
	 */
	public String getCssClass() {
		return cssClass;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @param cssClass
	 */
	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @return
	 */
	public String getStatusLineDescription() {
		return statusLineDescription;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @param statusLineDescription
	 */
	public void setStatusLineDescription(String statusLineDescription) {
		this.statusLineDescription = statusLineDescription;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @return
	 */
	public boolean isLineStatusActive() {
		return lineStatusActive;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @param lineStatusActive
	 */
	public void setLineStatusActive(boolean lineStatusActive) {
		this.lineStatusActive = lineStatusActive;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @return
	 */
	public int getStatusTypeID() {
		return statusTypeID;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @param statusTypeID
	 */
	public void setStatusTypeID(int statusTypeID) {
		this.statusTypeID = statusTypeID;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @return
	 */
	public String getStatusTypeDescription() {
		return statusTypeDescription;
	}

	/**
	 * Method description
	 * 
	 * 
	 * @param statusTypeDescription
	 */
	public void setStatusTypeDescription(String statusTypeDescription) {
		this.statusTypeDescription = statusTypeDescription;
	}
}
