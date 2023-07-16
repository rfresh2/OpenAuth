package fr.litarvan.openauth.microsoft.model.response;

import java.util.List;

public class MicrosoftApiError {
    private final String error;
    private final String error_description;
    private final List<String> error_codes;
    private final String timestamp;
    private final String trace_id;
    private final String correlation_id;
    private final String error_uri;

    public MicrosoftApiError(final String error, final String errorDescription, final List<String> errorCodes, final String timestamp, final String traceId, final String correlationId, final String errorUri) {
        this.error = error;
        error_description = errorDescription;
        error_codes = errorCodes;
        this.timestamp = timestamp;
        trace_id = traceId;
        correlation_id = correlationId;
        error_uri = errorUri;
    }

    public String getError() {
        return error;
    }

    public String getError_description() {
        return error_description;
    }

    public List<String> getError_codes() {
        return error_codes;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getTrace_id() {
        return trace_id;
    }

    public String getCorrelation_id() {
        return correlation_id;
    }

    public String getError_uri() {
        return error_uri;
    }
}
