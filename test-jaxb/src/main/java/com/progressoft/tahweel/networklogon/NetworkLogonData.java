package com.progressoft.tahweel.networklogon;

import com.progressoft.tahweel.base.content.TahweelData;
import com.progressoft.tahweel.base.content.body.TahweelBody;
import com.progressoft.tahweel.merchantmessage.MerchantBody;


public class NetworkLogonData extends TahweelData {
    private TahweelBody tahweelBody;

    public NetworkLogonData() {
        this.tahweelBody = new NetworkLogonBody();
    }

    @Override
    public TahweelBody getTahweelBody() {
        return this.tahweelBody;
    }

    public void setTahweelBody(TahweelBody tahweelBody) {
        this.tahweelBody = tahweelBody;
    }
}
