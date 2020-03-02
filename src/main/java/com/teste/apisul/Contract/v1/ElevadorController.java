package com.teste.apisul.Contract.v1;

import com.teste.apisul.Implementation.service.Elevador;
import lombok.AllArgsConstructor;
import org.json.simple.JSONArray;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("v1")
public class ElevadorController {
    private Elevador elevador;

    @GetMapping(path = "/lendo-dados")
    public JSONArray lendoDados() {
        return elevador.lendoDados();
    }

    @GetMapping(path = "/andar-menos-utilizado")
    public List<Integer> andarMenosUtilizado() {
        return elevador.andarMenosUtilizado();
    }

    @GetMapping(path = "/elevador-mais-frequentado")
    public List<Character> elevadorMaisFrequentado() {
        return elevador.elevadorMaisFrequentado();
    }

    @GetMapping(path = "/periodo-maior-fluxo-elevado-mais-frequentado")
    public List<Character> periodoMaiorFluxoElevadorMaisFrequentado() {
        return elevador.periodoMaiorFluxoElevadorMaisFrequentado();
    }

    @GetMapping(path = "/elevador-menos-frequentado")
    public List<Character> elevadorMenosFrequentado() {
        return elevador.elevadorMenosFrequentado();
    }

    @GetMapping(path = "periodo-menor-fluxo-elevador-menos-frequentado")
    public List<Character> periodoMenorFluxoElevadorMenosFrequentado() {
        return elevador.periodoMenorFluxoElevadorMenosFrequentado();
    }

    @GetMapping(path = "periodo-maior-utilizacao-conjunto-elevadores")
    public List<Character> periodoMaiorUtilizacaoConjuntoElevadores() {
        return elevador.periodoMaiorUtilizacaoConjuntoElevadores();
    }

    @GetMapping(path = "percentual-de-uso-elevadorA")
    public float percentualDeUsoElevadorA() {
        return elevador.percentualDeUsoElevadorA();
    }

    @GetMapping(path = "percentual-de-uso-elevadorB")
    public float percentualDeUsoElevadorB() {
        return elevador.percentualDeUsoElevadorB();
    }

    @GetMapping(path = "percentual-de-uso-elevadorC")
    public float percentualDeUsoElevadorC() {
        return elevador.percentualDeUsoElevadorC();
    }

    @GetMapping(path = "percentual-de-uso-elevadorD")
    public float percentualDeUsoElevadorD() {
        return elevador.percentualDeUsoElevadorD();
    }

    @GetMapping(path = "percentual-de-uso-elevadorE")
    public float percentualDeUsoElevadorE() {
        return elevador.percentualDeUsoElevadorE();
    }

    @GetMapping(path = "test2")
    public String test2() {
        return elevador.test2();
    }

}
