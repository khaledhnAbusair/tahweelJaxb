package com.progressoft.tahweel.base.signature;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CanonicalizationMethod")
@XmlAccessorType(XmlAccessType.FIELD)
public class CanonicalizationMethod {

    @XmlAttribute(name = "Algorithm")
    private String algorithm;

    public CanonicalizationMethod() {
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}
