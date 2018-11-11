package com.progressoft.tahweel.networklogon;

import com.progressoft.tahweel.base.content.body.TahweelBody;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class NetworkLogonBody extends TahweelBody {

    @XmlElement(name = "Online")
    private String online;

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }
}
