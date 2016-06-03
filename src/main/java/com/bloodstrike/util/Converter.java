package com.bloodstrike.util;

import java.io.ByteArrayOutputStream;

import common.net.APC;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Output;

public class Converter {
    public static byte[] toByteArray(APC apc) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try {
            Amf3Output output = new Amf3Output(SerializationContext.getSerializationContext());
            output.setOutputStream(baos);
            output.writeObject(apc);
            output.flush();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return baos.toByteArray();
    }
}
