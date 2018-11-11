package com.progressoft.tahweel.registerconsumer;

import com.progressoft.tahweel.base.content.TahweelData;
import com.progressoft.tahweel.base.content.body.TahweelBody;
import com.progressoft.tahweel.networklogon.NetworkLogonBody;


public class RegisterConsumerData extends TahweelData {
    private TahweelBody tahweelBody;

    public RegisterConsumerData() {
        this.tahweelBody = new RegisterConsumerBody();
    }

    @Override
    public TahweelBody getTahweelBody() {
        return this.tahweelBody;
    }

    public void setTahweelBody(TahweelBody tahweelBody) {
        this.tahweelBody = tahweelBody;
    }
}
