package com.gotreaux.site.exception;

import static org.hamcrest.Matchers.containsString;

import java.util.Random;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class GlobalExceptionHandlerTest {

    @Autowired private MockMvc mockMvc;

    @Test
    public void handleException() throws Exception {
        Random random = new Random();

        String urlTemplate =
                random.ints(97, 122)
                        .limit(8)
                        .collect(
                                StringBuilder::new,
                                StringBuilder::appendCodePoint,
                                StringBuilder::append)
                        .toString();

        String errorMessage = String.format("No static resource %s", urlTemplate);

        mockMvc.perform(MockMvcRequestBuilders.get("/" + urlTemplate).accept(MediaType.TEXT_HTML))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("error"))
                .andExpect(MockMvcResultMatchers.content().string(containsString(errorMessage)));
    }
}
