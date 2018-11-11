package com.progressoft.tahweel.networklogoff;

import com.progressoft.tahweel.base.TahweelMessage;
import com.progressoft.tahweel.base.content.TahweelMessageContent;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Message")
public class NetworkLogoffMessage extends TahweelMessage {

    @XmlElement(name = "NetworkManagement.LogOff.Requests")
    private TahweelMessageContent tahweelMessageContent;

    public NetworkLogoffMessage() {
        this.tahweelMessageContent = new NetworkLogoffMessageContent();
    }

    @Override
    public TahweelMessageContent getTahweelMessageContent() {
        return this.tahweelMessageContent;
    }

    public void setTahweelMessageContent(TahweelMessageContent tahweelMessageContent) {
        this.tahweelMessageContent = tahweelMessageContent;
    }
}
