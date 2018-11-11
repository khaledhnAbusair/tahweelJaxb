package com.progressoft.tahweel.merchantmessage;

import com.progressoft.tahweel.base.content.body.TahweelBody;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class MerchantBody extends TahweelBody {

    @XmlElement(name = "Scheme")
    private String Scheme;

    @XmlElement(name = "MerchantId")
    private String MerchantId;

    @XmlElement(name = "CorporateIdentifier")
    private MerchantCorporateIdentifier merchantCorporateIdentifier;

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "City")
    private String city;

    @XmlElement(name = "Address")
    private String address;

    @XmlElement(name = "Type")
    private String type;

    @XmlElement(name = "MCC")
    private String mCC;

    @XmlElement(name = "CanPerformRegistration")
    private String canPerformRegistration;

    @XmlElement(name = "ParentId")
    private String parentId;

    @XmlElement(name = "ParentName")
    private String parentName;

    @XmlElement(name = "GpsCoordinates")
    private MerchantGpsCoordinates merchantGpsCoordinates;

    public MerchantBody() {
    }

    public String getScheme() {
        return Scheme;
    }

    public void setScheme(String scheme) {
        Scheme = scheme;
    }

    public String getMerchantId() {
        return MerchantId;
    }

    public void setMerchantId(String merchantId) {
        MerchantId = merchantId;
    }

    public MerchantCorporateIdentifier getMerchantCorporateIdentifier() {
        return merchantCorporateIdentifier;
    }

    public void setMerchantCorporateIdentifier(MerchantCorporateIdentifier merchantCorporateIdentifier) {
        this.merchantCorporateIdentifier = merchantCorporateIdentifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getmCC() {
        return mCC;
    }

    public void setmCC(String mCC) {
        this.mCC = mCC;
    }

    public String getCanPerformRegistration() {
        return canPerformRegistration;
    }

    public void setCanPerformRegistration(String canPerformRegistration) {
        this.canPerformRegistration = canPerformRegistration;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public MerchantGpsCoordinates getMerchantGpsCoordinates() {
        return merchantGpsCoordinates;
    }

    public void setMerchantGpsCoordinates(MerchantGpsCoordinates merchantGpsCoordinates) {
        this.merchantGpsCoordinates = merchantGpsCoordinates;
    }
}
