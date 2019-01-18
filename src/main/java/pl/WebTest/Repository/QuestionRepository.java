package pl.WebTest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.WebTest.Model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
