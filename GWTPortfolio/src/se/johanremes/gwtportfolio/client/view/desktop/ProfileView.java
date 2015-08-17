package se.johanremes.gwtportfolio.client.view.desktop;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface ProfileView extends IsWidget{
	void setName(String temp);
    void setPresenter(Presenter presenter);

    public interface Presenter {
        void goTo(Place place);
    }
}
