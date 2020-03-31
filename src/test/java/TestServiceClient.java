import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import com.scryfall.*;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Test
    public void testScryfallJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.scryfall.com/cards/search?q=mizzix");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Response responseList = mapper.readValue(response, Response.class);
        List<DataItem> cardList = responseList.getData();
        DataItem firstCard = cardList.get(0);
        String expectedName = "Mizzix of the Izmagnus";
        assertEquals(expectedName, firstCard.getName());
        logger.info(firstCard.toString());
    }
}