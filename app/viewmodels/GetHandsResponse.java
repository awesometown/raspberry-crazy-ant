package viewmodels;

import java.util.List;

public class GetHandsResponse {
	public List<HandViewModel> hands;

	public GetHandsResponse(List<HandViewModel> hands) {
		this.hands = hands;
	}
}
