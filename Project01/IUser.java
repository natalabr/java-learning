import java.time.LocalDate;
import java.time.Period;

public interface IUser {

    void setAge(LocalDate dateOfBirth);

    String hello();
}
