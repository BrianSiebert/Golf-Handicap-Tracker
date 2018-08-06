package com.techelevator.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GolfController {

	@Autowired
	private ScoreResultDao scoreResultDao;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String showScores(ModelMap modelHolder) {
		modelHolder.put("scores", scoreResultDao.getAllScores());
		return "home";
	}
	@RequestMapping(path = "/", method=RequestMethod.POST)
	public String postNewScore(@RequestParam String name, @RequestParam String golfCourse, @RequestParam int score, @RequestParam int handicap) {
		ScoreResult newScore= new ScoreResult();
		newScore.setName(name);
		newScore.setGolfCourse(golfCourse);
		newScore.setScore(score);
		newScore.setHandicap(handicap);
		scoreResultDao.saveNewScore(newScore);
		return "redirect:/scoreresult;";
	}
	
	@RequestMapping(path="/scoreresult", method=RequestMethod.GET)
	public String showResultsPage(ModelMap modelHolder) {
		modelHolder.put("scores", scoreResultDao.getAllScores());
		return"scoreresult";
	}
}


