package com.progressoft.tahweel.test;

import com.progressoft.tahweel.networklogoff.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.progressoft.tahweel.test.signature.GenerateSignature.getSignature;

public class NetworkLogoffMain {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(NetworkLogoffMessage.class, NetworkLogoffHeader.class, NetworkLogoffBody.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        printJaxbResultToConsole(m);
        printJaxbResultToXmlFile(m);

    }

    private static void printJaxbResultToXmlFile(Marshaller marshaller) throws JAXBException {
        File file = new File("networkLogoffRequest.xml");
        marshaller.marshal(getNetworkLogonMessage(), file);
    }

    private static NetworkLogoffMessage getNetworkLogonMessage() {
        NetworkLogoffMessage message = new NetworkLogoffMessage();
        message.setSignature(getSignature());
        NetworkLogoffMessageContent content = new NetworkLogoffMessageContent();
        NetworkLogoffData data = new NetworkLogoffData();
        data.setHeader(getNetworkLogoffHeader());
        data.setTahweelBody(getNetworkLogoffBody());
        content.setData(data);
        message.setTahweelMessageContent(content);
        return message;
    }

    private static NetworkLogoffBody getNetworkLogoffBody() {
        NetworkLogoffBody body = new NetworkLogoffBody();
        body.setOffline("true");
        return body;
    }

    private static NetworkLogoffHeader getNetworkLogoffHeader() {
        NetworkLogoffHeader header = new NetworkLogoffHeader();
        header.setClientId("30dd089a-1087-45f3-9168-665b2fc84e21");
        header.setVersion("1.00");
        header.setRequestId("5ba08a02-4401-4ec5-9bf3-54215bbb5fb7");
        header.setRequestTimeStamp(generateCurrentDate());
        return header;
    }

    private static String generateCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        Date date = new Date();
        return formatter.format(date);

    }

    private static void printJaxbResultToConsole(Marshaller marshaller) throws JAXBException {
        marshaller.marshal(getNetworkLogonMessage(), System.out);
    }

}
