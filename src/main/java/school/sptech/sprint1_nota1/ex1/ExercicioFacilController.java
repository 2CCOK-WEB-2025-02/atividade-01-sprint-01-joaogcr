package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {

        if (palavra == null) return false;

        String minuscula = palavra.toLowerCase();
        int i = 0, j = minuscula.length() - 1;

        while (i < j) {
            if (minuscula.charAt(i) != minuscula.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
