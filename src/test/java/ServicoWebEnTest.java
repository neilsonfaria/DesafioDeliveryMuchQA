import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class ServicoWebEnTest {

    @Before
    public void setUp() {
        // Configurações Rest-Assured
        baseURI = "http://challengeqa.staging.devmuch.io";
        port = 80;
        basePath = "/en";
    }

    @Test
    public void testEnNumeroDentroDoIntervaloSuperiorRetornaSucesso(){
        given().
                contentType(ContentType.JSON).
        when().
                get("/9999").
        then().
                assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .body("full", equalTo("nine thousand, nine hundred and ninety-nine"));
    }

    @Test
    public void testEnNumeroLimiteSuperiorRetornaSucesso(){
        given().
                contentType(ContentType.JSON).
        when().
                get("/10000").
        then().
                assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .body("full", equalTo("ten thousand"));
    }

    @Test
    public void testEnNumeroForaDoIntervaloSuperiorRetornaInvalidData(){
        given().
                contentType(ContentType.JSON).
        when().
                get("/10001").
        then().
                assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(400)
                    .body("full", equalTo("Invalid data"));
    }

    @Test
    public void testEnNumeroDentroDoIntervaloInferiorRetornaSucesso(){
        given().
                contentType(ContentType.JSON).
        when().
                get("/-9999").
        then().
                assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .body("full", equalTo("minus nine thousand, nine hundred and ninety-nine"));
    }

    @Test
    public void testEnNumeroLimiteInferiorRetornaSucesso(){
        given().
                contentType(ContentType.JSON).
        when().
                get("/-10000").
        then().
                assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .body("full", equalTo("minus ten thousand"));
    }

    @Test
    public void testEnNumeroForaDoIntervaloInferiorRetornaInvalidData(){
        given().
                contentType(ContentType.JSON).
        when().
                get("/-10001").
        then().
                assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(400)
                    .body("full", equalTo("Invalid data"));
    }
}
