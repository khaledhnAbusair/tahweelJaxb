package com.progressoft.tahweel.registerconsumer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Identifier")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsumerIdentifier {
    @XmlElement(name = "CommercialRegNo")
    private String commercialRegNo;

    public String getCommercialRegNo() {
        return commercialRegNo;
    }

    public void setCommercialRegNo(String commercialRegNo) {
        this.commercialRegNo = commercialRegNo;
    }
}
