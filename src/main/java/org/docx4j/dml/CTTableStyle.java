/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml;

import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlAttribute;
import ae.javax.xml.bind.annotation.XmlType;
import ae.javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import ae.javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CT_TableStyle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TableStyle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tblBg" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TableBackgroundStyle" minOccurs="0"/>
 *         &lt;element name="wholeTbl" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="band1H" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="band2H" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="band1V" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="band2V" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="lastCol" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="firstCol" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="lastRow" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="seCell" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="swCell" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="firstRow" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="neCell" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="nwCell" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TablePartStyle" minOccurs="0"/>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_OfficeArtExtensionList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="styleId" use="required" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_Guid" />
 *       &lt;attribute name="styleName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TableStyle", propOrder = {
    "tblBg",
    "wholeTbl",
    "band1H",
    "band2H",
    "band1V",
    "band2V",
    "lastCol",
    "firstCol",
    "lastRow",
    "seCell",
    "swCell",
    "firstRow",
    "neCell",
    "nwCell",
    "extLst"
})
public class CTTableStyle {

    protected CTTableBackgroundStyle tblBg;
    protected CTTablePartStyle wholeTbl;
    protected CTTablePartStyle band1H;
    protected CTTablePartStyle band2H;
    protected CTTablePartStyle band1V;
    protected CTTablePartStyle band2V;
    protected CTTablePartStyle lastCol;
    protected CTTablePartStyle firstCol;
    protected CTTablePartStyle lastRow;
    protected CTTablePartStyle seCell;
    protected CTTablePartStyle swCell;
    protected CTTablePartStyle firstRow;
    protected CTTablePartStyle neCell;
    protected CTTablePartStyle nwCell;
    protected CTOfficeArtExtensionList extLst;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String styleId;
    @XmlAttribute(required = true)
    protected String styleName;

    /**
     * Gets the value of the tblBg property.
     * 
     * @return
     *     possible object is
     *     {@link CTTableBackgroundStyle }
     *     
     */
    public CTTableBackgroundStyle getTblBg() {
        return tblBg;
    }

    /**
     * Sets the value of the tblBg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTableBackgroundStyle }
     *     
     */
    public void setTblBg(CTTableBackgroundStyle value) {
        this.tblBg = value;
    }

    /**
     * Gets the value of the wholeTbl property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getWholeTbl() {
        return wholeTbl;
    }

    /**
     * Sets the value of the wholeTbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setWholeTbl(CTTablePartStyle value) {
        this.wholeTbl = value;
    }

    /**
     * Gets the value of the band1H property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getBand1H() {
        return band1H;
    }

    /**
     * Sets the value of the band1H property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setBand1H(CTTablePartStyle value) {
        this.band1H = value;
    }

    /**
     * Gets the value of the band2H property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getBand2H() {
        return band2H;
    }

    /**
     * Sets the value of the band2H property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setBand2H(CTTablePartStyle value) {
        this.band2H = value;
    }

    /**
     * Gets the value of the band1V property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getBand1V() {
        return band1V;
    }

    /**
     * Sets the value of the band1V property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setBand1V(CTTablePartStyle value) {
        this.band1V = value;
    }

    /**
     * Gets the value of the band2V property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getBand2V() {
        return band2V;
    }

    /**
     * Sets the value of the band2V property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setBand2V(CTTablePartStyle value) {
        this.band2V = value;
    }

    /**
     * Gets the value of the lastCol property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getLastCol() {
        return lastCol;
    }

    /**
     * Sets the value of the lastCol property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setLastCol(CTTablePartStyle value) {
        this.lastCol = value;
    }

    /**
     * Gets the value of the firstCol property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getFirstCol() {
        return firstCol;
    }

    /**
     * Sets the value of the firstCol property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setFirstCol(CTTablePartStyle value) {
        this.firstCol = value;
    }

    /**
     * Gets the value of the lastRow property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getLastRow() {
        return lastRow;
    }

    /**
     * Sets the value of the lastRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setLastRow(CTTablePartStyle value) {
        this.lastRow = value;
    }

    /**
     * Gets the value of the seCell property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getSeCell() {
        return seCell;
    }

    /**
     * Sets the value of the seCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setSeCell(CTTablePartStyle value) {
        this.seCell = value;
    }

    /**
     * Gets the value of the swCell property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getSwCell() {
        return swCell;
    }

    /**
     * Sets the value of the swCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setSwCell(CTTablePartStyle value) {
        this.swCell = value;
    }

    /**
     * Gets the value of the firstRow property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getFirstRow() {
        return firstRow;
    }

    /**
     * Sets the value of the firstRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setFirstRow(CTTablePartStyle value) {
        this.firstRow = value;
    }

    /**
     * Gets the value of the neCell property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getNeCell() {
        return neCell;
    }

    /**
     * Sets the value of the neCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setNeCell(CTTablePartStyle value) {
        this.neCell = value;
    }

    /**
     * Gets the value of the nwCell property.
     * 
     * @return
     *     possible object is
     *     {@link CTTablePartStyle }
     *     
     */
    public CTTablePartStyle getNwCell() {
        return nwCell;
    }

    /**
     * Sets the value of the nwCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTablePartStyle }
     *     
     */
    public void setNwCell(CTTablePartStyle value) {
        this.nwCell = value;
    }

    /**
     * Gets the value of the extLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTOfficeArtExtensionList }
     *     
     */
    public CTOfficeArtExtensionList getExtLst() {
        return extLst;
    }

    /**
     * Sets the value of the extLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTOfficeArtExtensionList }
     *     
     */
    public void setExtLst(CTOfficeArtExtensionList value) {
        this.extLst = value;
    }

    /**
     * Gets the value of the styleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleId() {
        return styleId;
    }

    /**
     * Sets the value of the styleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleId(String value) {
        this.styleId = value;
    }

    /**
     * Gets the value of the styleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * Sets the value of the styleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
    }

}