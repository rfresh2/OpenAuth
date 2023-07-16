package fr.litarvan.openauth.microsoft;

import fr.litarvan.openauth.microsoft.model.response.MicrosoftDeviceCodeLinkResponse;

public class MicrosoftAuthenticatorTests {
//    @Test // uncomment to run the test
    public void deviceCodeLoginFlowTest() throws MicrosoftAuthenticationException {
        // Test can only be run manually as it requires user interaction on ms website

        MicrosoftAuthenticator msa = new MicrosoftAuthenticator();
        MicrosoftDeviceCodeLinkResponse microsoftDeviceCodeLinkResponse = msa.startDeviceCodeLogin();
        System.out.println("Login at " + microsoftDeviceCodeLinkResponse.getVerification_uri() + " with code " + microsoftDeviceCodeLinkResponse.getUser_code());
        final AuthTokens authTokens = msa.executeDeviceCodeLoginPoll(microsoftDeviceCodeLinkResponse, 60);
        MicrosoftAuthResult microsoftAuthResult = msa.loginWithTokens(authTokens);
        System.out.println("Logged in as " + microsoftAuthResult.getProfile().getName());
    }
}
