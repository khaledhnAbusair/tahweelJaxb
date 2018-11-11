package com.progressoft.tahweel.test.signature;

import com.progressoft.tahweel.base.signature.*;

import java.util.ArrayList;

public class GenerateSignature {
    public  static Signature getSignature() {
        Signature signature = new Signature();
        signature.setSignatureValue("QSeHOanYFUm2eRvXGhEDuqqNYG5AxsGF4kI8pWHiveOBq1Yw9NlMXtcaBq70m4u9tXfS2Cpf5+kICbFV+jcFXY4sHZneETyE7PeY0NeLSMHOb0Mt1/KA9h6dPX2JvO9lh68zx4rFLHMKkxes6n1PNfsQfz7dM8Fgqpk//5gS1sc=");
        signature.setSignedInfo(getSignedInfo());
        signature.setXmlns("http://www.w3.org/2000/09/xmldsig#");
        return signature;
    }

    private static SignedInfo getSignedInfo() {
        SignedInfo signedInfo = new SignedInfo();
        signedInfo.setCanonicalizationMethod(getCanonicalizationMethod());
        signedInfo.setReference(getReference());
        signedInfo.setSignatureMethod(getSignatureMethod());
        return signedInfo;
    }

    private static SignatureMethod getSignatureMethod() {
        SignatureMethod signatureMethod = new SignatureMethod();
        signatureMethod.setAlgorithm("http://www.w3.org/2000/09/xmldsig#rsa-sha1");
        return signatureMethod;
    }

    private static Reference getReference() {
        Reference reference = new Reference();
        reference.setDigestMethod(getDigestMethod());
        reference.setDigestValue("txwKx23hmioxOgn0Zt8ir1JtqYA");
        reference.setTransforms(getTransforms());
        reference.setUri("");
        return reference;
    }

    private static Transforms getTransforms() {
        Transforms transforms = new Transforms();
        ArrayList<Transform> transformArrayList = new ArrayList<>();
        Transform transf = new Transform();
        transf.setAlgorithm("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        transformArrayList.add(transf);
        transforms.setTransform(transformArrayList);
        return transforms;
    }

    private static DigestMethod getDigestMethod() {
        DigestMethod digestMethod = new DigestMethod();
        digestMethod.setAlgorithm("http://www.w3.org/2000/09/xmldsig#sha1");
        return digestMethod;
    }

    private static CanonicalizationMethod getCanonicalizationMethod() {
        CanonicalizationMethod canonicalizationMethod = new CanonicalizationMethod();
        canonicalizationMethod.setAlgorithm("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
        return canonicalizationMethod;
    }
}
