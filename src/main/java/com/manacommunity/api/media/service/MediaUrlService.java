package com.manacommunity.api.media.service;

import com.manacommunity.api.media.entity.MediaObject;
import org.springframework.stereotype.Service;

@Service
public class MediaUrlService {

    public String generateUrl(MediaObject media) {
        if (media == null) return null;
        if (media.getS3Key() != null) return "/api/media/files/" + media.getExternalId();
        return null;
    }

    public String generateThumbnailUrl(MediaObject media) {
        if (media == null || media.getThumbnailKey() == null) return null;
        return "/api/media/files/" + media.getExternalId() + "/thumbnail";
    }

    public String generateCompressedUrl(MediaObject media) {
        if (media == null || media.getCompressedKey() == null) return null;
        return "/api/media/files/" + media.getExternalId() + "/compressed";
    }

    public String generateMediumUrl(MediaObject media) {
        if (media == null || media.getMediumKey() == null) return null;
        return "/api/media/files/" + media.getExternalId() + "/medium";
    }
}
