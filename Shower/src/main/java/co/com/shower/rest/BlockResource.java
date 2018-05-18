package co.com.shower.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.shower.model.Block;
import co.com.shower.service.BlockService;

@RestController
@RequestMapping(path = "/rest/block")
public class BlockResource {

	@Autowired
	private BlockService blockService;

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<Block> get() {
		return blockService.findAll();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/byname/{name}", method = RequestMethod.GET)
	public Block findByName(@PathVariable String name) {
		return blockService.findByName(name);
	}
}
