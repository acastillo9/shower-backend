package co.com.blocks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.blocks.model.Block;
import co.com.blocks.repository.BlockRepository;

@Service
public class BlockService {
	@Autowired
	private BlockRepository blockRepository;

	public Block findByName(String name) {
		return this.blockRepository.findByName(name).get(0);
	}

	public List<Block> findAll() {
		return this.blockRepository.findAll();
	}
}
