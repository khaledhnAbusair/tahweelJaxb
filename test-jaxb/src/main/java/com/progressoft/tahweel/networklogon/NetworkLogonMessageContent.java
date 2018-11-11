package com.progressoft.tahweel.networklogon;

import com.progressoft.tahweel.base.content.TahweelData;
import com.progressoft.tahweel.base.content.TahweelMessageContent;
import com.progressoft.tahweel.merchantmessage.MerchantTahweelData;

public class NetworkLogonMessageContent extends TahweelMessageContent {
    private TahweelData data;

    public NetworkLogonMessageContent() {
        this.data = new NetworkLogonData();
    }

    @Override
    public TahweelData getData() {
        return this.data;
    }

    public void setData(TahweelData data) {
        this.data = data;
    }
}
