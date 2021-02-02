package fr.paris8.iutmontreuil.mysmallbank.account.exposition;

import fr.paris8.iutmontreuil.mysmallbank.account.HolderMapper;
import fr.paris8.iutmontreuil.mysmallbank.account.domain.HolderService;
import fr.paris8.iutmontreuil.mysmallbank.account.domain.model.Holder;
import fr.paris8.iutmontreuil.mysmallbank.account.exposition.dto.HolderDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/holders")
public class HolderController {

    private final HolderService holderService;

    public HolderController(HolderService holderService) {
        this.holderService = holderService;
    }

    @GetMapping
    public List<HolderDTO> findAll() {
        // TODO
        return null;
    }

    @GetMapping("/{id}")
    public HolderDTO getOne(@PathVariable("id") String id) {
        // TODO
        return null;
    }

    @PostMapping
    public HolderDTO create(@RequestBody HolderDTO holderDTO) {
        Holder holder = holderService.create(HolderMapper.toHolder(holderDTO));
        return HolderMapper.toDTO(holder);
    }

    //TODO : annotation
    public HolderDTO updateAdress(/* TODO */) {
        // TODO
        return null;
    }
}
