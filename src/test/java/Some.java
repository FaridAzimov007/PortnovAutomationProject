import com.codeborne.selenide.Selenide;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Some {

    @Test
    public void somw(){
        Selenide.open("https://onlinemultfilmy.ru/supersemejka/");
    }

    @Test
    public void getRequest(){
        given()
                .contentType(ContentType.JSON)
                .body("{\"username\": \"john.doe\", \"password\": \"secret\"}")
                .when().post("https://reqres.in/create")
                .then().statusCode(201);
    }

    @Test
    void ttt(){
        String[] data = {
                "AEPB", "AERB", "AERO", "AERO", "AERO", "AERO", "AERO", "AERO", "AERO", "AERO",
                "AERP", "AERP", "AERP", "AERP", "AERP", "AERP", "AERS", "AERS", "AERS", "AERS",
                "AERS", "AERS", "AERS", "AERS", "AERS", "AJKT", "AJKT", "AUIJ", "AUIJ", "BAR",
                "BAR", "BAR", "BEAD", "BEAD", "BEAD", "C12A", "C24A", "C4PK", "CAPA", "CAPS",
                "CAPS", "CAPS", "CAPS", "CAPS", "CAPS", "CAPS", "CART", "CART", "CART", "CDPK",
                "CHER", "CHEW", "CHEW", "CONC", "CONC", "CONC", "CONC", "CONC", "CONC", "CONC",
                "CONC", "CP12", "CP24", "CPCR", "CPCW", "CPDR", "CPEA", "CPEC", "CPEP", "CPPK",
                "CPSP", "CREA", "CREA", "CREA", "CREA", "CREA", "CREA", "CREA", "CREA", "CREA",
                "CREA", "CREA", "CRYS", "CRYS", "CRYS", "CRYS", "CS12", "CS24", "CSDR", "CSER",
                "CSPK", "CTKT", "DCHE", "DCHP", "DCHS", "DEVI", "DEVI", "DEVI", "DEVI", "DEVI",
                "DEVI", "DISK", "DISK", "DISK", "DPRH", "ELIX", "EMUL", "EMUL", "EMUL", "EMUL",
                "EMUL", "EMUL", "EMUL", "EMUL", "EMUL", "EMUL", "ENEM", "EXHP", "EXHU", "EXTR",
                "EXTR", "EXTR", "FILM", "FILM", "FILM", "FILM", "FILM", "FILM", "FILM", "FLAK",
                "FOAM", "FOAM", "FOAM", "FOAM", "FOAM", "FOAM", "FOAM", "FOAM", "GAS", "GAS",
                "GEL", "GEL", "GEL", "GEL", "GEL", "GEL", "GEL", "GEL", "GEL", "GEL", "GEL",
                "GEL", "GEL", "GEL", "GEL", "GEL", "GRAN", "GRAN", "GRAN", "GRAN", "GREF", "GUM",
                "GUM", "GUM", "GUM", "GUM", "GUM", "IMPL", "IMPL", "IMPL", "IMPL", "IMPL", "IMPL",
                "IMPL", "IMPL", "IMPL", "INHA", "INHA", "INJ", "INJ", "INJ", "INJ", "INJ", "INJ",
                "INST", "INST", "IUD", "JTAJ", "JTAJ", "JTAJ", "KIT", "KIT", "KIT", "KIT", "KIT",
                "KIT", "KIT", "KIT", "KIT", "KIT", "KIT", "KIT", "KIT", "KIT", "KIT", "KIT", "KIT",
                "KIT", "KIT", "KIT", "KIT", "KIT", "KIT", "KIT", "LEAV", "LEAV", "LIQD", "LIQD",
                "LIQD", "LIQD", "LIQD", "LIQD", "LIQD", "LIQD", "LIQD", "LIQD", "LIQD", "LIQD",
                "LOTN", "LOTN", "LOTN", "LOTN", "LOTN", "LOZG", "LOZG", "LOZG", "LPOP", "LPOP",
                "LQCR", "LQCR", "LQCR", "LQCR", "LQPK", "LQPK", "MISC", "MISC", "MISC", "MISC",
                "MISC", "MISC", "MISC", "MISC", "MISC", "MISC", "MISC", "MISC", "MISC", "NEBU",
                "OCSY", "OIL", "OIL", "OIL", "OIL", "OIL", "OIL", "OIL", "OIL", "OIL", "OIL", "OIL",
                "OINT", "OINT", "OINT", "OINT", "OINT", "OINT", "OINT", "OINT", "OINT", "OINT",
                "OINT", "OINT", "PACK", "PACK", "PACK", "PACK", "PACK", "PACK", "PACK", "PACK",
                "PACK", "PADS", "PADS", "PADS", "PADS", "PDEF", "PEN", "PEN", "PLLT", "PLLT", "PLLT",
                "PLLT", "PLLT", "PLLT", "PLLT", "PNKT", "POWD", "POWD", "POWD", "POWD", "POWD",
                "POWD", "POWD", "POWD", "POWD", "PRSY", "PRSY", "PRSY", "PRSY", "PRSY", "PRSY",
                "PRSY", "PSKT", "PSKT", "PSKT", "PSKT", "PSKT", "PSTE", "PSTE", "PSTE", "PSTE",
                "PSTE", "PSTE", "PT24", "PT24", "PT72", "PTCH", "PTCH", "PTCH", "PTCH", "PTTW",
                "PTWK", "PUDG", "RING", "SHAM", "SHEE", "SHEE", "SHEE", "SHEE", "SOAJ", "SOAJ",
                "SOAJ", "SOCT", "SOCT", "SOCT", "SOLG", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN",
                "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN",
                "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN",
                "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN",
                "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLN", "SOLR", "SOLR", "SOLR",
                "SOLR", "SOLR", "SOLR", "SOLR", "SOLR", "SOLR", "SOLR", "SOLR", "SOLR", "SOLR",
                "SOLR", "SOLR", "SOLR", "SOLR", "SOLR", "SOLR", "SOLR", "SOPK", "SOPK", "SOPK",
                "SOPK", "SOPK", "SOPN", "SOPN", "SOSY", "SOSY", "SOSY", "SOSY", "SOSY", "SOSY",
                "SOSY", "SOSY", "SOSY", "SOSY", "SOSY", "SOTJ", "SPRT", "SPRT", "SPRT", "SRER",
                "SRER", "SRER", "SRER", "SRER", "SRER", "STCK", "STCK", "STRP", "STRP", "STRP",
                "STRP", "STRP", "STRP", "STRP", "SUAJ", "SUAJ", "SUBL", "SUBL", "SUBL", "SUCT",
                "SUER", "SUER", "SUPK", "SUPK", "SUPK", "SUPN", "SUPN", "SUPP", "SUPP", "SUPP",
                "SUPP", "SUSP", "SUSP", "SUSP", "SUSP", "SUSP", "SUSP", "SUSP", "SUSP", "SUSP",
                "SUSP", "SUSP", "SUSP", "SUSP", "SUSP", "SUSP", "SUSP", "SUSP", "SUSP", "SUSP",
                "SUSP", "SUSP", "SUSP", "SUSP", "SUSP", "SUSP", "SUSR", "SUSR", "SUSR", "SUSR",
                "SUSR", "SUSR", "SUSR", "SUSR", "SUSR", "SUSR", "SUSR", "SUSR", "SUSR", "SUSR",
                "SUSR", "SUSR", "SUSR", "SUSR", "SUSR", "SUSY", "SUSY", "SUSY", "SUSY", "SUTJ",
                "SUTJ", "SWAB", "SWAB", "SWAB", "SWAB", "SWAB", "SYRP", "SYRP", "SYRP", "T12A",
                "T24A", "T4PK", "TABA", "TABS", "TABS", "TABS", "TABS", "TABS", "TABS", "TABS",
                "TABS", "TABS", "TAMP", "TAMP", "TAPE", "TAPE", "TAR", "TB12", "TB24", "TB3D",
                "TB3E", "TBCR", "TBCR", "TBDD", "TBDP", "TBDP", "TBDP", "TBDR", "TBEA", "TBEC",
                "TBED", "TBEF", "TBEF", "TBEF", "TBEF", "TBEF", "TBPK", "TBSO", "TBSO", "TBSO",
                "TBSO", "TBSO", "TBSO", "TDSY", "TDSY", "TDSY", "TDSY", "TEPK", "TEST", "TEST",
                "TEST", "TEST", "TEST", "THPK", "THPK", "THPK", "THPK", "THPK", "THPK", "THPK",
                "THPK", "THPK", "TINC", "TINC", "TINC", "TINC", "TPPK", "TROC", "WAFR", "WAFR",
                "WAFR", "WAFR", "WAFR", "WAFR", "WAX", "WHIP", "C2PK", "CEPK", "EXHL", "TDPK",
                "EXHS", "EXHA", "T2PK", "JTKT"
        };
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Integer> duplicateMap = new HashMap<>();
        int totalDuplicates = 0;

        // Подсчет повторений
        for (String item : data) {
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }

        // Выделение повторяющихся записей и подсчет общего количества повторений
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            if (count > 1) {
                duplicateMap.put(entry.getKey(), count);
                totalDuplicates += count;
            }
        }

        // Запись результатов в текстовый файл
        try (FileWriter writer = new FileWriter("output.txt")) {
            // Вывод результатов для повторяющихся записей и запись в файл
            for (Map.Entry<String, Integer> entry : duplicateMap.entrySet()) {
                String item = entry.getKey();
                int count = entry.getValue();
                String result = "Запись: " + item + ", Количество повторений: " + count + "\n";
                System.out.print(result);  // Вывод в консоль
                writer.write(result);     // Запись в файл
            }

            // Вывод общего количества повторений и запись в файл
            String totalResult = "Общее количество повторений: " + totalDuplicates + "\n";
            System.out.print(totalResult);    // Вывод в консоль
            writer.write(totalResult);       // Запись в файл
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


