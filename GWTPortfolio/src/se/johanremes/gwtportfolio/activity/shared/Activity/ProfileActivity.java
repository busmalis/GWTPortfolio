package se.johanremes.gwtportfolio.activity.shared.Activity;

import se.johanremes.gwtportfolio.client.ClientFactory;
import se.johanremes.gwtportfolio.client.view.desktop.ProfileView;
import se.johanremes.gwtportfolio.place.shared.Place.ProfilePlace;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class ProfileActivity extends AbstractActivity implements
		ProfileView.Presenter {

	// Used to obtain views, eventBus, placeController
	// Alternatively, could be injected via GIN
	private ClientFactory clientFactory;
	// Name that will be appended to "Hello,"
	private String name;

	public ProfileActivity(ProfilePlace place, ClientFactory clientFactory) {
		this.name = place.getHelloName();
		this.clientFactory = clientFactory;
	}

	/**
	 * Invoked by the ActivityManager to start a new Activity
	 */
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		ProfileView profileView = clientFactory.getProfileView();
		profileView.setName(name);
		profileView.setPresenter(this);
		panel.setWidget(profileView.asWidget());
	}

	/**
     * Ask user before stopping this activity
     */
    @Override
    public String mayStop() {
        return "Please hold on. This activity is stopping.";
    }

    /**
     * Navigate to a new Place in the browser
     */
    public void goTo(Place place) {
        clientFactory.getPlaceController().goTo(place);
    }

}
