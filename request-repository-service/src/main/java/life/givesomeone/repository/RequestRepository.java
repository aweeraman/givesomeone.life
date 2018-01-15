package life.givesomeone.repository;

import life.givesomeone.Request;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RequestRepository extends MongoRepository<Request, String> {

    List<Request> findByRequestor(String requestor);
}
