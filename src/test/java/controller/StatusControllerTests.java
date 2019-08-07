package controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StatusController.class)
public class StatusControllerTests
{
    StatusController statusController;

    @Before
    public void setup()
    {
        statusController = new StatusController();
    }

    @Test
    public void getStatus()
    {
        assertTrue(!statusController.getStatus().isEmpty());
    }
}
