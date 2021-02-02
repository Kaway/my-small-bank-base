package fr.paris8.iutmontreuil.mysmallbank.account.domain;

import fr.paris8.iutmontreuil.mysmallbank.common.exception.ValidationErrorException;
import fr.paris8.iutmontreuil.mysmallbank.account.domain.model.Holder;
import fr.paris8.iutmontreuil.mysmallbank.common.ValidationError;
import fr.paris8.iutmontreuil.mysmallbank.account.infrastructure.HolderRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class HolderService {

    private final HolderRepository holderRepository;

    public HolderService(HolderRepository holderRepository) {
        this.holderRepository = holderRepository;
    }

    public Holder getHolder(String id) {
        return holderRepository.getHolder(id);
    }

    public List<Holder> listHolders() {
        return holderRepository.listHolders();
    }

    public Holder create(Holder holder) {
        List<ValidationError> validationErrors = validateHolder(holder);
        if (!validationErrors.isEmpty()) {
            throw new ValidationErrorException(validationErrors);
        }

        return holderRepository.create(holder);

    }

    private List<ValidationError> validateHolder(Holder holder) {
        // TODO
        return Collections.emptyList();
    }

}
