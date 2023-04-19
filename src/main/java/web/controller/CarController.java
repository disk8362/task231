package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping()
    public String index(ModelMap model, @RequestParam(value = "count") Optional<Integer> count) {
        model.addAttribute("cars", carDao.index(count.orElse(0)));
        return "cars";
    }
}

