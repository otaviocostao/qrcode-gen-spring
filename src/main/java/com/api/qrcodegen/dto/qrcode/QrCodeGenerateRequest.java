package com.api.qrcodegen.dto.qrcode;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public record QrCodeGenerateRequest(
        @NotBlank(message = "O campo de URL não pode ser vazio.")
        @URL(message = "O texto fornecido deve ser uma URL válida.")
        String text) {
}
