package day5.core;

import day5.Google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void sistemeUyelik(String message) {
		

		GoogleManager manager = new GoogleManager();
		manager.uyeKaydý(message);
	}

}
