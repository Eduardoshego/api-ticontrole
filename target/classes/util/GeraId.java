import com.ebstecnologia.api.controle.equipamentos.util;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
import

import java.util.Random;

@Data
@Configuration
@AllArgsConstructor
public class GeradorId {
    private final Cargo cargo;

    private char[] alfabeto = {'0','1','2','3','4','5','6','7','8','9'};
    private int size = 4;

    public String geradorDeId(Cargo cargo){
        if(cargo)
        Random random = new Random();
        return NanoIdUtils.randomNanoId(random,getAlfabeto(),getSize());
    }
}