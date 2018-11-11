package com.progressoft.tahweel.merchantmessage;

import com.progressoft.tahweel.base.content.TahweelData;
import com.progressoft.tahweel.base.content.TahweelMessageContent;

public class MerchantMessageContent extends TahweelMessageContent {
    private TahweelData data;

    public MerchantMessageContent() {
        this.data = new MerchantTahweelData();
    }

    @Override
    public TahweelData getData() {
        return this.data;
    }

    public void setData(TahweelData data) {
        this.data = data;
    }
}
