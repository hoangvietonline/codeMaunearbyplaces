package hoangviet.ndhv.aplicationgooglemapnearbyplaces.Remove;

import hoangviet.ndhv.aplicationgooglemapnearbyplaces.model.MyPlaces;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleAPIService {
    @GET
    Call<MyPlaces> getNearByPlaces(@Url String url);
}
