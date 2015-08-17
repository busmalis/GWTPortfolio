package se.johanremes.gwtportfolio.place.shared.Place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class ProfilePlace extends Place {

	private String helloName;

    public ProfilePlace(String token) {
        this.helloName = token;
    }

    public String getHelloName() {
        return helloName;
    }

    public static class Tokenizer implements PlaceTokenizer<ProfilePlace> {
        @Override
        public String getToken(ProfilePlace place) {
            return place.getHelloName();
        }

        @Override
        public ProfilePlace getPlace(String token) {
            return new ProfilePlace(token);
        }
    }
}
