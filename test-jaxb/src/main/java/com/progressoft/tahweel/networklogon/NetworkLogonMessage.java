package com.progressoft.tahweel.networklogon;

import com.progressoft.tahweel.base.TahweelMessage;
import com.progressoft.tahweel.base.content.TahweelMessageContent;
import com.progressoft.tahweel.merchantmessage.MerchantMessageContent;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Message")
public class NetworkLogonMessage extends TahweelMessage {

    @XmlElement(name = "NetworkManagement.LogOn.Requests")
    private TahweelMessageContent tahweelMessageContent;

    public NetworkLogonMessage() {
        this.tahweelMessageContent = new NetworkLogonMessageContent();
    }

    @Override
    public TahweelMessageContent getTahweelMessageContent() {
        return this.tahweelMessageContent;
    }

    public void setTahweelMessageContent(TahweelMessageContent tahweelMessageContent) {
        this.tahweelMessageContent = tahweelMessageContent;
    }
}
