package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        if (n <= 0) {
            return new ExercicioDificilResponse(0, 0);
        }

        if (n == 1) {
            return new ExercicioDificilResponse(1, 1);
        }

        int a = 0, b = 1, enesimo = 1, soma = 1;

        for (int i = 2; i <= n; i++) {
            enesimo = a + b;
            a = b;
            b = enesimo;
            soma += enesimo;
        }

        return new ExercicioDificilResponse(enesimo, soma);
    }
}
