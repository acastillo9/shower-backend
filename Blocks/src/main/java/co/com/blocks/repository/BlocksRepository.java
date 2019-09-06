package co.com.blocks.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.com.blocks.model.Block;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocksRepository extends MongoRepository<Block, String> {

	public List<Block> findByName(String name);

	public List<Block> findAll();

}
