package com.progressoft.tahweel.registerconsumer;

import com.progressoft.tahweel.base.content.TahweelData;
import com.progressoft.tahweel.base.content.TahweelMessageContent;
import com.progressoft.tahweel.networklogon.NetworkLogonData;

public class RegisterConsumerMessageContent extends TahweelMessageContent {
    private TahweelData data;

    public RegisterConsumerMessageContent() {
        this.data = new RegisterConsumerData();
    }

    @Override
    public TahweelData getData() {
        return this.data;
    }

    public void setData(TahweelData data) {
        this.data = data;
    }
}
