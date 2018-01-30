package сom.manko.cinema.movie.service.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import сom.manko.cinema.movie.service.controller.MovieServiceController;
import сom.manko.cinema.movie.service.manager.MovieManager;

@RunWith(MockitoJUnitRunner.class)
public class MovieControllerTest {

    protected static final Long MOVIE_ID = 4L;

    @InjectMocks
    private MovieServiceController movieServiceController;

    @Mock
    private MovieManager movieManager;

    private MockMvc mockMvc;

    @Before
    public void init() {
        mockMvc = MockMvcBuilders
                .standaloneSetup(movieServiceController)
                .build();
    }

    @Test
    public void shouldReturnUserData() throws Exception {

    }
}
