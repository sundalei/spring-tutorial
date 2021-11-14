package tacos.web.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "ingredients", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin("*")
public class IngredientController {

}
