package com.andersonlfeitosa.decrypt;

import org.jasypt.util.text.AES256TextEncryptor;

public class Decrypt {

    public static void main(String[] args) throws Exception {
        AES256TextEncryptor textEncryptor = new AES256TextEncryptor();
        String myEncryptionPassword = null;
        String auditTrail = null;

        if (args.length == 2) {
            myEncryptionPassword = args[0];
            auditTrail = args[1];

            textEncryptor.setPassword(myEncryptionPassword);
            System.out.println(textEncryptor.decrypt(auditTrail));
        } else {
            printUsage();
        }
    }

    private static void printUsage() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usage: java -jar decrypt.jar KEY VALUE");
        System.out.println(sb.toString());
    }
}
