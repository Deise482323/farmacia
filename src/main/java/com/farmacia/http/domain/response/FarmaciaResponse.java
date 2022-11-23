package com.farmacia.http.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_CADASTRO_FARMÁCIA")
public class FarmaciaResponse {

    private String cliente;
    private String cpf;
    private String convenioCartaoSus;
    private String numero;
}

