package org.iesch.jlacastac.skysight.controller;

import org.iesch.jlacastac.skysight.service.AemetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AemetController {
    @Autowired
    AemetService predictionService;

    @GetMapping(
            value = "/prediction/{id}",
            produces = "application/json"
    )
    public ResponseEntity<?> getMunicipalityPrediction(@PathVariable int id) {
        return ResponseEntity.ok(predictionService.getPrediction(id));
    }

    @GetMapping(
            value = "/municipalities",
            produces = "application/json"
    )
    public ResponseEntity<?> getMunicipalities() {
        return ResponseEntity.ok(predictionService.getMunicipalities());
    }

    @GetMapping(
            value = "/municipalities/update",
            produces = "application/json"
    )
    public ResponseEntity<?> updateMunicipalities() {
        predictionService.updateMunicipalities();
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
