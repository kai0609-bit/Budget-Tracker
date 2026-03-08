import java.util.Optional;

public interface Serchable {
    Optional<Transaction> findById(String id);
}