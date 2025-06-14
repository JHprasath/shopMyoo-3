package package1.e_commerce.app.service;

import org.springframework.stereotype.Service;
import package1.e_commerce.app.model.Collection;
import package1.e_commerce.app.repository.CollectionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CollectionService {

    private final CollectionRepository collectionRepository;

    public CollectionService(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    public List<Collection> getAllCollection() {
        return collectionRepository.findAll();
    }

    public Optional<Collection> getCollectionById(Long id) {
        return collectionRepository.findById(id);
    }

    public Collection createCollection(Collection collection) {
        return collectionRepository.save(collection);
    }

    public Optional<Collection> updateCollection(Long id, Collection updatedCollection) {
        return collectionRepository.findById(id).map(existing -> {
            existing.setMensDressImage(updatedCollection.getMensDressImage());
            existing.setMensDressName(updatedCollection.getMensDressName());
            existing.setWomensDressImage(updatedCollection.getWomensDressImage());
            existing.setWomensDressName(updatedCollection.getWomensDressName());
            existing.setBabysDressImage(updatedCollection.getBabysDressImage());
            existing.setBabysDressName(updatedCollection.getBabysDressName());
            return collectionRepository.save(existing);
        });
    }

    public boolean deleteCollection(Long id) {
        if (collectionRepository.existsById(id)) {
            collectionRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
