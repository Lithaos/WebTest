package pl.WebTest.Controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.WebTest.Model.Category;
import pl.WebTest.Model.Question;
import pl.WebTest.Repository.CategoryRepository;
import pl.WebTest.Repository.QuestionRepository;

@Controller
public class MainController {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@RequestMapping("/")
	private String main(Model model) {
		if (questionRepository.count() == 0) {
			categoryRepository.save(new Category("Podstawy"));
			questionRepository.save(new Question("Jaka jest różnica pomiędzy Set a List?", "Podstawy",
					"List może zawierać duplikaty, Set nie zawiera duplikatów",
					"List zawiera elementy posortowane a Set ich nie sortuje",
					"Nie ma znaczącej różnicy, kwestia jaka jest implementacja", "Stos może mieć tylko 10 elementów",
					"List może zawierać duplikaty, Set nie zawiera duplikatów", "http://testykwalifikacyjne.pl"));

			questionRepository.save(new Question("Co oznacza słowo polimorfizm?", "Podstawy",
					"Cecha dzięki której jeden interfejs może być stosowany do wykonania różnych zadań",
					"Mówi, że klasy mogą dziedziczyć z wielu innych klas",
					"Oznacza, że dany obiekt może całkowicie zmienić swoje zachowanie w klasie dziedziczącej",
					"Inna nazwa JavaScriptu",
					"Cecha dzięki której jeden interfejs może być stosowany do wykonania różnych zadań",
					"http://testykwalifikacyjne.pl"));

			questionRepository.save(new Question("Jaki interfejs wykorzystywany jest do porównywania dwóch obiektów?",
					"Podstawy", "CompareTo", "Equals", "Comparable", "Same", "Comparable",
					"http://testykwalifikacyjne.pl"));
		}
		return "home";
	}

	@RequestMapping(value = "/random", method = RequestMethod.GET)
	private String randomQuestion(Model model) {
		Random generator = new Random();
		List<Question> questions = questionRepository.findAll();
		model.addAttribute("randomQuestion", questions.get(generator.nextInt(questions.size())));
		return "random";
	}

	@RequestMapping(value = "/random", method = RequestMethod.POST)
	private String randomQuestion() {

		return "randomAnswer";
	}
}
