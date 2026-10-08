package com.manacommunity.api.media.service;

import org.springframework.stereotype.Service;
import java.io.InputStream;
import java.time.Duration;

@Service
public class S3MediaGateway {
    public String upload(String key, InputStream inputStream, String contentType, long contentLength) {
        return key;
    }
    public void delete(String key) {}
    public void deleteObject(String bucket, String key) {}
    public String presignGet(String bucket, String key, Duration duration) {
        return "/api/media/files/" + key;
    }
}
