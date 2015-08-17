package se.johanremes.gwtportfolio.client;

import se.johanremes.gwtportfolio.place.shared.Place.ProfilePlace;
import se.johanremes.gwtportfolio.place.shared.Place.ProjectsPlace;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ProfilePlace.Tokenizer.class, ProjectsPlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper
{
}
