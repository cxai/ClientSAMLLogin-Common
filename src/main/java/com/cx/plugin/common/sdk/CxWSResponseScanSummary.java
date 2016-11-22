package com.cx.plugin.common.sdk;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CxWSResponseScanSummary complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="CxWSResponseScanSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Checkmarx.com/v7}CxWSBasicRepsonse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Started" type="{http://Checkmarx.com/v7}CxDateTime" minOccurs="0"/&gt;
 *         &lt;element name="Finished" type="{http://Checkmarx.com/v7}CxDateTime" minOccurs="0"/&gt;
 *         &lt;element name="ScanRisk" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Preset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOC" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FilesCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Info" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScanRiskSeverity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScanRiskQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsIncremental" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ScanType" type="{http://Checkmarx.com/v7}ScanType"/&gt;
 *         &lt;element name="ScanLanguageStateCollection" type="{http://Checkmarx.com/v7}ArrayOfCxWSQueryLanguageState" minOccurs="0"/&gt;
 *         &lt;element name="EngineStart" type="{http://Checkmarx.com/v7}CxDateTime" minOccurs="0"/&gt;
 *         &lt;element name="EngineFinish" type="{http://Checkmarx.com/v7}CxDateTime" minOccurs="0"/&gt;
 *         &lt;element name="ScanQueued" type="{http://Checkmarx.com/v7}CxDateTime" minOccurs="0"/&gt;
 *         &lt;element name="TotalScanTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="StatisticsCalculationDate" type="{http://Checkmarx.com/v7}CxDateTime" minOccurs="0"/&gt;
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TeamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseScanSummary", propOrder = {
        "started",
        "finished",
        "scanRisk",
        "preset",
        "path",
        "comment",
        "loc",
        "filesCount",
        "high",
        "medium",
        "low",
        "info",
        "scanRiskSeverity",
        "scanRiskQuantity",
        "isIncremental",
        "scanType",
        "scanLanguageStateCollection",
        "engineStart",
        "engineFinish",
        "scanQueued",
        "totalScanTime",
        "statisticsCalculationDate",
        "projectName",
        "teamName"
})
public class CxWSResponseScanSummary
        extends CxWSBasicRepsonse {

    @XmlElement(name = "Started")
    protected CxDateTime started;
    @XmlElement(name = "Finished")
    protected CxDateTime finished;
    @XmlElement(name = "ScanRisk")
    protected int scanRisk;
    @XmlElement(name = "Preset")
    protected String preset;
    @XmlElement(name = "Path")
    protected String path;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "LOC")
    protected long loc;
    @XmlElement(name = "FilesCount")
    protected long filesCount;
    @XmlElement(name = "High")
    protected int high;
    @XmlElement(name = "Medium")
    protected int medium;
    @XmlElement(name = "Low")
    protected int low;
    @XmlElement(name = "Info")
    protected int info;
    @XmlElement(name = "ScanRiskSeverity")
    protected int scanRiskSeverity;
    @XmlElement(name = "ScanRiskQuantity")
    protected int scanRiskQuantity;
    @XmlElement(name = "IsIncremental")
    protected boolean isIncremental;
    @XmlElement(name = "ScanType", required = true)
    @XmlSchemaType(name = "string")
    protected ScanType scanType;
    @XmlElement(name = "ScanLanguageStateCollection")
    protected ArrayOfCxWSQueryLanguageState scanLanguageStateCollection;
    @XmlElement(name = "EngineStart")
    protected CxDateTime engineStart;
    @XmlElement(name = "EngineFinish")
    protected CxDateTime engineFinish;
    @XmlElement(name = "ScanQueued")
    protected CxDateTime scanQueued;
    @XmlElement(name = "TotalScanTime")
    protected long totalScanTime;
    @XmlElement(name = "StatisticsCalculationDate")
    protected CxDateTime statisticsCalculationDate;
    @XmlElement(name = "ProjectName")
    protected String projectName;
    @XmlElement(name = "TeamName")
    protected String teamName;

    /**
     * Gets the value of the started property.
     *
     * @return possible object is
     * {@link CxDateTime }
     */
    public CxDateTime getStarted() {
        return started;
    }

    /**
     * Sets the value of the started property.
     *
     * @param value allowed object is
     *              {@link CxDateTime }
     */
    public void setStarted(CxDateTime value) {
        this.started = value;
    }

    /**
     * Gets the value of the finished property.
     *
     * @return possible object is
     * {@link CxDateTime }
     */
    public CxDateTime getFinished() {
        return finished;
    }

    /**
     * Sets the value of the finished property.
     *
     * @param value allowed object is
     *              {@link CxDateTime }
     */
    public void setFinished(CxDateTime value) {
        this.finished = value;
    }

    /**
     * Gets the value of the scanRisk property.
     */
    public int getScanRisk() {
        return scanRisk;
    }

    /**
     * Sets the value of the scanRisk property.
     */
    public void setScanRisk(int value) {
        this.scanRisk = value;
    }

    /**
     * Gets the value of the preset property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPreset() {
        return preset;
    }

    /**
     * Sets the value of the preset property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPreset(String value) {
        this.preset = value;
    }

    /**
     * Gets the value of the path property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the comment property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComment(String value) {
        this.comment = value;
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
     * Gets the value of the filesCount property.
     */
    public long getFilesCount() {
        return filesCount;
    }

    /**
     * Sets the value of the filesCount property.
     */
    public void setFilesCount(long value) {
        this.filesCount = value;
    }

    /**
     * Gets the value of the high property.
     */
    public int getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     */
    public void setHigh(int value) {
        this.high = value;
    }

    /**
     * Gets the value of the medium property.
     */
    public int getMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     */
    public void setMedium(int value) {
        this.medium = value;
    }

    /**
     * Gets the value of the low property.
     */
    public int getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     */
    public void setLow(int value) {
        this.low = value;
    }

    /**
     * Gets the value of the info property.
     */
    public int getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     */
    public void setInfo(int value) {
        this.info = value;
    }

    /**
     * Gets the value of the scanRiskSeverity property.
     */
    public int getScanRiskSeverity() {
        return scanRiskSeverity;
    }

    /**
     * Sets the value of the scanRiskSeverity property.
     */
    public void setScanRiskSeverity(int value) {
        this.scanRiskSeverity = value;
    }

    /**
     * Gets the value of the scanRiskQuantity property.
     */
    public int getScanRiskQuantity() {
        return scanRiskQuantity;
    }

    /**
     * Sets the value of the scanRiskQuantity property.
     */
    public void setScanRiskQuantity(int value) {
        this.scanRiskQuantity = value;
    }

    /**
     * Gets the value of the isIncremental property.
     */
    public boolean isIsIncremental() {
        return isIncremental;
    }

    /**
     * Sets the value of the isIncremental property.
     */
    public void setIsIncremental(boolean value) {
        this.isIncremental = value;
    }

    /**
     * Gets the value of the scanType property.
     *
     * @return possible object is
     * {@link ScanType }
     */
    public ScanType getScanType() {
        return scanType;
    }

    /**
     * Sets the value of the scanType property.
     *
     * @param value allowed object is
     *              {@link ScanType }
     */
    public void setScanType(ScanType value) {
        this.scanType = value;
    }

    /**
     * Gets the value of the scanLanguageStateCollection property.
     *
     * @return possible object is
     * {@link ArrayOfCxWSQueryLanguageState }
     */
    public ArrayOfCxWSQueryLanguageState getScanLanguageStateCollection() {
        return scanLanguageStateCollection;
    }

    /**
     * Sets the value of the scanLanguageStateCollection property.
     *
     * @param value allowed object is
     *              {@link ArrayOfCxWSQueryLanguageState }
     */
    public void setScanLanguageStateCollection(ArrayOfCxWSQueryLanguageState value) {
        this.scanLanguageStateCollection = value;
    }

    /**
     * Gets the value of the engineStart property.
     *
     * @return possible object is
     * {@link CxDateTime }
     */
    public CxDateTime getEngineStart() {
        return engineStart;
    }

    /**
     * Sets the value of the engineStart property.
     *
     * @param value allowed object is
     *              {@link CxDateTime }
     */
    public void setEngineStart(CxDateTime value) {
        this.engineStart = value;
    }

    /**
     * Gets the value of the engineFinish property.
     *
     * @return possible object is
     * {@link CxDateTime }
     */
    public CxDateTime getEngineFinish() {
        return engineFinish;
    }

    /**
     * Sets the value of the engineFinish property.
     *
     * @param value allowed object is
     *              {@link CxDateTime }
     */
    public void setEngineFinish(CxDateTime value) {
        this.engineFinish = value;
    }

    /**
     * Gets the value of the scanQueued property.
     *
     * @return possible object is
     * {@link CxDateTime }
     */
    public CxDateTime getScanQueued() {
        return scanQueued;
    }

    /**
     * Sets the value of the scanQueued property.
     *
     * @param value allowed object is
     *              {@link CxDateTime }
     */
    public void setScanQueued(CxDateTime value) {
        this.scanQueued = value;
    }

    /**
     * Gets the value of the totalScanTime property.
     */
    public long getTotalScanTime() {
        return totalScanTime;
    }

    /**
     * Sets the value of the totalScanTime property.
     */
    public void setTotalScanTime(long value) {
        this.totalScanTime = value;
    }

    /**
     * Gets the value of the statisticsCalculationDate property.
     *
     * @return possible object is
     * {@link CxDateTime }
     */
    public CxDateTime getStatisticsCalculationDate() {
        return statisticsCalculationDate;
    }

    /**
     * Sets the value of the statisticsCalculationDate property.
     *
     * @param value allowed object is
     *              {@link CxDateTime }
     */
    public void setStatisticsCalculationDate(CxDateTime value) {
        this.statisticsCalculationDate = value;
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

}
