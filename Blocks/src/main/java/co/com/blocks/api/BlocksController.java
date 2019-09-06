package co.com.blocks.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.blocks.model.Block;
import co.com.blocks.service.BlocksService;

@RestController
@RequestMapping(path = "/api/blocks")
public class BlocksController {

	@Autowired
	private BlocksService blocksService;

	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<Block> findAll() {
		return blocksService.findAll();
	}

	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public Block findByName(@PathVariable String name) {
		return blocksService.findByName(name);
	}
}
