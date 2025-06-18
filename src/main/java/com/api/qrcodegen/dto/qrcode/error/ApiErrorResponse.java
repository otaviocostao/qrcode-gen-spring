package com.api.qrcodegen.dto.qrcode.error;

import java.time.Instant;

public record ApiErrorResponse(
        Instant timestamp,
        Integer status,
        String error,
        String message
) {
}
