package com.progressoft.tahweel.test;

import com.progressoft.tahweel.merchantmessage.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

import static com.progressoft.tahweel.test.signature.GenerateSignature.getSignature;

public class MerchantMain {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(MerchantMessage.class, MerchantHeader.class, MerchantBody.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        printJaxbResultToConsole(m);
        printJaxbResultToXmlFile(m);
    }

    private static void printJaxbResultToXmlFile(Marshaller marshaller) throws JAXBException {
        File file = new File("merchantRequest.xml");
        marshaller.marshal(getMerchantMessage(), file);
    }

    private static void printJaxbResultToConsole(Marshaller marshaller) throws JAXBException {
        marshaller.marshal(getMerchantMessage(), System.out);
    }

    private static MerchantMessage getMerchantMessage() {
        MerchantMessage merchantMessage = new MerchantMessage();
        merchantMessage.setSignature(getSignature());
        merchantMessage.setTahweelMessageContent(getMerchantMessageContent());
        return merchantMessage;
    }

    private static MerchantMessageContent getMerchantMessageContent() {
        MerchantMessageContent content = new MerchantMessageContent();

        content.setData(getMerchantData());
        return content;
    }

    private static MerchantTahweelData getMerchantData() {
        MerchantTahweelData merchantTahweelData = new MerchantTahweelData();
        merchantTahweelData.setHeader(getMerchantHeader());
        merchantTahweelData.setTahweelBody(getMerchantBody());
        return merchantTahweelData;
    }

    private static MerchantBody getMerchantBody() {
        MerchantBody merchantBody = new MerchantBody();
        merchantBody.setAddress("Building / Street / District");
        merchantBody.setCanPerformRegistration("true");
        merchantBody.setCity("Amman");
        merchantBody.setmCC("5555");
        merchantBody.setMerchantCorporateIdentifier(getMerchantCorporateIdentifier());
        merchantBody.setMerchantGpsCoordinates(getMerchantGpsCoordinates());
        merchantBody.setName("Name A");
        merchantBody.setParentId("a");
        merchantBody.setScheme("Scheme A");
        merchantBody.setType("type");
        merchantBody.setMerchantId("0000125525");
        merchantBody.setParentName("parentNameTest");
        return merchantBody;
    }

    private static MerchantGpsCoordinates getMerchantGpsCoordinates() {
        MerchantGpsCoordinates merchantGpsCoordinates = new MerchantGpsCoordinates();
        merchantGpsCoordinates.setLatitude("30.0000000");
        merchantGpsCoordinates.setLongitude("310.000000");
        return merchantGpsCoordinates;
    }

    private static MerchantCorporateIdentifier getMerchantCorporateIdentifier() {
        MerchantCorporateIdentifier merchantCorporateIdentifier = new MerchantCorporateIdentifier();
        merchantCorporateIdentifier.setCommercialRegArea("123");
        merchantCorporateIdentifier.setCommercialRegNo("54545");
        return merchantCorporateIdentifier;
    }

    private static MerchantHeader getMerchantHeader() {
        MerchantHeader header = new MerchantHeader();
        header.setClientId("30dd089a-1087-45f3-9168-665b2fc84e21");
        header.setVersion("1.00");
        header.setRequestId("5ba08a02-4401-4ec5-9bf3-54215bbb5fb7");
        return header;
    }
}
