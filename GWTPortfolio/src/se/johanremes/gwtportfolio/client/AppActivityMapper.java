package se.johanremes.gwtportfolio.client;

import se.johanremes.gwtportfolio.activity.shared.Activity.ProfileActivity;
import se.johanremes.gwtportfolio.activity.shared.Activity.ProjectsActivity;
import se.johanremes.gwtportfolio.place.shared.Place.ProfilePlace;
import se.johanremes.gwtportfolio.place.shared.Place.ProjectsPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class AppActivityMapper implements ActivityMapper {

	private ClientFactory clientFactory;

	public AppActivityMapper(ClientFactory clientFactory) {
		super();
        this.clientFactory = clientFactory;
	}

	@Override
    public Activity getActivity(Place place) {
        if (place instanceof ProfilePlace)
            return new ProfileActivity((ProfilePlace) place, clientFactory);
        else if (place instanceof ProjectsPlace)
            return new ProjectsActivity((ProjectsPlace) place, clientFactory);
        return null;
    }

}
