package com.progressoft.tahweel.registerconsumer;

import com.progressoft.tahweel.base.content.body.TahweelBody;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class RegisterConsumerBody extends TahweelBody {

    @XmlElement(name = "Scheme")
    private String scheme;

    @XmlElement(name = "Msisdn")
    private String msisdn;

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "City")
    private String city;

    @XmlElement(name = "Address")
    private String address;

    @XmlElement(name = "Identifier")
    private ConsumerIdentifier consumerIdentifier;

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ConsumerIdentifier getConsumerIdentifier() {
        return consumerIdentifier;
    }

    public void setConsumerIdentifier(ConsumerIdentifier consumerIdentifier) {
        this.consumerIdentifier = consumerIdentifier;
    }
}
