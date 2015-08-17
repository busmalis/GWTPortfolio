package se.johanremes.gwtportfolio.client;

import se.johanremes.gwtportfolio.client.view.desktop.ProfileView;
import se.johanremes.gwtportfolio.client.view.desktop.ProfileViewImpl;
import se.johanremes.gwtportfolio.client.view.desktop.ProjectsView;
import se.johanremes.gwtportfolio.client.view.desktop.ProjectsViewImpl;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;

public class ClientFactoryImpl implements ClientFactory {

	private final EventBus eventBus = new SimpleEventBus();
	private final PlaceController placeController = new PlaceController(eventBus);
	private final ProfileView profileView = new ProfileViewImpl();
	private final ProjectsView projectsView = new ProjectsViewImpl();
	
	public EventBus getEventBus() {
		return eventBus;
	}
	public PlaceController getPlaceController() {
		return placeController;
	}
	public ProfileView getProfileView() {
		return profileView;
	}
	public ProjectsView getProjectsView() {
		return projectsView;
	}
	

}
