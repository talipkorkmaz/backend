package com.ascend.campaign.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ImageFreebie {

    @JsonProperty(value = "img_web")
    private String imgWeb;

    @JsonProperty(value = "img_web_translation")
    private String imgWebTranslation;

    @JsonProperty(value = "img_mobile")
    private String imgMobile;

    @JsonProperty(value = "img_mobile_translation")
    private String imgMobileTranslation;


    @JsonProperty(value = "thumb_web")
    private String thumbWeb;

    @JsonProperty(value = "thumb_mobile")
    private String thumbMobile;

    @JsonProperty(value = "thumb_web_translation")
    private String thumbWebTranslation;

    @JsonProperty(value = "thumb_mobile_translation")
    private String thumbMobileTranslation;
}
