package com.progressoft.tahweel.base.signature;

import javax.xml.bind.annotation.*;

@XmlType(name = "Signature")
@XmlAccessorType(XmlAccessType.FIELD)
public class Signature {

    @XmlElement(name = "SignedInfo")
    private SignedInfo signedInfo;
    @XmlElement(name = "SignatureValue")
    private String signatureValue;
    @XmlAttribute(name = "xmlns")
    private String xmlns;

    public Signature() {
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public SignedInfo getSignedInfo() {
        return signedInfo;
    }

    public void setSignedInfo(SignedInfo signedInfo) {
        this.signedInfo = signedInfo;
    }

    public String getSignatureValue() {
        return signatureValue;
    }

    public void setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
    }
}
