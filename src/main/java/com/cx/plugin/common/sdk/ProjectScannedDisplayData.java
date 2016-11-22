package com.cx.plugin.common.sdk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectScannedDisplayData complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ProjectScannedDisplayData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastScanID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="LastScanDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TeamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiskLevelScore" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LOC" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="HighVulnerabilities" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MediumVulnerabilities" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LowVulnerabilities" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InfoVulnerabilities" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalVulnerabilities" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QueueTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ScanTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FailedLOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatisticsCalculationDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectScannedDisplayData", propOrder = {
        "projectID",
        "projectName",
        "lastScanID",
        "lastScanDate",
        "teamName",
        "riskLevelScore",
        "loc",
        "highVulnerabilities",
        "mediumVulnerabilities",
        "lowVulnerabilities",
        "infoVulnerabilities",
        "totalVulnerabilities",
        "queueTime",
        "scanTime",
        "failedLOC",
        "statisticsCalculationDate"
})
public class ProjectScannedDisplayData {

    @XmlElement(name = "ProjectID")
    protected long projectID;
    @XmlElement(name = "ProjectName")
    protected String projectName;
    @XmlElement(name = "LastScanID")
    protected long lastScanID;
    @XmlElement(name = "LastScanDate")
    protected long lastScanDate;
    @XmlElement(name = "TeamName")
    protected String teamName;
    @XmlElement(name = "RiskLevelScore")
    protected int riskLevelScore;
    @XmlElement(name = "LOC")
    protected long loc;
    @XmlElement(name = "HighVulnerabilities")
    protected int highVulnerabilities;
    @XmlElement(name = "MediumVulnerabilities")
    protected int mediumVulnerabilities;
    @XmlElement(name = "LowVulnerabilities")
    protected int lowVulnerabilities;
    @XmlElement(name = "InfoVulnerabilities")
    protected int infoVulnerabilities;
    @XmlElement(name = "TotalVulnerabilities")
    protected int totalVulnerabilities;
    @XmlElement(name = "QueueTime")
    protected long queueTime;
    @XmlElement(name = "ScanTime")
    protected long scanTime;
    @XmlElement(name = "FailedLOC")
    protected String failedLOC;
    @XmlElement(name = "StatisticsCalculationDate")
    protected long statisticsCalculationDate;

    /**
     * Gets the value of the projectID property.
     */
    public long getProjectID() {
        return projectID;
    }

    /**
     * Sets the value of the projectID property.
     */
    public void setProjectID(long value) {
        this.projectID = value;
    }

    /**
     * Gets the value of the projectName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the lastScanID property.
     */
    public long getLastScanID() {
        return lastScanID;
    }

    /**
     * Sets the value of the lastScanID property.
     */
    public void setLastScanID(long value) {
        this.lastScanID = value;
    }

    /**
     * Gets the value of the lastScanDate property.
     */
    public long getLastScanDate() {
        return lastScanDate;
    }

    /**
     * Sets the value of the lastScanDate property.
     */
    public void setLastScanDate(long value) {
        this.lastScanDate = value;
    }

    /**
     * Gets the value of the teamName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * Gets the value of the riskLevelScore property.
     */
    public int getRiskLevelScore() {
        return riskLevelScore;
    }

    /**
     * Sets the value of the riskLevelScore property.
     */
    public void setRiskLevelScore(int value) {
        this.riskLevelScore = value;
    }

    /**
     * Gets the value of the loc property.
     */
    public long getLOC() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     */
    public void setLOC(long value) {
        this.loc = value;
    }

    /**
     * Gets the value of the highVulnerabilities property.
     */
    public int getHighVulnerabilities() {
        return highVulnerabilities;
    }

    /**
     * Sets the value of the highVulnerabilities property.
     */
    public void setHighVulnerabilities(int value) {
        this.highVulnerabilities = value;
    }

    /**
     * Gets the value of the mediumVulnerabilities property.
     */
    public int getMediumVulnerabilities() {
        return mediumVulnerabilities;
    }

    /**
     * Sets the value of the mediumVulnerabilities property.
     */
    public void setMediumVulnerabilities(int value) {
        this.mediumVulnerabilities = value;
    }

    /**
     * Gets the value of the lowVulnerabilities property.
     */
    public int getLowVulnerabilities() {
        return lowVulnerabilities;
    }

    /**
     * Sets the value of the lowVulnerabilities property.
     */
    public void setLowVulnerabilities(int value) {
        this.lowVulnerabilities = value;
    }

    /**
     * Gets the value of the infoVulnerabilities property.
     */
    public int getInfoVulnerabilities() {
        return infoVulnerabilities;
    }

    /**
     * Sets the value of the infoVulnerabilities property.
     */
    public void setInfoVulnerabilities(int value) {
        this.infoVulnerabilities = value;
    }

    /**
     * Gets the value of the totalVulnerabilities property.
     */
    public int getTotalVulnerabilities() {
        return totalVulnerabilities;
    }

    /**
     * Sets the value of the totalVulnerabilities property.
     */
    public void setTotalVulnerabilities(int value) {
        this.totalVulnerabilities = value;
    }

    /**
     * Gets the value of the queueTime property.
     */
    public long getQueueTime() {
        return queueTime;
    }

    /**
     * Sets the value of the queueTime property.
     */
    public void setQueueTime(long value) {
        this.queueTime = value;
    }

    /**
     * Gets the value of the scanTime property.
     */
    public long getScanTime() {
        return scanTime;
    }

    /**
     * Sets the value of the scanTime property.
     */
    public void setScanTime(long value) {
        this.scanTime = value;
    }

    /**
     * Gets the value of the failedLOC property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFailedLOC() {
        return failedLOC;
    }

    /**
     * Sets the value of the failedLOC property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFailedLOC(String value) {
        this.failedLOC = value;
    }

    /**
     * Gets the value of the statisticsCalculationDate property.
     */
    public long getStatisticsCalculationDate() {
        return statisticsCalculationDate;
    }

    /**
     * Sets the value of the statisticsCalculationDate property.
     */
    public void setStatisticsCalculationDate(long value) {
        this.statisticsCalculationDate = value;
    }

}
