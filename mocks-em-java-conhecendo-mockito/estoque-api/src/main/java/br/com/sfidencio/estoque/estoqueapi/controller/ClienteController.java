package br.com.sfidencio.estoque.estoqueapi.controller;

import br.com.sfidencio.estoque.estoqueapi.domain.service.ClienteService;
import br.com.sfidencio.estoque.estoqueapi.request.ClienteRequest;
import br.com.sfidencio.estoque.estoqueapi.response.ClienteResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente")
@Slf4j
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteResponse cadastrar(@RequestBody ClienteRequest req) {
        log.info(String.valueOf(req));
        return this.clienteService.cadastrar(req);
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ClienteResponse consultar(@PathVariable("id") Long id) throws Exception {
        log.info("Cliente de id: " + id);
        return this.clienteService.consultar(id);
    }
}
