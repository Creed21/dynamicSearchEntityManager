package with.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import with.hibernate.model.Grupa;
import with.hibernate.model.SimpleData;
import with.hibernate.model.TestTable;
import with.hibernate.service.GrupaService;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/dynamicSearch")
public class DynamicQueryController {

    Logger logger = Logger.getLogger(DynamicQueryController.class.getName());

    private final GrupaService grupaService;

    @Autowired
    public DynamicQueryController(GrupaService grupaService) {
        this.grupaService = grupaService;
    }


    @GetMapping("/grupa")
    public List<Grupa> dynamicSearch(@RequestBody Grupa grupa) {
        logger.info("input grupa: "+grupa);
        return grupaService.findDynamic(grupa);
    }

    @GetMapping("/simpleData")
    public List<?> dynamicSearchGeneral1(@RequestBody SimpleData simpleData) {
        logger.info("input simpleData: "+simpleData);
        return grupaService.findDynamicGeneral(simpleData);
    }

    @GetMapping("/testTable")
    public List<?> dynamicSearchGeneral1(@RequestBody TestTable testTable) {
        logger.info("input testTable: "+testTable);
        return grupaService.findDynamicGeneral(testTable);
    }

    @GetMapping("/findAll")
    public List<Grupa> findAll() {
        return grupaService.findAll();
    }

    @GetMapping("/find/{id}")
    public Grupa findById(@PathVariable Integer id) {
        return grupaService.findById(id);
    }

    @GetMapping("/find/string/{naziv}")
    public List<Grupa> findById(@PathVariable String naziv) {
        return grupaService.findAllByNaziv(naziv);
    }

}
