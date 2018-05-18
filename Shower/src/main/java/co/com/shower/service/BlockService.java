package co.com.shower.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.shower.model.Block;
import co.com.shower.repository.BlockRepository;

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
