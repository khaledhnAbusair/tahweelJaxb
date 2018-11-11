package com.progressoft.tahweel.merchantmessage;

import javax.xml.bind.annotation.*;

@XmlType(name = "GpsCoordinates")
@XmlAccessorType(XmlAccessType.FIELD)
public class MerchantGpsCoordinates {

    @XmlElement(name = "Longitude")
    private String longitude;

    @XmlElement(name = "Latitude")
    private String latitude;

    public MerchantGpsCoordinates() {
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
