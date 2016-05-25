package db.migration;

import com.runt9.model.Person;
import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class V00003__ReprocessEmailAddresses implements SpringJdbcMigration {
    @Override
    public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
        List<Person> people = jdbcTemplate.query("SELECT * FROM springbootflywaysample.person", new BeanPropertyRowMapper<>(Person.class));
        people
                .stream()
                .filter(person -> person.getEmailAddress().contains("test"))
                .forEach(person -> jdbcTemplate.update("UPDATE springbootflywaysample.person SET email_address = NULL WHERE id = ?", person.getId()));
    }
}
