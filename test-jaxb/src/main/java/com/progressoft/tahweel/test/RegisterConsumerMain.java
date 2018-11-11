package com.progressoft.tahweel.test;

import com.progressoft.tahweel.registerconsumer.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

import static com.progressoft.tahweel.test.signature.GenerateSignature.getSignature;

public class RegisterConsumerMain {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(RegisterConsumerMessage.class, RegisterConsumerHeader.class, RegisterConsumerBody.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        printJaxbResultToConsole(m);
        printJaxbResultToXmlFile(m);

    }

    private static void printJaxbResultToXmlFile(Marshaller marshaller) throws JAXBException {
        File file = new File("registerConsumerRequest.xml");
        marshaller.marshal(getRegisterConsumerMessage(), file);
    }

    private static RegisterConsumerMessage getRegisterConsumerMessage() {
        RegisterConsumerMessage message = new RegisterConsumerMessage();
        message.setSignature(getSignature());
        RegisterConsumerMessageContent content = new RegisterConsumerMessageContent();
        RegisterConsumerData data = new RegisterConsumerData();
        data.setHeader(getRegisterConsumerHeader());
        data.setTahweelBody(getRegisterConsumerBody());
        content.setData(data);
        message.setTahweelMessageContent(content);
        return message;
    }

    private static RegisterConsumerBody getRegisterConsumerBody() {
        RegisterConsumerBody body = new RegisterConsumerBody();
        body.setAddress("Building / Street / District");
        body.setCity("Amman");
        body.setConsumerIdentifier(getConsumerIdentifier());
        body.setMsisdn("00200023400000");
        body.setName("Khaled Abusair");
        body.setScheme("Schema A");
        return body;
    }

    private static ConsumerIdentifier getConsumerIdentifier() {
        ConsumerIdentifier consumerIdentifier = new ConsumerIdentifier();
        consumerIdentifier.setCommercialRegNo("123");
        return consumerIdentifier;
    }

    private static RegisterConsumerHeader getRegisterConsumerHeader() {
        RegisterConsumerHeader header = new RegisterConsumerHeader();
        header.setClientId("30dd089a-1087-45f3-9168-665b2fc84e21");
        header.setVersion("1.00");
        header.setRequestId("5ba08a02-4401-4ec5-9bf3-54215bbb5fb7");
        return header;
    }

    private static void printJaxbResultToConsole(Marshaller marshaller) throws JAXBException {
        marshaller.marshal(getRegisterConsumerMessage(), System.out);
    }

}
