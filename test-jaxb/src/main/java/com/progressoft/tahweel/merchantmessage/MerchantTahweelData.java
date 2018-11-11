package com.progressoft.tahweel.merchantmessage;

import com.progressoft.tahweel.base.content.TahweelData;
import com.progressoft.tahweel.base.content.body.TahweelBody;


public class MerchantTahweelData extends TahweelData {
    private TahweelBody tahweelBody;

    public MerchantTahweelData() {
        this.tahweelBody = new MerchantBody();
    }

    @Override
    public TahweelBody getTahweelBody() {
        return this.tahweelBody;
    }

    public void setTahweelBody(TahweelBody tahweelBody) {
        this.tahweelBody = tahweelBody;
    }
}
