package fr.paris8.iutmontreuil.mysmallbank.account.infrastructure;

import fr.paris8.iutmontreuil.mysmallbank.account.HolderMapper;
import fr.paris8.iutmontreuil.mysmallbank.account.domain.model.Holder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HolderRepository {

    private final HolderDAO holderDAO;

    public HolderRepository(HolderDAO holderDAO) {
        this.holderDAO = holderDAO;
    }

    public Holder getHolder(String id) {
        HolderEntity holder = holderDAO.getOne(id);
        return HolderMapper.toHolder(holder);
    }

    public List<Holder> listHolders() {
        // TODO
        return null;
    }

    public Holder create(Holder holder) {
        HolderEntity entityToSave = HolderMapper.toEntity(holder);
        HolderEntity createdHolder = holderDAO.save(entityToSave);
        return HolderMapper.toHolder(createdHolder);
    }

}
