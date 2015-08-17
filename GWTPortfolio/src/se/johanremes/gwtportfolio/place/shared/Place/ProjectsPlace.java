package se.johanremes.gwtportfolio.place.shared.Place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class ProjectsPlace extends Place {

	private String helloName;

    public ProjectsPlace(String token) {
        this.helloName = token;
    }

    public String getHelloName() {
        return helloName;
    }

    public static class Tokenizer implements PlaceTokenizer<ProjectsPlace> {
        @Override
        public String getToken(ProjectsPlace place) {
            return place.getHelloName();
        }

        @Override
        public ProjectsPlace getPlace(String token) {
            return new ProjectsPlace(token);
        }
    }
}
