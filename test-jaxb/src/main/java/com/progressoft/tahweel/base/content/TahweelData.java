package com.progressoft.tahweel.base.content;

import com.progressoft.tahweel.base.content.body.TahweelBody;
import com.progressoft.tahweel.base.content.header.TahweelHeader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Data")
@XmlAccessorType(XmlAccessType.NONE)
public abstract class TahweelData {
    @XmlElement(name = "Header")
    private TahweelHeader header;

    @XmlElement(name = "Body")
    public abstract TahweelBody getTahweelBody();


    public TahweelHeader getHeader() {
        return header;
    }

    public void setHeader(TahweelHeader header) {
        this.header = header;
    }


}
