package fr.litarvan.openauth.microsoft.model.response;

public class MicrosoftDeviceLoginSuccessResponse {
    private final String token_type;
    private final String scope;
    private final int expires_in;
    private final String access_token;
    private final String id_token;
    private final String refresh_token;

    public MicrosoftDeviceLoginSuccessResponse(final String tokenType, final String scope, final int expiresIn, final String accessToken, final String idToken, final String refreshToken) {
        token_type = tokenType;
        this.scope = scope;
        expires_in = expiresIn;
        access_token = accessToken;
        id_token = idToken;
        refresh_token = refreshToken;
    }

    public String getToken_type() {
        return token_type;
    }

    public String getScope() {
        return scope;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getId_token() {
        return id_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }
}
