package com.progressoft.tahweel.networklogoff;

import com.progressoft.tahweel.base.content.TahweelData;
import com.progressoft.tahweel.base.content.body.TahweelBody;
import com.progressoft.tahweel.networklogon.NetworkLogonBody;


public class NetworkLogoffData extends TahweelData {
    private TahweelBody tahweelBody;

    public NetworkLogoffData() {
        this.tahweelBody = new NetworkLogoffBody();
    }

    @Override
    public TahweelBody getTahweelBody() {
        return this.tahweelBody;
    }

    public void setTahweelBody(TahweelBody tahweelBody) {
        this.tahweelBody = tahweelBody;
    }
}
