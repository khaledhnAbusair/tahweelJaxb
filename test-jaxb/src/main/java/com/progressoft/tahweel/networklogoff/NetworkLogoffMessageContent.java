package com.progressoft.tahweel.networklogoff;

import com.progressoft.tahweel.base.content.TahweelData;
import com.progressoft.tahweel.base.content.TahweelMessageContent;
import com.progressoft.tahweel.networklogon.NetworkLogonData;

public class NetworkLogoffMessageContent extends TahweelMessageContent {
    private TahweelData data;

    public NetworkLogoffMessageContent() {
        this.data = new NetworkLogoffData();
    }

    @Override
    public TahweelData getData() {
        return this.data;
    }

    public void setData(TahweelData data) {
        this.data = data;
    }
}
