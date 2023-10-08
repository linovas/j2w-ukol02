package cz.czechitas.java2webapps.ukol2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.nio.charset.StandardCharsets;
import static java.nio.file.Files.readAllLines;

@Controller
class MainController {
    private final Random random = new Random();

    @GetMapping("/")
    public ModelAndView citat() throws IOException {

        List<String> seznamCitatu = List.of("Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.",
             "A user interface is like a joke. If you have to explain it, it's not that good.",
             "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.",
             "I have a joke on programming but it only works on my computer.",
             "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. 127 little bugs in the code…",
             "When I wrote this code, only God & I understood what it did. Now… Only God knows.",
             "Programmer (noun.): A machine that turns coffee into code.",
             "Real programmers count from 0.");

        List<String> seznamPozadi = List.of("OqtafYT5kTw", "4hbJ-eymZ1o", "RFCFhhl3xfQ", "m_HRfLhgABo", "QQ9LainS6tI", "oTcaW8Pqv3U", "9pY2tQBnHIg", "dYEuFB8KQJk");

        int nahodnyCitat = random.nextInt(seznamCitatu.size());
        int nahodnePozadi = random.nextInt(seznamPozadi.size());

        ModelAndView result = new ModelAndView("index");
        result.addObject("vybranyCitat", seznamCitatu.get(nahodnyCitat));
        result.addObject("vybranePozadi", seznamPozadi.get(nahodnePozadi));
        return result;
    }
}