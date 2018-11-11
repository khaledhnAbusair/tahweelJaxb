package com.progressoft.tahweel.merchantmessage;

import com.progressoft.tahweel.base.TahweelMessage;
import com.progressoft.tahweel.base.content.TahweelMessageContent;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Message")
public class MerchantMessage extends TahweelMessage {

    @XmlElement(name = "Registration.Merchant.Register.Request")
    private TahweelMessageContent tahweelMessageContent;

    public MerchantMessage() {
        this.tahweelMessageContent = new MerchantMessageContent();
    }

    @Override
    public TahweelMessageContent getTahweelMessageContent() {
        return this.tahweelMessageContent;
    }

    public void setTahweelMessageContent(TahweelMessageContent tahweelMessageContent) {
        this.tahweelMessageContent = tahweelMessageContent;
    }
}
