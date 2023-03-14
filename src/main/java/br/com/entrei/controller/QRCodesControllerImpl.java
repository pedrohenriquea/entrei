package br.com.entrei.controller;

import br.com.entrei.api.QrCodesApi;
import br.com.entrei.entity.QrCodeModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@RestController
public class QRCodesControllerImpl implements QrCodesApi {

    @Override
    public Mono<ResponseEntity<QrCodeModel>> postQRCode(Mono<QrCodeModel> qrCodeModel, ServerWebExchange exchange) {
        return null;
    }
}
