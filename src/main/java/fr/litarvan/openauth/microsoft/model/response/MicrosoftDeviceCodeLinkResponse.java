package fr.litarvan.openauth.microsoft.model.response;

public class MicrosoftDeviceCodeLinkResponse {
    private final String user_code;
    private final String device_code;
    private final String verification_uri;
    private final String expires_in;
    private final String interval;
    private final String message;


    public MicrosoftDeviceCodeLinkResponse(final String userCode, final String deviceCode, final String verificationUri, final String expiresIn, final String interval, final String message) {
        user_code = userCode;
        device_code = deviceCode;
        verification_uri = verificationUri;
        expires_in = expiresIn;
        this.interval = interval;
        this.message = message;
    }

    public String getUser_code() {
        return user_code;
    }

    public String getDevice_code() {
        return device_code;
    }

    public String getVerification_uri() {
        return verification_uri;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public String getInterval() {
        return interval;
    }

    public String getMessage() {
        return message;
    }
}
