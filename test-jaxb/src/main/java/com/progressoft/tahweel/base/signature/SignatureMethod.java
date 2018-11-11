package com.progressoft.tahweel.base.signature;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SignatureMethod")
@XmlAccessorType(XmlAccessType.FIELD)
public class SignatureMethod {

    @XmlAttribute(name = "Algorithm")
    private String algorithm;

    public SignatureMethod() {
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}
