package com.progressoft.tahweel.networklogoff;

import com.progressoft.tahweel.base.content.body.TahweelBody;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class NetworkLogoffBody extends TahweelBody {

    @XmlElement(name = "Offline")
    private String offline;

    public String getOffline() {
        return offline;
    }

    public void setOffline(String offline) {
        this.offline = offline;
    }
}
