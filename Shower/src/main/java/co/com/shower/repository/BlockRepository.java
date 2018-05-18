package co.com.shower.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.com.shower.model.Block;

public interface BlockRepository extends MongoRepository<Block, String> {

	public List<Block> findByName(String name);

	public List<Block> findAll();

}
