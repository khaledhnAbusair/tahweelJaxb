package com.progressoft.tahweel.base.signature;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(name = "Transforms")
@XmlAccessorType(XmlAccessType.FIELD)
public class Transforms {
    @XmlElement(name = "Transform")
    private List<Transform> transform;

    public Transforms() {
    }

    public List<Transform> getTransform() {
        return transform;
    }

    public void setTransform(List<Transform> transform) {
        this.transform = transform;
    }
}
