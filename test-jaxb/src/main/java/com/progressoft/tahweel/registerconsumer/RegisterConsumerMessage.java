package com.progressoft.tahweel.registerconsumer;

import com.progressoft.tahweel.base.TahweelMessage;
import com.progressoft.tahweel.base.content.TahweelMessageContent;
import com.progressoft.tahweel.networklogon.NetworkLogonMessageContent;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Message")
public class RegisterConsumerMessage extends TahweelMessage {

    @XmlElement(name = "Registration.Consumer.Register.Request")
    private TahweelMessageContent tahweelMessageContent;

    public RegisterConsumerMessage() {
        this.tahweelMessageContent = new RegisterConsumerMessageContent();
    }

    @Override
    public TahweelMessageContent getTahweelMessageContent() {
        return this.tahweelMessageContent;
    }

    public void setTahweelMessageContent(TahweelMessageContent tahweelMessageContent) {
        this.tahweelMessageContent = tahweelMessageContent;
    }
}
