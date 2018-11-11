package com.progressoft.tahweel.merchantmessage;

import com.progressoft.tahweel.base.content.header.TahweelHeader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class MerchantHeader extends TahweelHeader {
    @XmlElement(name = "RequestId")
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
