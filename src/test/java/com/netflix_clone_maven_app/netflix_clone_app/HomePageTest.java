package com.netflix_clone_maven_app.netflix_clone_app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}


@SpringBootTest
@AutoConfigureMockMvc
public class HomePageTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldLoadHomePage() throws Exception {

        mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }

    @Test
    public void shouldLoadImage() throws Exception {

        mockMvc.perform(get("/images/logo.png"))
                .andExpect(status().isOk());
    }

    @Test
    public void shouldLoadCss() throws Exception {

        mockMvc.perform(get("/css/style.css"))
                .andExpect(status().isOk());
    }
}