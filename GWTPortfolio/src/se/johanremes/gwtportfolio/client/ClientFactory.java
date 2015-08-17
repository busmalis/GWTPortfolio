package se.johanremes.gwtportfolio.client;

import se.johanremes.gwtportfolio.client.view.desktop.ProfileView;
import se.johanremes.gwtportfolio.client.view.desktop.ProjectsView;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;

public interface ClientFactory {
    EventBus getEventBus();        
    PlaceController getPlaceController();    
    ProfileView getProfileView();    
    ProjectsView getProjectsView();
    
}
