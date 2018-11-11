package com.progressoft.tahweel.base;

import com.progressoft.tahweel.base.content.TahweelMessageContent;
import com.progressoft.tahweel.base.signature.Signature;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Message")
@XmlAccessorType(XmlAccessType.NONE)
public abstract class TahweelMessage {

    @XmlElement(name = "Signature")
    private Signature signature;

    @XmlElement
    public abstract TahweelMessageContent getTahweelMessageContent();

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }
}
