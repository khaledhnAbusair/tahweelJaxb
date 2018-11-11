package com.progressoft.tahweel.base.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public abstract class TahweelMessageContent {

    @XmlElement(name = "Data")
    public abstract TahweelData getData();

}
