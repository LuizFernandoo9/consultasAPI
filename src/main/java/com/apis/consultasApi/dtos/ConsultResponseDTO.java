package com.apis.consultasApi.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConsultResponseDTO {

    private UUID protocol;
    private String patientName;
    private String examName;
    private String typeExamName;
    private LocalDateTime NewConsultAt;
}
