package pl.project.jobScrapper.offersFromPracuj;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class OffersFromPracuj {

    public String extractPage() throws IOException {
        String htmlAddress = "https://it.pracuj.pl/praca";
        Document doc = Jsoup.connect(htmlAddress).get();
        return doc.toString();

    }
}
