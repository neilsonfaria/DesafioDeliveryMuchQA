import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ServicoWebTest {

    @Before
    public void setUp(){
        // Configurações Rest-Assured
        baseURI = "http://challengeqa.staging.devmuch.io";
        port = 80;
    }

    @Test
    public void testNumeroDentroDoIntervaloSuperiorRetornaSucesso() {
        given().
                contentType(ContentType.JSON).
        when().
                get("/9999").
        then().
                assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .body("extenso", equalTo("nove mil novecentos e noventa e nove"));
    }

    @Test
    public void testNumeroLimiteSuperiorRetornaSucesso(){
        given().
                contentType(ContentType.JSON).
        when().
                get("/10000").
        then().
                assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .body("extenso", equalTo("dez mil"));
    }

    @Test
    public void testNumeroForaDoIntervaloSuperiorRetornaInvalidData(){
        given().
                contentType(ContentType.JSON).
        when().
                get("/10001").
        then().
                assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(400)
                    .body("extenso", equalTo("Invalid data"));
    }

    @Test
    public void testNumeroDentroDoIntervaloInferiorRetornaSucesso(){
        given().
                contentType(ContentType.JSON).
        when().
                get("/-9999").
        then().
                assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .body("extenso", equalTo("menos nove mil novecentos e noventa e nove"));
    }

    @Test
    public void testNumeroLimiteInferiorRetornaSucesso(){
        given().
                contentType(ContentType.JSON).
        when().
                get("/-10000").
        then().
                assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(200)
                    .body("extenso", equalTo("menos dez mil"));
    }

    @Test
    public void testNumeroForaDoIntervaloInferiorRetornaInvalidData(){
        given().
                contentType(ContentType.JSON).
        when().
                get("/-10001").
        then().
                assertThat()
                    .contentType(ContentType.JSON)
                    .statusCode(400)
                    .body("extenso", equalTo("Invalid data"));
    }
}
