package com.progressoft.tahweel.base.signature;

import javax.xml.bind.annotation.*;

@XmlType(name = "Reference")
@XmlAccessorType(XmlAccessType.FIELD)
public class Reference {
    @XmlAttribute(name = "URI")
    private String uri;
    @XmlElement(name="Transforms")
    private Transforms transforms;
    @XmlElement(name = "DigestMethod")
    private DigestMethod digestMethod;
    @XmlElement(name = "DigestValue")
    private String digestValue;

    public Reference() {
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Transforms getTransforms() {
        return transforms;
    }

    public void setTransforms(Transforms transforms) {
        this.transforms = transforms;
    }

    public DigestMethod getDigestMethod() {
        return digestMethod;
    }

    public void setDigestMethod(DigestMethod digestMethod) {
        this.digestMethod = digestMethod;
    }

    public String getDigestValue() {
        return digestValue;
    }

    public void setDigestValue(String digestValue) {
        this.digestValue = digestValue;
    }
}
