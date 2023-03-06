package br.com.entrei.controller;

import br.com.entrei.api.QrCodesApi;
import br.com.entrei.model.QrCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@RestController
public class QRCodesControllerImpl implements QrCodesApi {

    @Override
    public Mono<ResponseEntity<QrCode>> postQRCode(Mono<QrCode> qrCode, ServerWebExchange exchange) {
        return null;
    }
}
