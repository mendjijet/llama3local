package jet.ai.llama3local.dao;

import java.util.List;

public record Author(String author, List<Book> books) {
}
