package com.api.qrcodegen.ports;

public interface StoragePort {
    String uploadFile(byte[] fileData, String fileName, String contentType);
}
