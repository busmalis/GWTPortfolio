package se.johanremes.gwtportfolio.client;

import se.johanremes.gwtportfolio.place.shared.Place.ProfilePlace;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;

public class GWTPortfolio implements EntryPoint{

	private Place defaultPlace;
	private SimplePanel appWidget;

	@Override
	public void onModuleLoad() {
		
		defaultPlace = new ProfilePlace("Profile");
		
		ClientFactory clientFactory = GWT.create(ClientFactory.class);
		EventBus eventBus = clientFactory.getEventBus();
		PlaceController placeController = clientFactory.getPlaceController();
		
		// Start ActivityManager for the main widget with our ActivityMapper
		ActivityMapper activityMapper = new AppActivityMapper(clientFactory);
		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		activityManager.setDisplay(appWidget);
		
		// Start PlaceHistoryHandler with our PlaceHistoryMapper
        AppPlaceHistoryMapper historyMapper= GWT.create(AppPlaceHistoryMapper.class);
        PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		historyHandler.register(placeController, eventBus, defaultPlace);

		// Header
		//DockLayoutPanel dlPanel = new DockLayoutPanel(Unit.EM);		
		//dlPanel.addNorth(new HeaderViewImpl(), 5);
		//dlPanel.add(appWidget);
		RootPanel.get().add(appWidget);
		
       // RootPanel.get().add(appWidget);
        
        // Goes to the place represented on URL else default place
        historyHandler.handleCurrentHistory();
	}

}
