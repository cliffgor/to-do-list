import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

// instantiate task object
   @Test
  public void Task_instantiatesCorrectly_true() {
    Task myTask = new Task("Mow the lawn");
    assertEquals(true, myTask instanceof Task);
  }

// assigns each task a description and retrieves it
   @Test
  public void Task_instantiatesWithDescription_String() {
    Task myTask = new Task("Mow the lawn");
    assertEquals("Mow the lawn", myTask.getDescription());
  }

}