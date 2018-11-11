package com.progressoft.tahweel.networklogon;

import com.progressoft.tahweel.base.content.header.TahweelHeader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class NetworkLogonHeader extends TahweelHeader {
    @XmlElement(name = "RequestId")
    private String requestId;
    @XmlElement(name = "RequestTimeStamp")
    private String requestTimeStamp;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestTimeStamp() {
        return requestTimeStamp;
    }

    public void setRequestTimeStamp(String requestTimeStamp) {
        this.requestTimeStamp = requestTimeStamp;
    }
}
