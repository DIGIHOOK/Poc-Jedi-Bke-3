package poc.jedi.bke.repository.search;

import poc.jedi.bke.domain.AccountJEDI;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the AccountJEDI entity.
 */
public interface AccountJEDISearchRepository extends ElasticsearchRepository<AccountJEDI, Long> {
}
