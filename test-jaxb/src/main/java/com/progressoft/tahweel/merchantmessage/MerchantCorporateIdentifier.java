package com.progressoft.tahweel.merchantmessage;

import javax.xml.bind.annotation.*;

@XmlType(name = "CorporateIdentifier")
@XmlAccessorType(XmlAccessType.FIELD)
public class MerchantCorporateIdentifier {
    @XmlElement(name = "CommercialRegNo")
    private String commercialRegNo;
    @XmlElement(name = "CommercialRegArea")
    private String CommercialRegArea;

    public MerchantCorporateIdentifier() {
    }

    public String getCommercialRegNo() {
        return commercialRegNo;
    }

    public void setCommercialRegNo(String commercialRegNo) {
        this.commercialRegNo = commercialRegNo;
    }

    public String getCommercialRegArea() {
        return CommercialRegArea;
    }

    public void setCommercialRegArea(String commercialRegArea) {
        CommercialRegArea = commercialRegArea;
    }
}
