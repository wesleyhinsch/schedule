package com.sicred.api.schedule.controller;

import com.sicred.api.schedule.controller.abst.Controller;
import com.sicred.api.schedule.controller.dto.AgendaDTO;
import com.sicred.api.schedule.service.AgendaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value="/api/agenda")
@Api(value="API Agenda v.1")
public class AgendaController extends Controller {

    @Autowired
    AgendaService agendaService;

    @ApiOperation(value="Create Ata")
    @PostMapping(value = {"/v1.0"},consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createAta(@Valid @RequestBody AgendaDTO agendaDTO){
        agendaService.save(agendaDTO);
       return ResponseEntity.ok(SUCCESS);
    }

}
