package co.com.blocks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.blocks.model.Block;
import co.com.blocks.repository.BlocksRepository;

@Service
public class BlocksService {

	@Autowired
	private BlocksRepository blocksRepository;

	public Block findByName(String name) {
		return this.blocksRepository.findByName(name).get(0);
	}

	public List<Block> findAll() {
		return this.blocksRepository.findAll();
	}
}
