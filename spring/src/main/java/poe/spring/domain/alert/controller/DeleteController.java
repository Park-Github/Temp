package poe.spring.domain.alert.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import poe.spring.domain.alert.service.AlertCrudService;

@RestController
@RequiredArgsConstructor
public class DeleteController {

    private final AlertCrudService crudService;

}
